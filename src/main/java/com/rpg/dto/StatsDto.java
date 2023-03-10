package com.rpg.dto;

import jakarta.validation.constraints.NotNull;

public class StatsDto {
    @NotNull(message = "Strength is required")
    private Integer strength;

    @NotNull(message = "Dexterity is required")
    private Integer dexterity;

    @NotNull(message = "Constitution is required")
    private Integer constitution;

    @NotNull(message = "Intelligence is required")
    private Integer intelligence;

    @NotNull(message = "Wisdom is required")
    private Integer wisdom;

    @NotNull(message = "Charisma is required")
    private Integer charisma;

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }
}
