package com.rpg.dto;

import com.rpg.model.UserModel;
import jakarta.validation.constraints.NotBlank;

public class GameMasterDto {

    @NotBlank
    private String gameName;

    @NotBlank
    private UserModel userId;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public UserModel getUserId() {
        return userId;
    }

    public void setUserId(UserModel userId) {
        this.userId = userId;
    }
}
