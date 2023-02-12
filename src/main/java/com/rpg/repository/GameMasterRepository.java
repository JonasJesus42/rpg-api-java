package com.rpg.repository;

import com.rpg.model.GameMasterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GameMasterRepository extends JpaRepository<GameMasterModel, UUID>, JpaSpecificationExecutor<GameMasterModel> {

}