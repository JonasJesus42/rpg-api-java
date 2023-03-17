package com.rpg.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EquipmentsDTO {

    @NotNull(message = "Name is required")
    private Number cp;

    @NotNull(message = "Description is required")
    private Number sp;

    @NotNull(message = "Hit dice is required")
    private Number ep;

    @NotNull(message = "Proficiency is required")
    private Number gp;

    @NotNull(message = "Proficiency is required")
    private Number pp;

    @NotNull(message = "Proficiency is required")
    private String description;

    public Number getCp() {
        return cp;
    }

    public void setCp(Number cp) {
        this.cp = cp;
    }

    public Number getSp() {
        return sp;
    }

    public void setSp(Number sp) {
        this.sp = sp;
    }

    public Number getEp() {
        return ep;
    }

    public void setEp(Number ep) {
        this.ep = ep;
    }

    public Number getGp() {
        return gp;
    }

    public void setGp(Number gp) {
        this.gp = gp;
    }

    public Number getPp() {
        return pp;
    }

    public void setPp(Number pp) {
        this.pp = pp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
