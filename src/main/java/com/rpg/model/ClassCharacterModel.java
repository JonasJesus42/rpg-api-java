package com.rpg.model;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "tb_class", schema = "rpg_generator")
@Entity
public class ClassCharacterModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(mappedBy = "classCharacter")
    private PlayerModel player;

    @Column(name = "nameClass")
    private String nameClass;

    @Column(name = "selectedClass", insertable = false, updatable = false)
    private Boolean selectedClass;

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

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Boolean getSelectedClass() {
        return selectedClass;
    }

    public void setSelectedClass(Boolean selectedClass) {
        this.selectedClass = selectedClass;
    }

    
}
