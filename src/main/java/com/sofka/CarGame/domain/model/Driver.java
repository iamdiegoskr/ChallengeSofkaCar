package com.sofka.CarGame.domain.model;

import java.util.Random;

public class Driver {
    private int idDriver;
    private String name;

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int throwDice(){
        Random random = new Random();
        return (random.nextInt(6) + 1);
    }
}
