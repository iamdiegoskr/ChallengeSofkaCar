package com.sofka.CarGame.persistence;

import com.sofka.CarGame.persistence.crud.GameCrudRepository;
import com.sofka.CarGame.persistence.entity.GameEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GameRepository {

    @Autowired
    private GameCrudRepository repository;

    public Optional<GameEntity> getGame(int id){
        return repository.findById(id);
    }

    public List<GameEntity> getAllGames(){
        return (List<GameEntity>) repository.findAll();
    }

    public GameEntity save(GameEntity game){
        return repository.save(game);
    }

    public void deleteGame(int id){
        repository.deleteById(id);
    }

}

