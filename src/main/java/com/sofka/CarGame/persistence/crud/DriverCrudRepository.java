package com.sofka.CarGame.persistence.crud;

import com.sofka.CarGame.persistence.entity.DriverEntity;
import org.springframework.data.repository.CrudRepository;

public interface DriverCrudRepository extends CrudRepository<DriverEntity,Integer> {
}
