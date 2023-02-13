package com.rpg.service;

import com.rpg.model.PlayersModel;
import com.rpg.repository.PlayersRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlayersService {
    final PlayersRepository playersRepository;

    public PlayersService(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }

    @Transactional
    public PlayersModel save(PlayersModel playersModel) {
        return playersRepository.save(playersModel);
    }
}
