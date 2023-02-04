package com.rpg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "tb_race", schema = "rpg_generator")
public class RaceModel {
    @Column(name = "nameRace")
    private String nameRace;

    @Column(name = "selectedRace", insertable = false, updatable = false)
    private Boolean selectedRace;

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
