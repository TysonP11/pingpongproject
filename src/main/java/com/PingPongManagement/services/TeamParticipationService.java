package com.PingPongManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PingPongManagement.models.Team;
import com.PingPongManagement.models.TeamParticipation;
import com.PingPongManagement.repositories.TeamParticipationRepository;

@Service
public class TeamParticipationService {
	
	@Autowired
	private TeamParticipationRepository repository;
	
	public TeamParticipation saveTeamParticipation(TeamParticipation teamParticipation) {
		return repository.save(teamParticipation);
	}
	
	public List<TeamParticipation> saveTeamParticipations(List<TeamParticipation> teamParticipations) {
		return repository.saveAll(teamParticipations);
	}
	
	public List<TeamParticipation> getTeamsByLeagueId(Integer leagueId) {
		return repository.findByLeagueLeagueId(leagueId);
	}
	
	public List<TeamParticipation> getLeaguesByTeamId(Integer teamId) {
		return repository.findByTeamTeamId(teamId);
	}
	
	public String deleteTeamParticipation(int id) {
		repository.deleteById(id);
		return "Team Participation Removed!!" + id;
	}
	
	public TeamParticipation updateTeamParticipation(TeamParticipation teamParticipation) {
		TeamParticipation existing = repository.findById(teamParticipation.getTeamParticipationId()).orElse(null);
		existing.setTeam(teamParticipation.getTeam());
		existing.setLeague(teamParticipation.getLeague());
		existing.setSeries(teamParticipation.getSeries());
		existing.setGroup(teamParticipation.getGroup());
		existing.setRanking(teamParticipation.getRanking());
		existing.setPoints(teamParticipation.getPoints());
		return repository.save(existing);
	}
}
