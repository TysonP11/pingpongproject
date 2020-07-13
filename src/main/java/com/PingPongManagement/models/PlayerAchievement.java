package com.PingPongManagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerAchievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerAchievementId;

    @NotNull(message = "Ranking is required!")
    private String ranking;

    @NotNull(message = "Point is required!")
    private Double point;

    @NotNull(message = "Updated Date is required!")
    private Date updatedDate;

    @NotNull(message = "Nick Name is required!")
    private String nickName;

    @NotNull(message = "Player Code is required!")
    private String playerCode;

    @ManyToOne
    @JoinColumn(name = "playerId", referencedColumnName = "playerId")
    private Player player;

	public PlayerAchievement(Integer playerAchievementId, @NotNull(message = "Ranking is required!") String ranking,
			@NotNull(message = "Point is required!") Double point,
			@NotNull(message = "Updated Date is required!") Date updatedDate,
			@NotNull(message = "Nick Name is required!") String nickName,
			@NotNull(message = "Player Code is required!") String playerCode, Player player) {
		super();
		this.playerAchievementId = playerAchievementId;
		this.ranking = ranking;
		this.point = point;
		this.updatedDate = updatedDate;
		this.nickName = nickName;
		this.playerCode = playerCode;
		this.player = player;
	}

	public PlayerAchievement() {
		super();
	}

	public Integer getPlayerAchievementId() {
		return playerAchievementId;
	}

	public void setPlayerAchievementId(Integer playerAchievementId) {
		this.playerAchievementId = playerAchievementId;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPlayerCode() {
		return playerCode;
	}

	public void setPlayerCode(String playerCode) {
		this.playerCode = playerCode;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
    
    
}