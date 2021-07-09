package com.sofka.CarGame.domain.service;

import com.sofka.CarGame.domain.model.Game;
import com.sofka.CarGame.domain.repository.IGameRepository;
import com.sofka.CarGame.persistence.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private IGameRepository repository;

    public List<Game> getAll(){
        return repository.getAll();
    }

    public Optional<Game> getGameById(int id){
        return repository.getGameById(id);
    }

    public Game save(Game game){
        return repository.save(game);
    }

    public boolean delete(int id){
        return getGameById(id).map(game -> {
            repository.delete(id);
            return true;
        }).orElse(false);
    }

}
