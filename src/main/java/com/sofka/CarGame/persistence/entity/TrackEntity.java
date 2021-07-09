package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "track")
public class TrackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrack;

    private String nameTrack;

    private Integer limitTrack;

    @OneToMany(mappedBy = "track") //Una pista puede tener muchos carriles
    private List<LaneEntity> lanes;
    

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

    public Integer getLimitTrack() {
        return limitTrack;
    }

    public void setLimitTrack(Integer limitTrack) {
        this.limitTrack = limitTrack;
    }

    public List<LaneEntity> getLanes() {
        return lanes;
    }

    public void setLanes(List<LaneEntity> lanes) {
        this.lanes = lanes;
    }
}
