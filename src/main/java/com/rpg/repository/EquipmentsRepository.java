package com.rpg.repository;

import com.rpg.model.EquipmentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface EquipmentsRepository extends JpaRepository<EquipmentsModel, UUID>, JpaSpecificationExecutor<EquipmentsModel> {

}
