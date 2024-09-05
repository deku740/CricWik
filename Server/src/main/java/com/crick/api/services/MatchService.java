package com.crick.api.services;

import com.crick.api.entities.Match;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches

    List<Match> getAllMatches();

    //get live matches

    List<Match> getLiveMatches();

    //get point table

    List<List<String>> getPointTable();
}
