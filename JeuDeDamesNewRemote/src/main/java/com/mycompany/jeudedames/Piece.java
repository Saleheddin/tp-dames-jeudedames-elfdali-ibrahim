/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeudedames;

import java.util.List;

/**
 *
 * @author alexisibrahim
 */
public abstract class Piece {

    private Joueur possesseur;

    private boolean isEnJeu;

    private Position pos;

    private String couleur;
    
    private List<Position> PossibleMoves;

    
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
    public abstract void updatePossibleMoves();
}
