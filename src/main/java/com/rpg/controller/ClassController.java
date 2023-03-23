package com.rpg.controller;

import com.rpg.model.ClassModel;
import com.rpg.service.ClassService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/classes")
public class ClassController {

    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping
    public ResponseEntity<List<ClassModel>> getAllClasses() {
        List<ClassModel> classes = classService.findAll();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassModel> getClassById(@PathVariable("id") UUID id) {
        ClassModel classModel = classService.findById(id).orElse(null);
        return new ResponseEntity<>(classModel, HttpStatus.OK);
    }
}
