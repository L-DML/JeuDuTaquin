package com.company;

import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.List;

public class Plateau  {


    int pTaille = 3; // correspond à la longueur/largeur du carré


    /** pieces : ArrayList de ArrayList */


    /** Methode Création Plateau **/
    ArrayList<ArrayList<String>> pieces = new ArrayList<ArrayList<String>>(pTaille);

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

    public void afficherPlateau(){

        for (int i = 0; i < pieces.size(); i++) {
            for (int j = 0; j < pieces.get(i).size(); j++) {
                System.out.print(pieces.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    // int pTaille = 3; // correspond à la longueur/largeur du carré

    /** pieces : ArrayList de ArrayList */

   //  ArrayList<ArrayList<Integer>>  pieces = new ArrayList<ArrayList<Integer>>(pTaille) ;

    /** On crée pTaille ArrayList **/

   /* ArrayList<Integer> l1 = new ArrayList<Integer>();
    l1.add(0,0, "A");*/


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


}
