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
    private int numero;
    
    private int abscisse;
    
    private int ordonnee;
    
    private String couleur;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public Case(int numero, int abscisse, int ordonnee) {
        this.numero = numero;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public Case(int abscisse, int ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    @Override
    public String toString() {
        return "Case{" + "numero=" + numero + ", abscisse=" + abscisse + ", ordonnee=" + ordonnee + '}';
    }
    
    
}
