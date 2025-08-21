package br.com.missio.gamelist.controller;

import br.com.missio.gamelist.dto.GameListDTO;
import br.com.missio.gamelist.dto.GameMinDTO;
import br.com.missio.gamelist.services.GameListService;
import br.com.missio.gamelist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    private GameListService gameListService;
    private GameServices gameService;

    public GameListController(GameListService gameListService, GameServices gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByGameList(listId);
        return result;
    }
}
