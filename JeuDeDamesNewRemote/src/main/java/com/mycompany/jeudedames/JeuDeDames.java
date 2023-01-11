
package com.mycompany.jeudedames;

import java.util.ArrayList;


public class JeuDeDames {

    public static void main(String[] args) {
        System.out.println("Jeu de dames ");
        Joueur bob= new Joueur();
        Joueur alice= new Joueur();

        Plateau field = new Plateau(8);
        /*
        ArrayList<Case> cases = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Case currentCase = new Case();
                cases.add(new Case(i, j));
                //System.out.println(currentCase);
                if ((i < 3 || i > 4)) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("-");
                    } else {
                        System.out.print("O");

                    }
                } else {
                    System.out.print("-");
                }

            }
            System.out.println("");
        }*/ 
    }
}
