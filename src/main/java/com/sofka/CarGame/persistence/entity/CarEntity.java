package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCar;

    private Integer model;

    private String color;

    private String brand;

    private Integer idDriver;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDriver", referencedColumnName = "idDriver")
    private DriverEntity driver;

    @OneToOne(mappedBy = "car")
    private LaneEntity lane;

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Integer idDriver) {
        this.idDriver = idDriver;
    }

    public DriverEntity getDriver() {
        return driver;
    }

    public void setDriver(DriverEntity driver) {
        this.driver = driver;
    }

    public LaneEntity getLane() {
        return lane;
    }

    public void setLane(LaneEntity lane) {
        this.lane = lane;
    }
}
