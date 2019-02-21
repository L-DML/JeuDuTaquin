package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Plateau {


    private int taille; // correspond à la longueur/largeur du carré


    /**
     * pieces : ArrayList de ArrayList
     */

    ArrayList<ArrayList<Piece>> pieces = new ArrayList<ArrayList<Piece>>(taille);

    /**
     * Methode Création Plateau
     **/

    public Plateau(int taille) {
        this.taille = taille;

        this.pieces = new ArrayList<>();

        for (int i = 0; i < this.taille; i++) {
            this.pieces.add(new ArrayList<>());

            for (int j = 0; j < this.taille; j++) {
                this.pieces.get(i).add(new Piece(j, i, j + this.taille * i));
            }
        }
    }

    public int getTaille() {
        return this.taille;
    }

    public int getNbCases() {
        return (int) Math.pow(this.taille, 2);
    }

    public int[] getCoordCaseVide() {
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j < this.taille; j++) {
                if (this.pieces.get(i).get(j).getId() == this.getNbCases() - 1) {
                    int[] res = {j, i};
                    return res;
                }
            }
        }
        return null;
    }

    public boolean coordLegale(int x, int y) {
        return x >= 0 && x < this.taille && y >= 0 && y < this.taille;
    }

    public boolean deplacerPiece(int x, int y) {
        int[] coordCaseVide = this.getCoordCaseVide();
        int caseVideX = coordCaseVide[0];
        int caseVideY = coordCaseVide[1];

        if (this.coordLegale(x, y) && !(x == caseVideX && y == caseVideY)) {
            if (x == caseVideX && (caseVideY - y == -1 || caseVideY - y == 1)) {
                Piece tmp = this.pieces.get(y).get(x);

                this.pieces.get(y).set(x, this.pieces.get(caseVideY).get(caseVideX));
                this.pieces.get(caseVideY).set(caseVideX, tmp);

                return true;
            } else if (y == caseVideY && (caseVideX - x == -1 || caseVideX - x == 1)) {
                Collections.swap(this.pieces.get(y), caseVideX, x);
                return true;
            }
        }
        return false;
    }

    /**
     * Melange du plateau
     */
    public void melangePiece(int k) {

        for (int i = 0; i < k; i++) {

            int x = (int) (Math.random() * (this.taille - 0)); //x

            int y = (int) (Math.random() * (this.taille - 0)); //y
           // System.out.println(x + " " + y);

            this.deplacerPiece(x, y );
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j < this.taille; j++) {
                int pId = this.pieces.get(i).get(j).getId();
                if (pId == this.getNbCases() - 1) {
                    sb.append("#");
                } else {
                    sb.append(pId);
                }
                if (j < this.taille - 1) {
                    sb.append(",");
                }
            }
            if (i < this.taille - 1) sb.append("\n");
        }
        return sb.toString();
    }
}
