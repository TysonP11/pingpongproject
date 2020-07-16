package com.PingPongManagement.exceptions;

import org.springframework.http.HttpStatus;

public class PingPongManagementException {
    private final String message;
    private final Throwable cause;
    private final HttpStatus httpStatus;
	public String getMessage() {
		return message;
	}
	public Throwable getCause() {
		return cause;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public PingPongManagementException(String message, Throwable cause, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.cause = cause;
		this.httpStatus = httpStatus;
	}
    
    
}
