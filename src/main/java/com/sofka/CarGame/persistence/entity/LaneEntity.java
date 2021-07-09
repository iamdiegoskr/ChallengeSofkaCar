package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "lane")
public class LaneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLane;
    
    private Integer idCar;

    public Integer getIdLane() {
        return idLane;
    }

    public void setIdLane(Integer idLane) {
        this.idLane = idLane;
    }


    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }
}
