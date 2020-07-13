package com.PingPongManagement.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
