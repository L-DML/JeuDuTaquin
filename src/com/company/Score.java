package com.company;

public class Score extends Partie {

    int score;

    public Score(int nbPartie, int score) {
        super(nbPartie);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
