package com.PingPongManagement.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class League {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer leagueId;
	
	@NotNull
	private String leagueName;
	
	@NotNull
	private Date startDate;
	
	@NotNull
	private Date endDate;
	
	private float reward;

	public Integer getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getReward() {
		return reward;
	}

	public void setReward(float reward) {
		this.reward = reward;
	}

	public League(Integer leagueId, @NotNull String leagueName, @NotNull Date startDate, @NotNull Date endDate,
			float reward) {
		super();
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reward = reward;
	}

	public League() {
		super();
	}
	
	
	
}
