package com.sofka.CarGame.persistence.crud;

import com.sofka.CarGame.persistence.entity.TrackEntity;
import org.springframework.data.repository.CrudRepository;

public interface TrackCrudRepository extends CrudRepository<TrackEntity,Integer> {
}
