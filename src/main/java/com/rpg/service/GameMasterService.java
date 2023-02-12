package com.rpg.service;

import com.rpg.model.GameMasterModel;
import com.rpg.model.UserModel;
import com.rpg.repository.GameMasterRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class GameMasterService {
    final GameMasterRepository gameMasterRepository;

    public GameMasterService(GameMasterRepository gameMasterRepository) {
        this.gameMasterRepository = gameMasterRepository;
    }

    @Transactional
    public GameMasterModel save(GameMasterModel gameMaster) {
        return gameMasterRepository.save(gameMaster);
    }

}
