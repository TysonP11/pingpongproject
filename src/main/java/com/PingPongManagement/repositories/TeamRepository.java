package com.PingPongManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PingPongManagement.models.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
	Team findByTeamCode(String code);
}
