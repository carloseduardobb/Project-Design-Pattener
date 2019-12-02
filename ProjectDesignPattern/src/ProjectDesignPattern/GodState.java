/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDesignPattern;

/**
 *
 * @author edson
 */
public class GodState implements State {

    @Override
    public void atacar(float velocidadeAtaque) {
        System.out.println("Atacando na velocidade " + (velocidadeAtaque + 0.5));
    }

    @Override
    public void mover(float velocidadeMovimento) {
        System.out.println("Movendo Super Rapido na velocidade "+ (velocidadeMovimento + 10));
    } 
}
