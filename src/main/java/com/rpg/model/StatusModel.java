package com.rpg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table
public class StatusModel {

    @Column(name = "nameStatus")
    private String nameStatus;

    @Column(name = "selectedStatus", insertable = false, updatable = false)
    private Boolean selectedStatus;

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public Boolean getSelectedStatus() {
        return selectedStatus;
    }

    public void setSelectedStatus(Boolean selectedStatus) {
        this.selectedStatus = selectedStatus;
    }
}

