/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeudedames;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alexisibrahim
 */
public class Plateau {
    
    private int taille;
    private Case[][] cases ;
    
    
     public Plateau(int taille) {
        this.taille = taille;
        this.cases = new Case[taille][taille];
        boolean doitEtreBlanc;
        for (int y = 0; y < this.cases.length; y++) {
            doitEtreBlanc = (y%2 == 0);
            for (int x = 0; x < this.cases[y].length; x++) {
                if (doitEtreBlanc) {
                    this.cases[y][x] = new Case("B");
                    doitEtreBlanc = false;
                } else {
                    this.cases[y][x] = new Case("N");
                    doitEtreBlanc = true;
                }
            }
        }
    }
     
    
    public void removeByPosition(int i, int j){
        
    }
    public boolean containsPieceWithPos(int i,int j){
        boolean pieceFound=false;
        if(!cases[i][j].isempty()){
            pieceFound = true;
        }
        return pieceFound;
    }
    
    
    
}
