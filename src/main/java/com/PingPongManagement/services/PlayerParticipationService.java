package com.PingPongManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PingPongManagement.models.PlayerParticipation;
import com.PingPongManagement.models.TeamParticipation;
import com.PingPongManagement.repositories.PlayerParticipationRepository;

@Service
public class PlayerParticipationService {

	@Autowired
	private PlayerParticipationRepository repository;
	
	public List<PlayerParticipation> savePlayerParticipations(List<PlayerParticipation> playerParticipations) {
		return repository.saveAll(playerParticipations);
	}
	
	public List<PlayerParticipation> getPlayerParticipationsByTeamParticipationId(Integer teamParticipationId) {
		return repository.findByTeamParticipationTeamParticipationId(teamParticipationId);
	}
	
	public String deletePlayerParticipation(Integer playerParticipationId) {
		repository.deleteById(playerParticipationId);
		return "Player Participation deleted";
	}
	
	public PlayerParticipation updatePlayerParticipation(PlayerParticipation playerParticipation) {
		PlayerParticipation existing = repository.findById(playerParticipation.getPlayerParticipationId()).orElse(null);
		existing.setPlayer(playerParticipation.getPlayer());
		existing.setTeamParticipation(playerParticipation.getTeamParticipation());
		return repository.save(existing);
	}
	
}
