package com.rpg.controller;

import com.rpg.dto.EquipmentsDTO;
import com.rpg.dto.PlayersDto;
import com.rpg.dto.StatsDto;
import com.rpg.model.EquipmentsModel;
import com.rpg.model.PlayersModel;
import com.rpg.model.StatsModel;
import com.rpg.repository.PlayersRepository;
import com.rpg.service.PlayersService;
import com.rpg.service.StatsService;
import com.rpg.service.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/player")
public class PlayersController {
    final PlayersService playersService;
    private final PlayersRepository playersRepository;
    private final StatsService statsService;

    private final EquipmentService equipmentsService;

    public PlayersController(PlayersService playersService, PlayersRepository playersRepository, StatsService statsService, EquipmentService equipmentsService) {
        this.playersService = playersService;
        this.playersRepository = playersRepository;
        this.statsService = statsService;
        this.equipmentsService = equipmentsService;
    }

    @GetMapping
    public ResponseEntity<Page<PlayersModel>> getAllPlayers(@PageableDefault Pageable pageable) {
        var players = playersService.findAll(pageable);
        return ResponseEntity.status(HttpStatus.OK).body(players);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable(value = "id") UUID id) {
        Optional<PlayersModel> playerOptional = playersService.findById(id);

        if(playerOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT_FOUND: Player not found");
        }

        return ResponseEntity.status(HttpStatus.OK).body(playerOptional.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePlayer(@PathVariable(value = "id") UUID id, @RequestBody @Valid PlayersDto playerDto) {

        Optional<PlayersModel> playerOptional = playersService.findById(id);
        if (playerOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT_FOUND: Player not found");
        }

        var playerModel = new PlayersModel();
        BeanUtils.copyProperties(playerDto, playerModel);
        playerModel.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(playersService.save(playerModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePlayer(@PathVariable(value = "id") UUID id) {
        Optional<PlayersModel> playerOptional = playersService.findById(id);
        if (playerOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT_FOUND: Player not found");
        }

        playersRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Player deleted successfully");
    }

    @PostMapping("/{id}/stats")
    public ResponseEntity<Object> create(@RequestBody @Valid StatsDto statsDTO, @PathVariable UUID id) {
        Optional<PlayersModel> playerOptional = playersService.findById(id);
        if (playerOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT_FOUND: Player not found");
        }

        if (playerOptional.get().getStatsModel() != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CONFLICT: Player already has stats");
        }

        var statsModel = new StatsModel();
        var player = playerOptional.get();
        BeanUtils.copyProperties(statsDTO, statsModel);
        statsModel.setPlayersModel(player);
        player.setStatsModel(statsModel);
        playersService.save(player);
        return ResponseEntity.status(HttpStatus.CREATED).body(statsService.save(statsModel));
    }

    @PostMapping("/{id}/equipment")
    public ResponseEntity<Object> create(@RequestBody @Valid EquipmentsDTO equipmentsDTO, @PathVariable UUID id) {
        Optional<PlayersModel> playerOptional = playersService.findById(id);
        if (playerOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT_FOUND: Player not found");
        }

        if (playerOptional.get().getEquipmentsModel() != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CONFLICT: Player already has equipments");
        }

        var equipmentsModel = new EquipmentsModel();
        var player = playerOptional.get();
        BeanUtils.copyProperties(equipmentsDTO, equipmentsModel);
        equipmentsModel.setPlayersModel(player);
        player.setEquipmentsModel(equipmentsModel);
        playersService.save(player);
        return ResponseEntity.status(HttpStatus.CREATED).body(equipmentsService.save(equipmentsModel));
    }
}
