package com.rpg.service;

import com.rpg.model.StatsModel;
import com.rpg.repository.StatsRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StatsServices {
    final StatsRepository statsRepository;

    public StatsServices(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    public void deleteAll() {
        statsRepository.deleteAll();
    }
    
}
