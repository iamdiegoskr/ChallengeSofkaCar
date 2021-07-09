package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "podium")
public class PodiumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPodium;

    private Integer idGame;

    private Integer firstPlace;

    private Integer secondPlace;

    private Integer thirdPlace;


    public Integer getIdPodium() {
        return idPodium;
    }

    public void setIdPodium(Integer idPodium) {
        this.idPodium = idPodium;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(Integer firstPlace) {
        this.firstPlace = firstPlace;
    }

    public Integer getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(Integer secondPlace) {
        this.secondPlace = secondPlace;
    }

    public Integer getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(Integer thirdPlace) {
        this.thirdPlace = thirdPlace;
    }
}
