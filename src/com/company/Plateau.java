package com.company;

import java.util.ArrayList;

public class Plateau extends Piece {

    private int pTaille; // correspond à la longueur/largeur du carré



    public Plateau(int x, int y, String id, int pTaille) {
        super(x, y, id);
        this.pTaille = pTaille;
    }

    public void créerPlateau( int pTaille ,int x ,int y ,String id){

        /*for( int i=0 ; i < pTaille-1 ; i++) {
            Piece piece = new Piece(i, )
        }*/

        Piece p1 = new Piece ();
    }

    List<List<piece>>pieces = new ArrayList<List<piece>>();

}
