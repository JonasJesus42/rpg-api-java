package com.rpg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "tb_class", schema = "rpg_generator")
public class ClassCharacterModel {
    @Column(name = "nameClass")
    private String nameClass;

    @Column(name = "selectedClass", insertable = false, updatable = false)
    private Boolean selectedClass;

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
