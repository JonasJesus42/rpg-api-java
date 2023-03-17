package com.rpg.model;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_stats", schema = "rpg_generator")
public class StatsModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(mappedBy = "statsModel", cascade = CascadeType.ALL)
    private PlayersModel playersModel;

    @Column(name = "strength", nullable = false)
    private Integer strength;

    @Column(name = "dexterity", nullable = false)
    private Integer dexterity;

    @Column(name = "constitution", nullable = false)
    private Integer constitution;

    @Column(name = "intelligence", nullable = false)
    private Integer intelligence;

    @Column(name = "wisdom", nullable = false)
    private Integer wisdom;

    @Column(name = "charisma", nullable = false)
    private Integer charisma;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public PlayersModel getPlayersModel() {
        return playersModel;
    }

    public void setPlayersModel(PlayersModel playersModel) {
        this.playersModel = playersModel;
    }

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