package com.josh007.nbaapiservice;

import com.josh007.nbaapiservice.BasketballTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketballTeamRepository extends JpaRepository<BasketballTeam, Integer> {

}