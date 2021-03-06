package com.sofka.CarGame.domain.repository;

import com.sofka.CarGame.domain.model.Game;

import java.util.List;
import java.util.Optional;

public interface IGameRepository {

    List<Game> getAll();
    Optional<Game> getGameById(int id);
    Game save(Game game);
    void delete(int idGame);
}
