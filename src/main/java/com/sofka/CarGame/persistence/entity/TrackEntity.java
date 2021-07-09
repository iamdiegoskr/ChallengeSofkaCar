package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "track")
public class TrackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrack;

    private String nameTrack;

    private Integer idLane;


    public Integer getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(Integer idTrack) {
        this.idTrack = idTrack;
    }

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public Integer getIdLane() {
        return idLane;
    }

    public void setIdLane(Integer idLane) {
        this.idLane = idLane;
    }
}
