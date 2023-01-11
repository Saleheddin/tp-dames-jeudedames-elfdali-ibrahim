
package com.mycompany.jeudedames;


public class Deplacement {
    private Position Frompos ;
    private Position Topos;
    private boolean ispossible ;
    private String type;

    public Position getFrompos() {
        return Frompos;
    }

    public Position getTopos() {
        return Topos;
    }

    public boolean isIspossible() {
        return ispossible;
    }

    public String getType() {
        return type;
    }

    public void setFrompos(Position Frompos) {
        this.Frompos = Frompos;
    }

    public void setTopos(Position Topos) {
        this.Topos = Topos;
    }

    public void setIspossible(boolean ispossible) {
        this.ispossible = ispossible;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public Deplacement(Position Frompos, Position Topos) {
        this.Frompos = Frompos;
        this.Topos = Topos;
    }
    
    public void ispossible(Position from, Position to){
        if(type=="queen"){
           
        }
    }
}
