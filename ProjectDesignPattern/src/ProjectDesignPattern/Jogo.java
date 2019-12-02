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
        RacaSelecionada r1 = new Guerreiro();
        
        p.classe();
        p.Atributos();
        p.setClasse(r);
        p.classe();
        p.Atributos();
        p.setClasse(r1);
        p.classe();
        p.Atributos();
        
    }
    
}
