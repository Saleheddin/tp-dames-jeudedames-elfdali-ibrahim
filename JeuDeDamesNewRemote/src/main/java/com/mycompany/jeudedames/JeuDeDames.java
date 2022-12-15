/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.jeudedames;

import java.util.ArrayList;

/**
 *
 * @author alexisibrahim
 */
public class JeuDeDames {

    public static void main(String[] args) {
        System.out.println("Jeu de dames ");
        Joueur bob= new Joueur();
        Joueur alice= new Joueur();

        ArrayList<Case> cases = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Case currentCase = new Case(i, j);
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
        }
    }
}
