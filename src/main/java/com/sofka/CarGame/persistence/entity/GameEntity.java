package com.sofka.CarGame.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGame;

    private Integer numberPlayers;

    private Integer distance;

    @OneToOne(mappedBy = "game")
    private PodiumEntity podium;



    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(Integer numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public PodiumEntity getPodium() {
        return podium;
    }

    public void setPodium(PodiumEntity podium) {
        this.podium = podium;
    }
}
