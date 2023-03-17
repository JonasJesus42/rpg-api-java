package com.rpg.repository;

import com.rpg.model.StatsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StatsRepository extends JpaRepository<StatsModel, UUID>, JpaSpecificationExecutor<StatsModel> {

}
