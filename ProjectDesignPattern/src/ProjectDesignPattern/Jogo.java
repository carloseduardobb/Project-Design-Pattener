/*
 * To change this license header, choose License Headers in Jogo Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDesignPattern;

/**
 *
 * @author Carlos Eduardo
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Personagem p = new Personagem();
        
        RacaSelecionada r = new Mago();
        
        p.classe();
        p.vidaBase();
        p.manaBase();
        p.velocidadeMovimentoBase();
        p.setClasse(r);
        p.classe();
        
    }
    
}
