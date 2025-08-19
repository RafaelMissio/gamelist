package br.com.missio.gamelist.controller;

import br.com.missio.gamelist.entites.Game;
import br.com.missio.gamelist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {


    private GameServices gameServices;
    public GameController(GameServices gameServices) {
        this.gameServices = gameServices;
    }


    @GetMapping
    public List<Game> findAll() {
        List<Game> games = gameServices.findAll();
        return games;
    }
}
