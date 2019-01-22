package com.company;

public class Plateau extends Jeu {


    int pX ;
    int pY ;
    int pLongueur;

    public Plateau(int nbPartie, int pX, int pY, int pLongueur) {
        super(nbPartie);
        this.pX = pX;
        this.pY = pY;
        this.pLongueur = pLongueur;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    public int getpLongueur() {
        return pLongueur;
    }

    public void setpLongueur(int pLongueur) {
        this.pLongueur = pLongueur;
    }
}
