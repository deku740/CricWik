package com.crick.api.repositories;

import com.crick.api.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
    //match fetch
    //provide team name and get the match
    Optional<Match> findByTeamHeading(String teamHeading);

}
