package com.rpg.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_game_master", schema = "rpg_generator")
public class GameMasterModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

//    @OneToMany(mappedBy = "gameMaster")
//    private List<PlayerModel> player;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private  UserModel user;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastname")
    private String gameName;

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

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

//    public List<PlayerModel> getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(List<PlayerModel> player) {
//        this.player = player;
//    }
}
