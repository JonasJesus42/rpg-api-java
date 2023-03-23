package com.rpg.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_player", schema = "rpg_generator")
public class PlayersModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("players")
    private UserModel user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id")
    @JsonIgnoreProperties("playersModel")
    private StatsModel statsModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "equipments_id")
    @JsonIgnoreProperties("playersModel")
    private EquipmentsModel equipmentsModel;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "level", nullable = false, length = 2)
    private int level;

    @Column(name = "exp", nullable = false, length = 7)
    private int exp;

    @Column(name = "background")
    private String background;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "proficiency_bonus", length = 3)
    private int proficiencyBonus;

    @Column(name = "inspiration", length = 3)
    private int inspiration;

    @Column(name = "armor_class", length = 3)
    private int armorClass;

    @Column(name = "initiative", length = 3)
    private int initiative;

    @Column(name = "passive_wisdom", length = 3)
    private int passiveWisdom;

    @Column(name = "speed", length = 3)
    private int speed;

    @Column(name = "current_hit_points", length = 3)
    private int currentHitPoints;

    @Column(name = "hit_dice")
    private int hitDice;

    @Column(name = "personality_traits")
    private String personalityTraits;

    @Column(name = "ideals")
    private String ideals;

    @Column(name = "bonds")
    private String bonds;

    @Column(name = "flaws")
    private String flaws;

    @Column(name = "features_and_traits")
    private String featuresAndTraits;

    @Column(name = "other_proficiencies_and_languages")
    private String otherProficienciesAndLanguages;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public StatsModel getStatsModel() {
        return statsModel;
    }

    public void setStatsModel(StatsModel statsModel) {
        this.statsModel = statsModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(int passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }

    public String getFeaturesAndTraits() {
        return featuresAndTraits;
    }

    public void setFeaturesAndTraits(String featuresAndTraits) {
        this.featuresAndTraits = featuresAndTraits;
    }

    public String getOtherProficienciesAndLanguages() {
        return otherProficienciesAndLanguages;
    }

    public void setOtherProficienciesAndLanguages(String otherProficienciesAndLanguages) {
        this.otherProficienciesAndLanguages = otherProficienciesAndLanguages;
    }

    public EquipmentsModel getEquipmentsModel() {
        return equipmentsModel;
    }

    public void setEquipmentsModel(EquipmentsModel equipmentsModel) {
        this.equipmentsModel = equipmentsModel;
    }
}
