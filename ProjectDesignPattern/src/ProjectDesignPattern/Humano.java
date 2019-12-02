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
public class Humano implements Raca {
    public void classe(){
        System.out.println("Raca Inicial Humano");
    }

    @Override
    public float vidaBase() {
        return 50;
    }

    @Override
    public float manaBase() {
        return 50;
    }
    public float velocidadeDeAtaque(){
        return 1;
    }
    @Override
    public float velocidaDeMovimentoBase() {
        return 300;
    }
}
