package com.PingPongManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PingPongManagement.models.League;

public interface LeagueRepository extends JpaRepository<League, Integer> {

}
