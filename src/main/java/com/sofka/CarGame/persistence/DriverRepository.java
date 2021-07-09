package com.sofka.CarGame.persistence;

import com.sofka.CarGame.domain.model.Driver;
import com.sofka.CarGame.domain.repository.IDriverRepository;
import com.sofka.CarGame.persistence.crud.DriverCrudRepository;
import com.sofka.CarGame.persistence.entity.DriverEntity;
import com.sofka.CarGame.persistence.mapper.DriverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DriverRepository implements IDriverRepository {

    @Autowired
    private DriverCrudRepository repository;

    @Autowired
    private DriverMapper mapper;

    @Override
    public List<Driver> getDrivers() {
        List<DriverEntity> drivers = (List<DriverEntity>) repository.findAll();
        return mapper.toDrivers(drivers);
    }

    @Override
    public Optional<Driver> getDriver(int id) {
        return repository.findById(id).map(driverEntity -> mapper.toDriver(driverEntity));
    }

    @Override
    public Driver save(Driver drive) {
        DriverEntity driverEntity = mapper.toDriverEntity(drive);
        return mapper.toDriver(repository.save(driverEntity));
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
