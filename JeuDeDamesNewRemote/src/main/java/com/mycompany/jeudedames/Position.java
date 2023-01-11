
package com.mycompany.jeudedames;


public class Position {
    
    private int ordonnee;
    
    private int abscisse;

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public Position(int ordonnee, int abscisse) {
        this.ordonnee = ordonnee;
        this.abscisse = abscisse;
    }

    public Position(Position pos) {
        this.ordonnee=pos.getOrdonnee();
        this.abscisse=pos.getAbscisse();
    }
    
    
    
}
