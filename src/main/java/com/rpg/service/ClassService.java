package com.rpg.service;

import com.rpg.model.ClassModel;
import com.rpg.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClassService {
    final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }


    public Optional<ClassModel> findById(UUID id) {
        return classRepository.findById(id);
    }

    public List<ClassModel> findAll() {
        return classRepository.findAll();
    }
}
