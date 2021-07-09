package com.sofka.CarGame.domain.service;

import com.sofka.CarGame.domain.model.Car;
import com.sofka.CarGame.domain.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private ICarRepository repository;

    public List<Car> getCars(){
        return repository.getAllCars();
    }

    public Optional<Car> getCar(int id){
        return  repository.getCar(id);
    }

    public Car save(Car car){
        return repository.save(car);
    }

    public  boolean delete(int id){
        return  getCar(id).map(car -> {
            repository.delete(id);
            return  true;
        }).orElse(false);
    }

}
