package com.rpg.service;

import com.rpg.model.RaceModel;
import com.rpg.repository.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RaceService {
    final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public Optional<RaceModel> findById(UUID id) {
        return raceRepository.findById(id);
    }

    public List<RaceModel> findAll() {
        return raceRepository.findAll();
    }
}
