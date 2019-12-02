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
    private static Personagem logar;
    
    Personagem(){
        System.out.println("Logando Conta");
    }
    
    public void setClasse(RacaSelecionada novaRaca ){
        this.raca = novaRaca;
    }
    
   
     
    public RacaSelecionada getRaca(){
        return raca;
    }
    
    
    
    public synchronized static Personagem getLogar() {
        if (logar == null) {
            logar = new Personagem();
        }
        return logar;
    }
    
    public void classe(){
        raca.classe();
    }
    
    public void Atributos(){
        System.out.println(getRaca().vidaBase());
        System.out.println(getRaca().manaBase());
        System.out.println(getRaca().velocidadeDeAtaque());
        System.out.println(getRaca().velocidaDeMovimentoBase());
    }
    
    
    
    
}
