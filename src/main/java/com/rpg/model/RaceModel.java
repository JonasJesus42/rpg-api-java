package com.rpg.model;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "tb_race", schema = "rpg_generator")
@Entity
public class RaceModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "id_player")
    private PlayerModel player;

    @Column(name = "name_race")
    private String nameRace;

    @Column(name = "selected_race", insertable = false, updatable = false)
    private Boolean selectedRace;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public void setPlayer(PlayerModel player) {
        this.player = player;
    }

    public String getNameRace() {
        return nameRace;
    }

    public void setNameRace(String nameRace) {
        this.nameRace = nameRace;
    }

    public Boolean getSelectedRace() {
        return selectedRace;
    }

    public void setSelectedRace(Boolean selectedRace) {
        this.selectedRace = selectedRace;
    }
}
