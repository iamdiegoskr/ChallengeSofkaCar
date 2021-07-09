package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "podium")
public class PodiumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPodium;

    private Integer idGame;

    @OneToOne
    private DriverEntity firstPlace;

    @OneToOne
    private DriverEntity secondPlace;

    @OneToOne
    private DriverEntity thirdPlace;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idGame", referencedColumnName = "idGame")
    private GameEntity game;


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

    public DriverEntity getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(DriverEntity firstPlace) {
        this.firstPlace = firstPlace;
    }

    public DriverEntity getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(DriverEntity secondPlace) {
        this.secondPlace = secondPlace;
    }

    public DriverEntity getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(DriverEntity thirdPlace) {
        this.thirdPlace = thirdPlace;
    }

    public GameEntity getGame() {
        return game;
    }

    public void setGame(GameEntity game) {
        this.game = game;
    }
}
