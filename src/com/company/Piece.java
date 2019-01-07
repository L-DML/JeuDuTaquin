package com.company;

public class Piece extends Case {

    int idPiece;

    public Piece(int nbPartie, int pX, int pY, int pLongueur, int cX, int cY, int cLongueur, boolean possessionPiece, int idPiece) {
        super(nbPartie, pX, pY, pLongueur, cX, cY, cLongueur, possessionPiece);
        this.idPiece = idPiece;
    }

    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }
}
