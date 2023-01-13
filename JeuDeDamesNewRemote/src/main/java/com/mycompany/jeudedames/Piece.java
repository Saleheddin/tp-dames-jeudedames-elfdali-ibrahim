
package com.mycompany.jeudedames;

import java.util.ArrayList;
import java.util.ArrayList;


public abstract class Piece {

    private Joueur possesseur;

    private boolean isEnJeu;

    protected Position pos;

    private String couleur;
    
    /**
     * all the possible moves that this pawn can do
     */
    protected ArrayList<Position> PossibleMoves;

    
    public Joueur getPossesseur() {
        return possesseur;
    }

    public void setPossesseur(Joueur possesseur) {
        this.possesseur = possesseur;
    }

    public boolean isIsEnJeu() {
        return isEnJeu;
    }

    public void setIsEnJeu(boolean isEnJeu) {
        this.isEnJeu = isEnJeu;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = new Position(pos);
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    
    public boolean isDeplacementPossible(Deplacement dep){
        return true;
        
    }

    public abstract boolean EatAgain();
    public abstract void move(Deplacement dep, Plateau pat);
    public abstract void updatePossibleMoves(Plateau p);
    public abstract boolean caneat();
}
