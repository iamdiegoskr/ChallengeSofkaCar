package com.sofka.CarGame.persistence;

import com.sofka.CarGame.domain.model.Car;
import com.sofka.CarGame.domain.repository.ICarRepository;
import com.sofka.CarGame.persistence.crud.CarCrudRepository;
import com.sofka.CarGame.persistence.entity.CarEntity;
import com.sofka.CarGame.persistence.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CarRepository implements ICarRepository {

    @Autowired
    private CarCrudRepository repository;

    @Autowired
    private CarMapper mapper;

    @Override
    public List<Car> getAllCars() {
        List<CarEntity> cars = (List<CarEntity>) repository.findAll();
        return mapper.toCars(cars);
    }

    @Override
    public Optional<Car> getCar(int id) {
        return repository.findById(id).map(carEntity -> mapper.toCar(carEntity));
    }

    @Override
    public Car save(Car car) {
        CarEntity carEntity = mapper.toCarEntity(car);
        return mapper.toCar(repository.save(carEntity));
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
