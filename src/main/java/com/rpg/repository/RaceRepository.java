package com.rpg.repository;

import com.rpg.model.RaceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RaceRepository extends JpaRepository<RaceModel, UUID>, JpaSpecificationExecutor<RaceModel> {
}
