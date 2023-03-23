package com.rpg.model;

import java.io.Serializable;
import java.util.UUID;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_class", schema = "rpg_generator")
public class ClassModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "hit_dice", nullable = false)
    private Integer hitDice;

    @Column(name = "primary_ability", nullable = false)
    private String primaryAbility;

    @Column(name = "saving_throw_1", nullable = false)
    private String savingThrow1;

    @Column(name = "saving_throw_2", nullable = false)
    private String savingThrow2;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHitDice() {
        return hitDice;
    }

    public void setHitDice(Integer hitDice) {
        this.hitDice = hitDice;
    }

    public String getPrimaryAbility() {
        return primaryAbility;
    }

    public void setPrimaryAbility(String primaryAbility) {
        this.primaryAbility = primaryAbility;
    }

    public String getSavingThrow1() {
        return savingThrow1;
    }

    public void setSavingThrow1(String savingThrow1) {
        this.savingThrow1 = savingThrow1;
    }

    public String getSavingThrow2() {
        return savingThrow2;
    }

    public void setSavingThrow2(String savingThrow2) {
        this.savingThrow2 = savingThrow2;
    }
}
