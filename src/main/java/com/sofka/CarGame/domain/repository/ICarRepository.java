package com.sofka.CarGame.domain.repository;

import com.sofka.CarGame.domain.model.Car;

import java.util.List;
import java.util.Optional;

public interface ICarRepository {

    List<Car> getAllCars();
    Optional<Car> getCar(int id);
    Car save(Car car);
    void delete(int id);

}
