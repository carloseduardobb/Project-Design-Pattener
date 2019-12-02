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
public class Arqueiro implements Raca {
    
    public void classe(){
        System.out.println("Classe selecionada: Arqueiro");
    }

    @Override
    public float vidaBase() {
        return 150;
    }

    @Override
    public float manaBase() {
        return 100;
    }
     public float velocidadeDeAtaque(){
        return  2;
    }

    @Override
    public float velocidaDeMovimentoBase() {
        return 350;
    }
    
}
