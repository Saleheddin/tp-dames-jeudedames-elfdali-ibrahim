
package com.mycompany.jeudedames;

import java.util.ArrayList;
import java.util.Iterator;

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
        if(!cases[i][j].isempty()){
            cases[i][j].setPion(null);
        }
    }
    public boolean containsPieceWithPos(int i,int j){
        boolean pieceFound=false;
        if(!cases[i][j].isempty()){
            pieceFound = true;
        }
        return pieceFound;
    }
    
    
    
}
