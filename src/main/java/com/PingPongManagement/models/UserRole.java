package com.PingPongManagement.models;



import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity

public class UserRole {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer userRoleId;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private AppUser user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    private AppRole appRole;
}
