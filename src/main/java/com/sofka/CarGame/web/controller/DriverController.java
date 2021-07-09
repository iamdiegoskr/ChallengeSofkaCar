package com.sofka.CarGame.web.controller;

import com.sofka.CarGame.domain.model.Driver;
import com.sofka.CarGame.domain.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class DriverController {

    @Autowired
    private DriverService service;

    @GetMapping("/{id}")
    public ResponseEntity<Driver> getDriver(@PathVariable() int idDriver){
        return service.getDriverById(idDriver).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ResponseEntity<Driver> createDriver(Driver driver){
        return new ResponseEntity<>(service.save(driver),HttpStatus.CREATED);
    }

}
