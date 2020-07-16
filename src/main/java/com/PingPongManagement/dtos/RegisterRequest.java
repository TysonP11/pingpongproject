package com.PingPongManagement.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class RegisterRequest {
    @NotNull(message = "Username is required!")
    @NotBlank(message = "Username can not be empty!")
    private String username;

    @NotBlank(message = "Password can not be empty!")
    private String password;
    
    

	public RegisterRequest(
			@NotNull(message = "Username is required!") @NotBlank(message = "Username can not be empty!") String username,
			@NotBlank(message = "Password can not be empty!") String password) {
		super();
		this.username = username;
		this.password = password;
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
