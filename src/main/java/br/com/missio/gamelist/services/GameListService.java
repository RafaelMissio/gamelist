package br.com.missio.gamelist.services;

import br.com.missio.gamelist.dto.GameListDTO;
import br.com.missio.gamelist.entites.GameList;
import br.com.missio.gamelist.repository.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> gameLists = gameListRepository.findAll();
       return gameLists.stream().map(GameListDTO::new).toList();
    }

}
