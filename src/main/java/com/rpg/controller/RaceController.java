package com.rpg.controller;

import com.rpg.model.RaceModel;
import com.rpg.repository.RaceRepository;
import com.rpg.service.RaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/races")
public class RaceController {

    final RaceService raceService;

    public RaceController(RaceService raceService, RaceRepository raceRepository) {
        this.raceService = raceService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<RaceModel>> getById(@PathVariable UUID id) {
      var race = raceService.findById(id);
      return ResponseEntity.status(HttpStatus.OK).body(race);
    }

    @GetMapping
    public ResponseEntity<List<RaceModel>> getAll() {
        List<RaceModel> races = raceService.findAll();
        return ResponseEntity.ok().body(races);
    }
}