package com.PingPongManagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PingPongManagement.models.Match;

public interface MatchRepository extends JpaRepository<Match, Integer>{

	List<Match> findByPlayerPlayerId(Integer playerId);
	
}
