package com.rpg.model;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "tb_status", schema = "rpg_generator")
@Entity
public class StatusModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(mappedBy = "status")
    private PlayerModel player;

    @Column(name = "nameStatus")
    private String nameStatus;

    @Column(name = "selectedStatus", insertable = false, updatable = false)
    private Boolean selectedStatus;

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public Boolean getSelectedStatus() {
        return selectedStatus;
    }

    public void setSelectedStatus(Boolean selectedStatus) {
        this.selectedStatus = selectedStatus;
    }

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
}