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
public class Joueur {
    
    private String nom;
    
    private ArrayList<Piece> pieces;
    
    
    
    public void deplacerPiece(int i,int j, ArrayList<Deplacement> dep){
        
        
        
    }
    
    public Piece getPiecesByPosition(int i, int j){
        
    Iterator it= pieces.iterator();
            Piece pieceFound=null;

    while(it.hasNext()){
        Piece currentPiece=(Piece) it.next();
        if(currentPiece.getPos().equals(new Position(i,j))){
            pieceFound=currentPiece;
            
            
        }
        
    }
    if(pieceFound==null){
        System.out.println("Piece non trouvée !!!");
    }
    
    return pieceFound;
    }
    
    
}
