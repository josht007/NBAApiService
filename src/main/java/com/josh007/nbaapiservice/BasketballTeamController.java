package com.josh007.nbaapiservice;

import com.josh007.nbaapiservice.BasketballTeam;
import com.josh007.nbaapiservice.BasketballTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketballTeamController {

    @Autowired
    private BasketballTeamService basketballTeamService;

    @GetMapping("/teams")
    public List<BasketballTeam> getAllTeams() {
        return basketballTeamService.getAllTeams();
    }
}