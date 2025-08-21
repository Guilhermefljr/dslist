package com.devjavadslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjavadslist.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
