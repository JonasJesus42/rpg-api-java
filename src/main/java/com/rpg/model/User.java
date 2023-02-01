package com.rpg.model;

import jakarta.persistence.Table;

@Table(name = "tb_user", schema = "rpg_generator")
public class User {
    private String name;
    private String lastName;
    private Integer age;
    private String email;
}
