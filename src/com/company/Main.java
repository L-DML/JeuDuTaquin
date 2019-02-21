package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char recommencer;
        int nbPartie = 0;
        Jeu nombrePartie = new Jeu(nbPartie);

        do{
            System.out.println("Veuillez choisir une taille ");
            Scanner sc = new Scanner(System.in);
            int taille = sc.nextInt();

            Plateau plateau = new Plateau(taille);
            Plateau resultat = new Plateau(taille);


            System.out.println(plateau);
            System.out.println("\n");
            plateau.melangePiece(taille * 100);


            Partie partie = new Partie();

            int nbrTours = partie.requestCommand(plateau, resultat);
            System.out.println("Vous avez résolu taquin en : " + nbrTours + " mouvements");
            System.out.println("\n");

            nbPartie++ ;

            do {
                System.out.println("Voulez vous recommencer o|n");
                sc.nextLine();
                recommencer = sc.nextLine().charAt(0);
            } while(recommencer != 'o' && recommencer != 'n');

        } while (recommencer == 'o');
        System.out.println("Vous avez arrêtez de jouer :) À bientôt ");
        System.out.println("Vous avez effectué " + nbPartie + " parties" );
        System.out.println(nombrePartie);

    }
}
