package com.josh007.nbaapiservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.josh007.nbaapiservice.BasketballTeamRepository;

import java.util.List;

@Service
public class BasketballTeamService {

    @Autowired
    private BasketballTeamRepository basketballTeamRepository;

    public List<BasketballTeam> getAllTeams() {
        return basketballTeamRepository.findAll();  // Fetch all teams
    }
}
