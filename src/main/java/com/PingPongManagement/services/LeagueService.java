package com.PingPongManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PingPongManagement.models.League;
import com.PingPongManagement.models.Team;
import com.PingPongManagement.repositories.LeagueRepository;

@Service
public class LeagueService {

	@Autowired
	private LeagueRepository repository;
	
	public League saveLeague(League league) {
		return repository.save(league);
	}
	
	public List<League> saveLeagues(List<League> leagues) {
		return repository.saveAll(leagues);
	}
	
	public List<League> getLeagues() {
		return repository.findAll();
	}
	
	public League getLeagueById(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteLeague(int id) {
		repository.deleteById(id);
		return "League removed!" + id;
	}
	
	public League updateLeague(League league) {
		League existingLeague = repository.findById(league.getLeagueId()).orElse(null);
		existingLeague.setLeagueName(league.getLeagueName());
		existingLeague.setStartDate(league.getStartDate());
		existingLeague.setEndDate(league.getEndDate());
		return repository.save(existingLeague);
	}
	
}
