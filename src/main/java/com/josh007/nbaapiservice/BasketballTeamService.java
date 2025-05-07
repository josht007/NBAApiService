package com.josh007.nbaapiservice;

import com.josh007.nbaapiservice.BasketballTeam;
import com.josh007.nbaapiservice.BasketballTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketballTeamService {

    @Autowired
    private BasketballTeamRepository repository;

    public List<BasketballTeam> getAllTeams() {
        return repository.findAll();  // Fetches all teams from the database
    }

    // You can add more methods here for querying specific teams
}