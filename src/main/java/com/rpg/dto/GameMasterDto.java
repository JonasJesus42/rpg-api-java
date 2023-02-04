package com.rpg.dto;

import jakarta.validation.constraints.NotBlank;

public class GameMasterDto {

    @NotBlank
    private String name;

    private String gameName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
