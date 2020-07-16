package com.PingPongManagement.dtos;


public class SearchRequest {
	
    private String term;

	public SearchRequest(String term) {
		super();
		this.term = term;
	}

	public SearchRequest() {
		super();
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
    
    
}
