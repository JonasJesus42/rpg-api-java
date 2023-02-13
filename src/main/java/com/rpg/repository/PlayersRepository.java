package com.rpg.repository;

import com.rpg.model.PlayersModel;
import com.rpg.model.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public interface PlayersRepository extends JpaRepository<PlayersModel, UUID>, JpaSpecificationExecutor<PlayersModel> {

}
