package com.company;

import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.List;

public class Plateau  {


    int pTaille = 3; // correspond à la longueur/largeur du carré


    /** pieces : ArrayList de ArrayList */

    ArrayList<ArrayList<String>> pieces = new ArrayList<ArrayList<String>>(pTaille);

    /** Methode Création Plateau **/

    public void creerPlateau(){


        ArrayList<String> l0 = new ArrayList<String>();
        l0.add("A");
        l0.add("B");
        l0.add("C");
        pieces.add(l0);


        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("D");
        l1.add("E");
        l1.add("F");
        pieces.add(l1);

        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("G");
        l2.add("H");
        l2.add(" ");
        pieces.add(l2);

    }

    /** Méthode Afficher le plateau **/

    public void afficherPlateau(){

        for (int i = 0; i < pieces.size(); i++) {
            for (int j = 0; j < pieces.get(i).size(); j++) {
                System.out.print(pieces.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }



    // List<ArrayList<Piece>> pieces ;


    /* public Plateau(int pTaille) {

        this.pTaille = pTaille;

        pieces = new ArrayList<ArrayList<Piece>>();

    } */
/*
    public void ajouter(Piece p){
        pieces.get(0).add(p);

    }
*/


   /* public void creerPlateau( int pTaille ,int x ,int y ,String id){

        for( int i=0 ; i < pTaille-1 ; i++) {
            Piece piece = new Piece(i, )
        }*/


    // List<ArrayList<Piece>> pieces = new ArrayList<ArrayList<Piece>>(); *

        /*Plateau plateau = new Plateau(4);

        Piece p1 = new Piece (0,0, "A");
        Piece p2 = new Piece(0, 1, "B");
        Piece p3 = new Piece(0,2, "C");
        Piece p4 = new Piece (1, 0, "D");
        Piece p5 = new Piece(1,1, "E");
        Piece p6 = new Piece(1,2, "F");
        Piece p7 = new Piece(2, 0, "G");
        Piece p8 = new Piece(2,1, "H");
        Piece p9 = new Piece(2,2, " ");*/

       /* plateau.ajouter(p1);
        plateau.ajouter(p2);
        plateau.ajouter(p3);
        plateau.ajouter(p4);
        plateau.ajouter(p5);
        plateau.ajouter(p6);
        plateau.ajouter(p7);
        plateau.ajouter(p8);
        plateau.ajouter(p9);*/


        /*pieces.add(new ArrayList<Piece>());

        pieces.get(0).add(p1);
        pieces.get(0).add(p2);
        pieces.get(0).add(p3);
        pieces.get(1).add(p4);
        pieces.get(1).add(p5);
        pieces.get(1).add(p6);
        pieces.get(2).add(p7);
        pieces.get(2).add(p8);
        pieces.get(2).add(p9);

        System.out.println(plateau);*/


}
