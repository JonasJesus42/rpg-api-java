package com.rpg.service;

import com.rpg.model.PlayersModel;
import com.rpg.model.UserModel;
import com.rpg.repository.PlayersRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

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

    public Page<PlayersModel> findAll(Pageable pageable) {
        return playersRepository.findAll(pageable);
    }

    public Optional<PlayersModel> findById(UUID id) {
        return playersRepository.findById(id);
    }
}
