package br.com.missio.gamelist.services;

import br.com.missio.gamelist.entites.Game;
import br.com.missio.gamelist.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServices {

    private GameRepository gameRepository;
    public GameServices(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll() {
       List<Game> games = gameRepository.findAll();
       return games;
    }


}
