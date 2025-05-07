package com.josh007.nbaapiservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.josh007.nbaapiservice.BasketballTeamService;

import java.util.List;

@RestController
public class BasketballTeamController {

    @Autowired
    private BasketballTeamService basketballTeamService;

    @GetMapping("/teams")
    public List<BasketballTeam> getTeams() {
        return basketballTeamService.getAllTeams();
    }
}
