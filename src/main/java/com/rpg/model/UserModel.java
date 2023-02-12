package com.rpg.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_user", schema = "rpg_generator")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(mappedBy = "user")
    private GameMasterModel gameMasters;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastname;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false)
    private boolean active;

    @Column(nullable = false)
    private LocalDateTime registerDate;

    public GameMasterModel getGameMasters() {
        return gameMasters;
    }

    public void setGameMasters(GameMasterModel gameMasters) {
        this.gameMasters = gameMasters;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }
    public LocalDateTime getRegisterDate() {
        return this.registerDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
