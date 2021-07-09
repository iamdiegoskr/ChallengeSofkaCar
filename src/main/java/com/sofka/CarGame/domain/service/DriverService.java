package com.sofka.CarGame.domain.service;

import com.sofka.CarGame.domain.model.Driver;
import com.sofka.CarGame.domain.repository.IDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private IDriverRepository repository;

    public List<Driver> getDrivers(){
        return repository.getDrivers();
    }

    public Optional<Driver> getDriverById(int id){
        return repository.getDriver(id);
    }

    public Driver save(Driver driver){
        return  repository.save(driver);
    }

    public boolean delete(int id){
        return getDriverById(id).map(driver -> {
            repository.delete(id);
            return true;
        }).orElse(false);
    }

}
