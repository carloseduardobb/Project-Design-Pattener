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
public class Arqueiro implements RacaSelecionada {
    
    public void classe(){
        System.out.println("Classe selecionada: Arqueiro");
    }

    @Override
    public float vidaBase() {
        return 150;
    }

    @Override
    public void manaBase() {
        System.out.println("Mana Base: 100");
    }

    @Override
    public void velocidaDeMovimentoBase() {
        System.out.println("Velocidade de Movimento Base: 310");
    }
    
}
