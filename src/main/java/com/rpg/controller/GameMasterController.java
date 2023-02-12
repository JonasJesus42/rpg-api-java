package com.rpg.controller;

import com.rpg.dto.GameMasterDto;
import com.rpg.model.GameMasterModel;
import com.rpg.model.UserModel;
import com.rpg.repository.GameMasterRepository;
import com.rpg.service.GameMasterService;
import com.rpg.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/game-master")
public class GameMasterController {
    final GameMasterService gameMasterService;
    final UserService userService;
    private final GameMasterRepository gameMasterRepository;

    public GameMasterController(GameMasterService gameMasterService, UserService userService, GameMasterRepository gameMasterRepository) {
        this.gameMasterService = gameMasterService;
        this.userService = userService;
        this.gameMasterRepository = gameMasterRepository;
    }

    @PostMapping("/{id}")
    public ResponseEntity<GameMasterModel> createGameMaster(@RequestBody @Valid GameMasterDto gameMasterDto, @PathVariable(value = "id") UUID id) {
        Optional<UserModel> userModel = userService.findById(id);
        if (userModel.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

            GameMasterModel gameMasterModel = new GameMasterModel();
            gameMasterModel.setGameName(gameMasterDto.getGameName());
            gameMasterModel.setUser(userModel.get());
        return ResponseEntity.status(HttpStatus.CREATED).body(gameMasterService.save(gameMasterModel));
    }
}
