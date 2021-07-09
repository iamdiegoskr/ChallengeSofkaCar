package com.sofka.CarGame.web.controller;

import com.sofka.CarGame.domain.model.Game;
import com.sofka.CarGame.domain.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService service;

    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Game game){
        return new ResponseEntity<>(service.save(game), HttpStatus.CREATED);
    }

    


}
