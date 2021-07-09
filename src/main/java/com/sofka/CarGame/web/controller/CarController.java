package com.sofka.CarGame.web.controller;

import com.sofka.CarGame.domain.model.Car;
import com.sofka.CarGame.domain.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping
    public ResponseEntity<Car> createCar(Car car){
        return new ResponseEntity<>(service.save(car), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable() int id){
        return service.getCar(id).map(car -> new ResponseEntity<>(car,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
