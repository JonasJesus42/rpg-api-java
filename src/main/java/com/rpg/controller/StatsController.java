package com.rpg.controller;

import com.rpg.dto.StatsDto;
import com.rpg.model.StatsModel;
import com.rpg.service.StatsService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/stats")
public class StatsController {

    private final StatsService statsService;

    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable UUID id) {
        var stats = statsService.findById(id);
        if (stats.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT_FOUND: Stats not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(stats.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable UUID id, @RequestBody @Valid StatsDto statsDTO) {
        var stats = statsService.findById(id);
        if (stats.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT_FOUND: Stats not found");
        }
        var statsModel = new StatsModel();
        BeanUtils.copyProperties(statsDTO, statsModel);
        statsModel.setId(id);

        return ResponseEntity.status(HttpStatus.OK).body(new Object[]{statsService.save(statsModel), statsDTO});
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable UUID id) {
        var stats = statsService.findById(id);
        if (stats.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        statsService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}