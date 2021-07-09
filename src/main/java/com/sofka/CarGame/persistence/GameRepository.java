package com.sofka.CarGame.persistence;


import com.sofka.CarGame.domain.model.Game;
import com.sofka.CarGame.domain.repository.IGameRepository;
import com.sofka.CarGame.persistence.crud.GameCrudRepository;
import com.sofka.CarGame.persistence.entity.GameEntity;
import com.sofka.CarGame.persistence.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GameRepository implements IGameRepository {

    @Autowired
    private GameCrudRepository repository;

    @Autowired
    private GameMapper mapper;

    @Override
    public List<Game> getAll(){
        List<GameEntity> games = (List<GameEntity>) repository.findAll();
        return mapper.toGames(games);
    }

    @Override
    public Optional<Game> getGameById(int id){
        return repository.findById(id).map(gameEntity -> mapper.toGame(gameEntity));
    }

    @Override
    public Game save(Game game){
        GameEntity gameEntity = mapper.toGameEntity(game);
        return mapper.toGame(repository.save(gameEntity));
    }

    @Override
    public void delete(int id){
       repository.deleteById(id);
    }

}

