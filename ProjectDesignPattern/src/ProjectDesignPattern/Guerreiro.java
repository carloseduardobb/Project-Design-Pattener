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
public class Guerreiro implements Raca{
    
    public void classe(){
        System.out.println("Classe selecionada: Guerreiro");
    }

    @Override
    public float vidaBase() {
        return 200;
    }

    @Override
    public float manaBase() {
         return 75;
    }
    public float velocidadeDeAtaque(){
        return (float) 1.5;
    }

    @Override
    public float velocidaDeMovimentoBase() {
        return 345;
    }
}
