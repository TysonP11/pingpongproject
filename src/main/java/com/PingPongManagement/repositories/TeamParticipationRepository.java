package com.PingPongManagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PingPongManagement.models.TeamParticipation;

@Repository
public interface TeamParticipationRepository extends JpaRepository<TeamParticipation, Integer>{
	
	List<TeamParticipation> findByTeamTeamId(Integer teamId);
	
	List<TeamParticipation> findByLeagueLeagueId(Integer leagueId);

}
