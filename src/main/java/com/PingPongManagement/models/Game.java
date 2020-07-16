package com.PingPongManagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gameId;
	
	@ManyToOne
	@JoinColumn(name = "playerId", referencedColumnName = "playerId")
	private Player playerHome1;
	
	@NotNull
	private Double homeAccumulatedPoints1;
	
	@NotNull
	@NotBlank
	private String rankingHome1;
	
	@ManyToOne
	@JoinColumn(name = "playerId", referencedColumnName = "playerId")
	private Player playerHome2;
	
	@NotNull
	private Double homeAccumulatedPoints2;
	
	@NotNull
	@NotBlank
	private String rankingHome2;
	
	@ManyToOne
	@JoinColumn(name = "playerId", referencedColumnName = "playerId")
	private Player playerAway1;
	
	@NotNull
	private Double awayAccumulatedPoints1;
	
	@NotNull
	@NotBlank
	private String rankingAway1;	
	
	@ManyToOne
	@JoinColumn(name = "playerId", referencedColumnName = "playerId")
	private Player playerAway2;
	
	@NotNull
	private Double awayAccumulatedPoints2;
	
	@NotNull
	@NotBlank
	private String rankingAway2;
	
	private int bonusPoint;
	
	private String setsResult;
	
}
