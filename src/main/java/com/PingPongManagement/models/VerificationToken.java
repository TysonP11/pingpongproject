package com.PingPongManagement.models;



import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity

public class VerificationToken {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer verificationTokenId;

    private String token;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private AppUser user;
}
