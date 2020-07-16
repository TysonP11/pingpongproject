package com.PingPongManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PingPongManagement.models.Team;
import com.PingPongManagement.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository repository;
	
	public Team saveTeam(Team team) {
		return repository.save(team);
	}
	
	public List<Team> saveTeams(List<Team> teams) {
		return repository.saveAll(teams);
	}
	
	public List<Team> getTeams(){
		return repository.findAll();
	}
	
	public Team getTeamById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Team getTeamByCode(String code){
		return repository.findByTeamCode(code);
	}
	
	public String deleteTeam(int id) {
		repository.deleteById(id);
		return "Team Removed!!" + id;
	}
	
	public Team updateTeam(Team team) {
		Team existingTeam = repository.findById(team.getTeamId()).orElse(null);
		existingTeam.setTeamName(team.getTeamName());
		existingTeam.setTeamCode(team.getTeamCode());
		existingTeam.settP(team.gettP());
		return repository.save(existingTeam);
	}
}
