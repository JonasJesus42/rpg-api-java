package com.rpg.repository;

import com.rpg.model.UserModel;
import jakarta.persistence.metamodel.MapAttribute;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID>, JpaSpecificationExecutor<UserModel> {

    boolean existsByEmail(String email);

    public static Specification<UserModel> filter(HashMap<String, Object> filters) {
        return Specification.where((root, query, builder) -> {
            for (String key : filters.keySet()) {
                if (root.getModel().getAttributes().contains(root.getModel().getAttribute(key))) {
                    query.where(builder.equal(root.get(key), filters.get(key)));
                }
            }
            return null;
        });
    }
}

