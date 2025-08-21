package br.com.missio.gamelist.services;

import br.com.missio.gamelist.dto.GameDTO;
import br.com.missio.gamelist.dto.GameMinDTO;
import br.com.missio.gamelist.entites.Game;
import br.com.missio.gamelist.repository.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameServices {

    private final GameRepository gameRepository;
    public GameServices(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
       List<Game> games = gameRepository.findAll();
       List<GameMinDTO> gamesDTO = games.stream()
                .map(GameMinDTO::new).toList();
       return gamesDTO ;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).orElseThrow(() -> new RuntimeException("Game not found"));
        return new GameDTO(game);
    }


}
