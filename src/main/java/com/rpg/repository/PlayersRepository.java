package com.rpg.repository;

import com.rpg.model.PlayersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayersRepository extends JpaRepository<PlayersModel, UUID>, JpaSpecificationExecutor<PlayersModel> {

}
