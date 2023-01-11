/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeudedames;

/**
 *
 * @author alexisibrahim
 */
public class Case {
    private Position pos;
    private Pion pion;
    private String couleur;

    
    public void setPion(Pion pion) {
        this.pion = pion;
    }

    public Pion getPion() {
        return pion;
    }
    
    public Case(String couleur) {
        this.couleur = couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }
    
    public boolean isempty(){
        if(this.pion == null){
            return true;
        }
        return false;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
