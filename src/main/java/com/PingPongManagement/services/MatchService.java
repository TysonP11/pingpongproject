package com.PingPongManagement.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PingPongManagement.exceptions.AppException;
import com.PingPongManagement.models.Match;
import com.PingPongManagement.models.TeamParticipation;
import com.PingPongManagement.repositories.MatchRepository;
import com.PingPongManagement.repositories.TeamParticipationRepository;


@Service
public class MatchService {

	@Autowired
	private MatchRepository repository;
	
	@Autowired
	private TeamParticipationRepository teamRepo;
	
	public List<Match> findMatchesByTeamId(Integer teamId){
		List<TeamParticipation> teamParticipations = teamRepo.findByTeamTeamId(teamId);
		
		for( int i = 0; i<teamParticipations.size(); i++) {
			System.out.println(teamParticipations.get(i));
		}
		
		List<Match> matches = new ArrayList<Match>();
		
		for(int i = 0; i<teamParticipations.size(); i++) {
			List<Match> matchesHomeThatYear = repository.findByHomeTeamParticipationId(teamParticipations.get(i).getTeamParticipationId());
			List<Match> matchesAwayThatYear = repository.findByAwayTeamParticipationId(teamParticipations.get(i).getTeamParticipationId());
			
			matches = Stream.concat(matches.stream(), matchesHomeThatYear.stream())
	                .collect(Collectors.toList());
			
			matches = Stream.concat(matches.stream(), matchesAwayThatYear.stream())
	                .collect(Collectors.toList());
		}
		return matches;
	}
	
	public List<Match> findMatchesByLeagueId(Integer leagueId) {
		List<TeamParticipation> teamParticipations = teamRepo.findByLeagueLeagueId(leagueId);
		
		List<Match> matches = new ArrayList<Match>();
		
		for(int i = 0; i < teamParticipations.size(); i++) {
			List<Match> matchesHomeThatYear = repository.findByHomeTeamParticipationId(teamParticipations.get(i).getTeamParticipationId());
			List<Match> matchesAwayThatYear = repository.findByAwayTeamParticipationId(teamParticipations.get(i).getTeamParticipationId());
			
			matches = Stream.concat(matches.stream(), matchesHomeThatYear.stream())
	                .collect(Collectors.toList());
			
			matches = Stream.concat(matches.stream(), matchesAwayThatYear.stream())
	                .collect(Collectors.toList());
		}
		return matches;
	}
	
	public Match saveMatch(Match match) {
		return repository.save(match);
	}
	
	public Match getMatchById(Integer matchId) {
		return repository.findById(matchId).orElseThrow(() -> new AppException("Match Not Found"));
	}
	
	public void deleteMatchById(Integer matchId) {
		repository.deleteById(matchId);
	}
	
}
