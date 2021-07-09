package com.sofka.CarGame.persistence.crud;

import com.sofka.CarGame.persistence.entity.GameEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameCrudRepository extends CrudRepository<GameEntity, Integer> {

}
