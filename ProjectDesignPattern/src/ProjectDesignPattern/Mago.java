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
public class Mago implements RacaSelecionada {
    @Override
    public void classe(){
        System.out.println("Classe selecionada: Mago");
    }

    @Override
    public float vidaBase() {
        return 100;
    }

    @Override
    public float manaBase() {
        return 200;
    }
     public float velocidadeDeAtaque(){
        return (float) 0.5;
    }

    @Override
    public float velocidaDeMovimentoBase() {
        return 325;
    }
}
