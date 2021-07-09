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

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getDistanceKM() {
        return distanceKM;
    }

    public void setDistanceKM(int distanceKM) {
        this.distanceKM = distanceKM;
    }
}
