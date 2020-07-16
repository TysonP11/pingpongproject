package com.PingPongManagement.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity

public class AppUser {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer userId;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String username;

    @NotBlank
    private String password;
    
    

	public AppUser() {
		super();
	}

	public AppUser(Integer userId, @NotNull @NotBlank String username, @NotBlank String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
