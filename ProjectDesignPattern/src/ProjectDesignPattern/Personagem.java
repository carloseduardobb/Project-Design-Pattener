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
    private RacaSelecionada vidabase = new Humano();
    private RacaSelecionada manabase = new Humano();
    private RacaSelecionada velocidademovimentobase = new Humano();
    
    public void setClasse(RacaSelecionada novaRaca ){
        this.raca = novaRaca;
    }
    public void setVidaBase(RacaSelecionada novaVida){
        this.vidabase = novaVida;
    }
    public void setManaBase(RacaSelecionada novaMana){
        this.manabase = novaMana;
    }
    public void setVelocidadeMovimentoBase(RacaSelecionada novaVelocidadeMovimentoBase){
        this.velocidademovimentobase = novaVelocidadeMovimentoBase;
    }
    
    public void classe(){
        raca.classe();
    }
    public void vidaBase(){
        vidabase.vidaBase();
    }
    public void manaBase(){
        manabase.manaBase();
    }
    public void velocidadeMovimentoBase(){
        velocidademovimentobase.velocidadeMovimentoBase();
    }
    
    
}
