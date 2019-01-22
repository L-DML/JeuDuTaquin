package com.company;

import static java.sql.DriverManager.println;
import static jdk.nashorn.internal.objects.Global.print;

public class Main {

    public static void main(String[] args) {
        String[][] pieces;
        String id;
        int x;
        int y;

        public int[] coordPieceVide(){
            int tab[];
            for (int i = 0; i < pieces.length-1; i++) {
                for (int j = 0; j < pieces.length-1; j++) {
                    if (pieces[i][j] == " ") {
                        println("Pièce vide trouvée !");
                        tab[0] = i
                        tab[1] = j;
                    }
                }
            }
            return tab;
        }

        public void deplacer(int x, int y, String id) {
            //On récupère l'emplacement de la piece vid
            int[] pVide = pVide.coordPieceVide();

            /*Ca on s'en ballek pour l'instant d'abord faut que ça marche*/
            /*int pX = x;
            int pY = y;
            String pID = id;*/

            /*On envoie le contenu ver*/
            pieces[pVide[0], pVide[1]] = id;
            println("La pièce : " + id + "a été déplacée.");
        }

        String moveID = "A";
//        deplacer(0,2,moveID);
        System.out.println("Zeubi");
    }
}
