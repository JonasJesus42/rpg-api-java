package com.rpg.repository;

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
public interface UserRepository extends JpaRepository<UserModel, UUID>, JpaSpecificationExecutor<UserModel> {

    boolean existsByEmail(String email);

    public default Page<UserModel> filter(HashMap<String, Object> filters, Pageable pageable){
        Specification<UserModel> spec = Specification.where(null);
        for (String key : filters.keySet()) {
            spec = spec.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(key), filters.get(key)));
        }
        return this.findAll(spec, pageable);
    }
}

