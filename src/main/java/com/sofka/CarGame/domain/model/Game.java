package com.sofka.CarGame.domain.model;

public class Game {

    private int idGame;
    private int numberOfPlayers;
    private int distanceKM;

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public int getNumberPlayers() {
        return numberOfPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberOfPlayers = numberPlayers;
    }

    public int getDistance() {
        return distanceKM;
    }

    public void setDistance(int distanceKM) {
        this.distanceKM = distanceKM;
    }
}
