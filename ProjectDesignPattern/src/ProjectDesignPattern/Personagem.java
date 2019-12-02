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

    private Raca raca = new Humano();
    private static Personagem personagem;

    private Personagem() {
        System.out.println("Logando Conta");
    }

    public void setClasse(Raca novaRaca) {
        this.raca = novaRaca;
    }

    public Raca getRaca() {
        return raca;
    }

    public synchronized static Personagem getPersonagem() {
        if (personagem == null) {
            personagem = new Personagem();
        }
        return personagem;
    }

    public void classe() {
        raca.classe();
    }

    public void Atributos() {
        System.out.println(getRaca().vidaBase());
        System.out.println(getRaca().manaBase());
        System.out.println(getRaca().velocidadeDeAtaque());
        System.out.println(getRaca().velocidaDeMovimentoBase());
    }

}
