package br.com.missio.gamelist.controller;

import br.com.missio.gamelist.dto.GameMinDTO;
import br.com.missio.gamelist.services.GameServices;
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
    public List<GameMinDTO> findAll() {
       return gameServices.findAll();
    }
}
