package com.rpg.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_player", schema = "rpg_generator")
public class PlayerModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "playerName")
    private String playerName;

    @Column(name = "race", nullable = false)
    private RaceModel race;

    @Column(name = "class", nullable = false)
    private ClassCharacterModel classCharacter;

    @Column(name = "lavel", nullable = false, length = 2)
    private int lavel;

    @Column(name = "exp", nullable = false, length = 7)
    private int exp;

    @Column(name = "background")
    private String background;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "status")
    private StatusModel status;

    @Column(name = "proficiencyBonus", length = 3)
    private int proficiencyBonus;

    @Column(name = "inspiration", length = 3)
    private int inspiration;

    @Column(name = "armorClass", length = 3)
    private int armorClass;

    @Column(name = "initiative", length = 3)
    private int initiative;

    @Column(name = "passiveWisdom", length = 3)
    private int passiveWisdom;

    @Column(name = "speed", length = 3)
    private int speed;

    @Column(name = "currentHitPoints", length = 3)
    private int currentHitPoints;

    @Column(name = "hitDice")
    private int hitDice;

    @Column(name = "personalityTraits")
    private String personalityTraits;

    @Column(name = "ideals")
    private String ideals;

    @Column(name = "bonds")
    private String bonds;

    @Column(name = "flaws")
    private String flaws;

    @Column(name = "featuresAndTraits")
    private String featuresAndTraits;

    @Column(name = "otherProficienciesAndLanguages")
    private String otherProficienciesAndLanguages;

    @Column(name = "equipment")
    private EquipmentModel equipment;

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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public RaceModel getRace() {
        return race;
    }

    public void setRace(RaceModel race) {
        this.race = race;
    }

    public ClassCharacterModel getClassCharacter() {
        return classCharacter;
    }

    public void setClassCharacter(ClassCharacterModel classCharacter) {
        this.classCharacter = classCharacter;
    }

    public int getLavel() {
        return lavel;
    }

    public void setLavel(int lavel) {
        this.lavel = lavel;
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

    public StatusModel getStatus() {
        return status;
    }

    public void setStatus(StatusModel status) {
        this.status = status;
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

    public EquipmentModel getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentModel equipment) {
        this.equipment = equipment;
    }
}
