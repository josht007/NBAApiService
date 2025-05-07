package com.josh007.nbaapiservice;

import com.josh007.nbaapiservice.BasketballTeam;
import com.josh007.nbaapiservice.BasketballTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasketballTeamController {

    @Autowired
    private BasketballTeamRepository basketballTeamRepository;

    @GetMapping("/teams")
    public String getTeams(Model model) {
        model.addAttribute("teams", basketballTeamRepository.findAll());
        return "index";
    }
}
