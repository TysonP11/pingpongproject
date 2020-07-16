package com.PingPongManagement.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.IDENTITY;

@Entity

public class AppRole {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer roleId;

    @NotEmpty
    private String roleName;
}
