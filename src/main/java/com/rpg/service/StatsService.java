package com.rpg.service;

import com.rpg.model.StatsModel;
import com.rpg.repository.StatsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class StatsService {
    final StatsRepository statsRepository;

    public StatsService(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    public Optional<StatsModel> findById(UUID id) {
        return statsRepository.findById(id);
    }

    public void deleteAll() {
        statsRepository.deleteAll();
    }

    public Object save(StatsModel statsModel) {
        return statsRepository.save(statsModel);
    }

    public void deleteById(UUID id) {
        statsRepository.deleteById(id);
    }
}
