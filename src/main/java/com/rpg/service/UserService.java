package com.rpg.service;

import com.rpg.model.UserModel;
import com.rpg.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;


@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public Page<UserModel> findAll(HashMap<String, Object> filters, Pageable pageable) {
        return userRepository.filter(filters, pageable);
    }

    public Optional<UserModel> findById(UUID id) {
        var user = userRepository.findById(id);
        return user.filter(UserModel::isActive);
    }

    @Transactional
    public void delete(UserModel userModel) {
        userRepository.save(userModel);
    }
}
