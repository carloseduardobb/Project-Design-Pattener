/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDesignPattern;

/**
 *
 * @author Carlos Eduardo
 */
public class Personagem {
    
    private RacaSelecionada raca = new Humano();
    
    public void setClasse(RacaSelecionada novaRaca ){
        this.raca = novaRaca;
    }
    
    public void Classe(){
        raca.Classe();
    }
    
}
