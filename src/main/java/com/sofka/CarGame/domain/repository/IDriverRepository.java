package com.sofka.CarGame.domain.repository;

import com.sofka.CarGame.domain.model.Driver;

import java.util.List;
import java.util.Optional;

public interface IDriverRepository {

    List<Driver> getDrivers();
    Optional<Driver> getDriver(int id);
    Driver save(Driver drive);
    void delete(int id);


}
