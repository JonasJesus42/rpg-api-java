package com.rpg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "tb_equipment", schema = "rpg_generator")
public class EquipmentModel {

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
}
