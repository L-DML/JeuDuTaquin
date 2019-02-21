package com.company;

public class Jeu {

    private int nbPartie = 0;

    /**
     * La Class Jeu avait pour objectif de retenir les scores, associés à leur numéro de partie
     * Nous avions comme hypothèse de les stocker dans un HashMap (clé: nbPartie++ ; valeur: nbrTours;)
     * Pour des questions de priorisation, elle n'a pas été achevée
     * @param nbPartie
     */

    public Jeu(int nbPartie) {

        this.nbPartie = nbPartie;
        System.out.println("Dans le jeu vous avez effectué " + nbPartie + " parties" );
    }

    public int getNbPartie() {
        return nbPartie;
    }

    public void setNbPartie(int nbPartie) {
        this.nbPartie = nbPartie;
    }


}
