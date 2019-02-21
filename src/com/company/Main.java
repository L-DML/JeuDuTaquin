package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean checkTaquinValid(Plateau plateau, Plateau resultat) {
        boolean validTaquin = true;
        for (int i = 0; i < plateau.getTaille(); i++) {
            for (int j = 0; j < plateau.getTaille(); j++) {
                System.out.println("Plateau " + plateau.pieces.get(i).get(j).getId());
                System.out.println("Résultat " + resultat.pieces.get(i).get(j).getId());
                if (plateau.pieces.get(i).get(j).getId() != resultat.pieces.get(i).get(j).getId()){
                    validTaquin = false;
                    System.out.println("Ya une couille");
                    break;
                }
            }
            System.out.println("Rang suivant");
        }
        return validTaquin;
    }

    public static int requestCommand(Plateau plateau, Plateau resultat) {
        int nbrTours = 1;
        boolean isItOkay = true;
        boolean partieFinie = false;
        System.out.println("Pour effectuer un déplacement : 4 = gauche, 8 = haut, 6 = droite, 2 = bas");

//        while (nbrTours > 0) {
        while (partieFinie == false) {
//            System.out.println("Il vous reste : " + nbrTours + " tours.");
            System.out.println("Vous êtes au tour n°" + nbrTours);
            System.out.println("État de la grille :");
            System.out.println(plateau);
            int pVide[] = plateau.getCoordCaseVide();
            System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
            System.out.print("Gauche 4 : " + (plateau.getCoordCaseVide()[0] - 1) + ", " + plateau.getCoordCaseVide()[1]);
            System.out.print(" --- Haut 8 : " + plateau.getCoordCaseVide()[0] + ", " + (plateau.getCoordCaseVide()[1] - 1));
            System.out.print(" --- Droite6 : " + (plateau.getCoordCaseVide()[0] + 1) + ", " + plateau.getCoordCaseVide()[1]);
            System.out.println(" --- Bas2 : " + plateau.getCoordCaseVide()[0] + ", " + (plateau.getCoordCaseVide()[1] + 1));

//            System.out.println("plateau.getCoordCaseVide()[0] - 1 : " + (plateau.getCoordCaseVide()[0] - 1));

            System.out.print("Effectuez un déplacement (4,8,6,2) : ");

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.print("Vous avez saisi : " + str);

            String act = "";
            switch (str) {
                case "4":
                    act = " - Gauche";
                    isItOkay = plateau.deplacerPiece((plateau.getCoordCaseVide()[0] - 1), plateau.getCoordCaseVide()[1]);
                    break;
                case "8":
                    act = " - Haut";
                    isItOkay = plateau.deplacerPiece(plateau.getCoordCaseVide()[0], (plateau.getCoordCaseVide()[1] - 1));
                    break;
                case "6":
                    act = " - Droite";
                    isItOkay = plateau.deplacerPiece((plateau.getCoordCaseVide()[0] + 1), plateau.getCoordCaseVide()[1]);
                    break;
                case "2":
                    act = " - Bas";
                    isItOkay = plateau.deplacerPiece(plateau.getCoordCaseVide()[0], (plateau.getCoordCaseVide()[1] + 1));
                    break;
                default:
                    act = "Veuillez effectuer un déplacement valide (4, 8, 6, 5)";
                    isItOkay = false;
                    break;
            }
            System.out.println(act);
            partieFinie = checkTaquinValid(plateau, resultat);
            if (partieFinie== true) {
                System.out.println(plateau);
                System.out.println("BRAVO VOUS AVEZ REUSSI");
                break;
            }
            if (isItOkay == true) {
                nbrTours++;
            }
        }
        System.out.println("Votre partie est terminée.");
        return nbrTours;
    }

    public static void main(String[] args) {

        Plateau plateau = new Plateau(3);
        Plateau resultat = new Plateau(3);

        System.out.println(plateau);
        System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println("Déplacement valide 1.2: " + plateau.deplacerPiece(1, 2));
        System.out.println(plateau);
        System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println("Déplacement valide 1.2: " + plateau.deplacerPiece(1, 2));
        System.out.println(plateau);
        System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println("Déplacement valide 2.2: " + plateau.deplacerPiece(2, 2));
        System.out.println(plateau);
        System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println("Déplacement valide 2.1: " + plateau.deplacerPiece(2, 1));
        System.out.println(plateau);
        System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println("Déplacement valide 0.1: " + plateau.deplacerPiece(0, 1));
        System.out.println(plateau);
        System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
        System.out.println("Déplacement valide 2.0: " + plateau.deplacerPiece(2, 0));
        System.out.println(plateau);
        System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);

        int score = requestCommand(plateau, resultat);
        System.out.println("Votre score est de : " + score);

    }
}
