package com.PingPongManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.PingPongManagement.dtos.AddTeamParticipationRequest;
import com.PingPongManagement.exceptions.AppException;
import com.PingPongManagement.models.League;
import com.PingPongManagement.models.Team;
import com.PingPongManagement.models.TeamParticipation;
import com.PingPongManagement.repositories.LeagueRepository;
import com.PingPongManagement.repositories.TeamParticipationRepository;
import com.PingPongManagement.repositories.TeamRepository;

@Service
@Transactional
public class TeamParticipationService {

	@Autowired
	private TeamParticipationRepository repository;

	@Autowired
	private LeagueRepository leagueRepo;

	@Autowired
	private TeamRepository teamRepo;

	public void saveTeamParticipation(AddTeamParticipationRequest teamParticipation) {

		TeamParticipation newTeamParticipation = new TeamParticipation();

		newTeamParticipation.setGroup(teamParticipation.getGroup());
		League league = leagueRepo.findById(teamParticipation.getLeagueId())
				.orElseThrow(() -> new AppException("Invalid LeagueId"));
		Team team = teamRepo.findById(teamParticipation.getTeamId())
				.orElseThrow(() -> new AppException("Invalid TeamId"));
		newTeamParticipation.setLeague(league);
		newTeamParticipation.setTeam(team);
		newTeamParticipation.setSeries(teamParticipation.getSeries());
		newTeamParticipation.setRanking(teamParticipation.getRanking());
		newTeamParticipation.setPoints(teamParticipation.getPoints());

		repository.save(newTeamParticipation);

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
