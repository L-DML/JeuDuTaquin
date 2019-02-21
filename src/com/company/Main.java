package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Plateau plateau = new Plateau(3);

        System.out.println(plateau);
        System.out.println(plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);

        System.out.println(plateau.deplacerPiece(1, 2));
        System.out.println(plateau);
        System.out.println(plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println(plateau.deplacerPiece(1, 2));
        System.out.println(plateau);
        System.out.println(plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println(plateau.deplacerPiece(2, 2));
        System.out.println(plateau);
        System.out.println(plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println(plateau.deplacerPiece(2, 1));
        System.out.println(plateau);
        System.out.println(plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println(plateau.deplacerPiece(0, 1));
        System.out.println(plateau);
        System.out.println(plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);


    }
}
