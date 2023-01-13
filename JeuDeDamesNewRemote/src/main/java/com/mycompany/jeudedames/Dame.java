
package com.mycompany.jeudedames;

public class Dame extends Piece {
    
    public Dame(Pion p){
        
    }

    @Override
    public boolean caneat() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean EatAgain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(Deplacement dep, Plateau pat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePossibleMoves(Plateau p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
