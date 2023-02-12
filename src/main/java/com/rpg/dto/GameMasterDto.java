package com.rpg.dto;

import com.rpg.model.UserModel;
import jakarta.validation.constraints.NotBlank;

public class GameMasterDto {

    @NotBlank
    private String gameName;


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
