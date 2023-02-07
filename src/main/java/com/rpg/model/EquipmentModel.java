package com.rpg.model;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "tb_equipment", schema = "rpg_generator")
@Entity
public class EquipmentModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(mappedBy = "equipment")
    private PlayerModel player;

    @Column(name = "copperPoints", length = 4)
    private int copperPoints;

    @Column(name = "silverPoints", length = 4)
    private int silverPoints;

    @Column(name = "electrumPoints", length = 4)
    private int electrumPoints;

    @Column(name = "goldPoints", length = 4)
    private int goldPoints;

    @Column(name = "platinumPoints", length = 4)
    private int platinumPoints;

    public int getCopperPoints() {
        return copperPoints;
    }

    public void setCopperPoints(int copperPoints) {
        this.copperPoints = copperPoints;
    }

    public int getSilverPoints() {
        return silverPoints;
    }

    public void setSilverPoints(int silverPoints) {
        this.silverPoints = silverPoints;
    }

    public int getElectrumPoints() {
        return electrumPoints;
    }

    public void setElectrumPoints(int electrumPoints) {
        this.electrumPoints = electrumPoints;
    }

    public int getGoldPoints() {
        return goldPoints;
    }

    public void setGoldPoints(int goldPoints) {
        this.goldPoints = goldPoints;
    }

    public int getPlatinumPoints() {
        return platinumPoints;
    }

    public void setPlatinumPoints(int platinumPoints) {
        this.platinumPoints = platinumPoints;
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
