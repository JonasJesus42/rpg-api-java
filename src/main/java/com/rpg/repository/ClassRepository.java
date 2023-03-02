package com.rpg.repository;

import com.rpg.model.ClassModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClassRepository extends JpaRepository<ClassModel, UUID>, JpaSpecificationExecutor<ClassModel> {
}
