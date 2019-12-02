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
public class Guerreiro implements RacaSelecionada{
    
    public void classe(){
        System.out.println("Classe selecionada: Guerreiro");
    }

    @Override
    public void vidaBase() {
           System.out.println("Vida Base: 200");
    }

    @Override
    public void manaBase() {
         System.out.println("Mana Base: 75");
    }

    @Override
    public void velocidadeMovimentoBase() {
        System.out.println("Velocidade de Movimento Base: 345");
    }
}
