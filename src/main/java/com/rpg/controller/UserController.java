package com.rpg.controller;

import com.rpg.dto.PlayersDto;
import com.rpg.dto.UserDto;
import com.rpg.model.PlayersModel;
import com.rpg.model.UserModel;
import com.rpg.service.PlayersService;
import com.rpg.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/user")
public class UserController {
    final UserService userService;
    private final PlayersService playersService;

    public UserController(UserService userService, PlayersService playersService) {
        this.userService = userService;
        this.playersService = playersService;
    }

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody @Valid UserDto userDto) {
        if(userService.existsByEmail(userDto.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CONFLICT: Email already exists");
        }
        var userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);
        userModel.setRegisterDate(LocalDateTime.now(ZoneId.of("UTC")));
        userModel.setActive(true);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }

    @GetMapping
    public ResponseEntity<Page<UserModel>> getAllUsers(@PageableDefault Pageable pageable) {
        HashMap<String, Object> filters = new HashMap<>();

        var users = userService.findAll(filters, pageable);
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable(value = "id") UUID id) {
        Optional<UserModel> userOptional = userService.findById(id);

        if(userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND: User not found");
        }

        return ResponseEntity.status(HttpStatus.OK).body(userOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable(value = "id" ) UUID id) {
        Optional<UserModel> userOptional = userService.findById(id);
        if(userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND: User not found");
        }

        var userModel = userOptional.get();
        userModel.setActive(false);
        userService.delete(userModel);
        return ResponseEntity.status(HttpStatus.OK).body("User deleted successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable(value = "id") UUID id,
                                             @RequestBody @Valid UserDto userDto){
        Optional<UserModel> userOptional = userService.findById(id);
        if(userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND: User not found");
        }

        var userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);
        userModel.setId(userOptional.get().getId());
        userModel.setRegisterDate(userOptional.get().getRegisterDate());
        userModel.setActive(userOptional.get().isActive());
        return ResponseEntity.status(HttpStatus.OK).body(userService.save(userModel));
    }

    @PostMapping("/{id}/players")
    public ResponseEntity<Object> createPlayer(@PathVariable(value = "id") UUID id, @RequestBody @Valid PlayersDto playerDto) {
        Optional<UserModel> userOptional = userService.findById(id);
        if(userOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("NOT FOUND: User not found");
        }

        var userModel = userOptional.get();
        var playerModel = new PlayersModel();
        BeanUtils.copyProperties(playerDto, playerModel);
        playerModel.setUser(userModel);

        if (userModel.getPlayers().size() >= 6) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: Maximum number of players reached (6)");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(playersService.save(playerModel));
    }
}
