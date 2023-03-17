package com.rpg.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.util.UUID;

@Entity
@Table(name = "tb_equipments", schema = "rpg_generator")
public class EquipmentsModel {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(mappedBy = "equipmentsModel")
    private PlayersModel playersModel;

    @Column(name = "cp", nullable = false)
    private Number cp;


    @Column(name = "sp", nullable = false)
    private Number sp;

    @Column(name = "ep", nullable = false)
    private Number ep;

    @Column(name = "gp", nullable = false)
    private Number gp;

    @Column(name = "pp", nullable = false)
    private Number pp;

    @Column(name = "description", nullable = false)
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public PlayersModel getPlayersModel() {
        return playersModel;
    }

    public void setPlayersModel(PlayersModel playersModel) {
        this.playersModel = playersModel;
    }
}
