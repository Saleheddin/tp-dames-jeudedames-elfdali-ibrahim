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
    
    private int largeur;
    
    private int hauteur;
    
    
    private ArrayList<Piece> pieces;
    
    
    public void removeByPosition(){
        
    }
    
    
    public boolean containsPieceWithPos(int i,int j){
        Iterator it= pieces.iterator();
        boolean pieceFound=false;
        while(it.hasNext()){
            Piece p=(Piece) it.next();
            if(p.getPos().equals(new Position(i,j))){
                pieceFound=true;
            }
           
        }
        return pieceFound;
        
    }
    
    
    
}
