package com.company;

import java.util.Scanner;

public class Partie {

    /**
     * Vérifier si le taquin est gagnant
     * @param plateau
     * @param resultat
     * @return boolean vérifiant si le plateau après déplacement est gagnant ou non
     */
    public static boolean checkTaquinValid(Plateau plateau, Plateau resultat) {
        boolean validTaquin = true;
        for (int i = 0; i < plateau.getTaille(); i++) {
            for (int j = 0; j < plateau.getTaille(); j++) {

               // System.out.println("Plateau id " + plateau.pieces.get(i).get(j).getId());
               // System.out.println("Résultat id " + resultat.pieces.get(i).get(j).getId());

                if (plateau.pieces.get(i).get(j).getId() != resultat.pieces.get(i).get(j).getId()){
                    validTaquin = false;
                   // System.out.println("Le plateau n'est pas gagnant");
                    break;
                }
            }
           // System.out.println("Rang suivant");
        }
        return validTaquin;
    }

    /**
     * Effectuer des déplacements clavier jusqu'à ce que la partie soit terminée
     * @param plateau
     * @param resultat
     * @return int score égal au nombre de mouvements
     */
    public static int requestCommand(Plateau plateau, Plateau resultat) {
        int nbrTours = 1;
        boolean isItOkay = true;
        boolean partieFinie = false;
        System.out.println("Pour effectuer un déplacement : 4 = gauche, 8 = haut, 6 = droite, 2 = bas");
        System.out.println("\n");

        while (partieFinie == false) {
            System.out.println("Vous êtes au tour n°" + nbrTours);
            System.out.println("\n");
            System.out.println("État de la grille :");
            System.out.println("\n");
            System.out.println(plateau);
            System.out.println("\n");
            int pVide[] = plateau.getCoordCaseVide();

            /**
             * Commentaire de debug
             */
            //System.out.println("Case vide : " + plateau.getCoordCaseVide()[0] + ", " + plateau.getCoordCaseVide()[1]);
            //System.out.print("Gauche 4 : " + (plateau.getCoordCaseVide()[0] - 1) + ", " + plateau.getCoordCaseVide()[1]);
            //System.out.print(" --- Haut 8 : " + plateau.getCoordCaseVide()[0] + ", " + (plateau.getCoordCaseVide()[1] - 1));
            //System.out.print(" --- Droite6 : " + (plateau.getCoordCaseVide()[0] + 1) + ", " + plateau.getCoordCaseVide()[1]);
            //System.out.println(" --- Bas2 : " + plateau.getCoordCaseVide()[0] + ", " + (plateau.getCoordCaseVide()[1] + 1));

            System.out.print("Effectuez un déplacement (4,8,6,2) : ");
            System.out.println("\n");

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            System.out.print("Vous avez saisi : " + str);

            /**
             * En fonction de l'entré clavier on modifie l'abscisse l'ordonnée affectées au déplacement de la piece
             */
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
            System.out.println("\n");
            partieFinie = checkTaquinValid(plateau, resultat);

            if (partieFinie== true) {
                System.out.println(plateau);
                System.out.println("BRAVO VOUS AVEZ REUSSI");
                break;
            }
            if (isItOkay == true) {
                nbrTours++;
            } else {
                System.out.println("vous êtes sortie du plateau ! ");
            }
        }
        System.out.println("Votre partie est terminée.");
        return nbrTours;
    }
}
