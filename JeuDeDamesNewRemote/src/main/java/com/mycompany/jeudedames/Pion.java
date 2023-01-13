
package com.mycompany.jeudedames;


public class Pion extends Piece{


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
        if(!this.caneat()){
            if(p.cases[this.pos.getAbscisse()+1][this.pos.getOrdonnee()+1].isempty()&& this.pos.getAbscisse()!=9){
                pos.tranlate(1, 1);
                this.PossibleMoves.add(pos);
            }else if(p.cases[this.pos.getAbscisse()-1][this.pos.getOrdonnee()-1].isempty() && this.pos.getAbscisse()!=0 ){
                pos.tranlate(-1, -1);
                this.PossibleMoves.add(pos);
            }
        }else{
            
        }
        

    }

   
    
}
