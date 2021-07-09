package com.sofka.CarGame.persistence.crud;

import com.sofka.CarGame.persistence.entity.PodiumEntity;
import org.springframework.data.repository.CrudRepository;

public interface PodiumCrudRepository extends CrudRepository<PodiumEntity,Integer> {
}
