package com.company;

public class Case extends Plateau {

    int cX ;
    int cY ;
    int cLongueur;
    boolean possessionPiece;

    public Case(int nbPartie, int pX, int pY, int pLongueur, int cX, int cY, int cLongueur, boolean possessionPiece) {
        super(nbPartie, pX, pY, pLongueur);
        this.cX = cX;
        this.cY = cY;
        this.cLongueur = cLongueur;
        this.possessionPiece = possessionPiece;
    }

    public int getcX() {
        return cX;
    }

    public void setcX(int cX) {
        this.cX = cX;
    }

    public int getcY() {
        return cY;
    }

    public void setcY(int cY) {
        this.cY = cY;
    }

    public int getcLongueur() {
        return cLongueur;
    }

    public void setcLongueur(int cLongueur) {
        this.cLongueur = cLongueur;
    }

    public boolean isPossessionPiece() {
        return possessionPiece;
    }

    public void setPossessionPiece(boolean possessionPiece) {
        this.possessionPiece = possessionPiece;
    }
}
