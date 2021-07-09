package com.sofka.CarGame.persistence.crud;

import com.sofka.CarGame.persistence.entity.CarEntity;
import org.springframework.data.repository.CrudRepository;


public interface CarCrudRepository extends CrudRepository<CarEntity,Integer> {



}
