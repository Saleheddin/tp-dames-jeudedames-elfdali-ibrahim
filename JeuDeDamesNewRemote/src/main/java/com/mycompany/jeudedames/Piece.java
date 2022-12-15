/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeudedames;

/**
 *
 * @author alexisibrahim
 */
public abstract class Piece {

    private Joueur possesseur;

    private boolean isEnJeu;

    private int abscisse;

    private int ordonnee;

    private String couleur;

    public abstract void deplacer();

}
