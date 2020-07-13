package com.PingPongManagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PingPongManagement.models.PlayerParticipation;

public interface PlayerParticipationRepository extends JpaRepository<PlayerParticipation, Integer>{

	List<PlayerParticipation> findByTeamParticipationTeamParticipationId(Integer teamParticipationId);
	
}
