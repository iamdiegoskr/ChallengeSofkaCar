package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "lane")
public class LaneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLane;
    
    private Integer idCar;

    private Integer idTrack;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCar", referencedColumnName = "idCar")
    private CarEntity car;

    @ManyToOne //Muchos carriles le pueden pertenecer a una pista.
    @JoinColumn(name = "idTrack", insertable = false, updatable = false)
    private  TrackEntity track;

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

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public Integer getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(Integer idTrack) {
        this.idTrack = idTrack;
    }

    public TrackEntity getTrack() {
        return track;
    }

    public void setTrack(TrackEntity track) {
        this.track = track;
    }
}
