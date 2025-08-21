package com.devjavadslist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjavadslist.dslist.dto.GameMinDTO;
import com.devjavadslist.dslist.entities.Game;
import com.devjavadslist.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(X -> new GameMinDTO(X)).toList();
	}

}
