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

    private Raca raca;
    private static Personagem personagem;
    private State estadoAtual;

    private Personagem() {
        estadoAtual = new StandartState();
        raca = new Humano();
    }

    public void setClasse(Raca novaRaca) {
        this.raca = novaRaca;
    }

    public Raca getRaca() {
        return raca;
    }

    public static Personagem getPersonagem() {
        if (personagem == null) {
            personagem = new Personagem();
        }
        return personagem;
    }

    public void classe() {
        raca.classe();
    }

    private void setNewState(State novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void entrarTerrenoRuim() {
        setNewState(new CriticalState());
    }

    public void entrarTerrenoNormal() {
        setNewState(new StandartState());
    }

    public void mover() {
        estadoAtual.mover(raca.velocidadeDeAtaque());
    }

    public void atacar() {
        estadoAtual.atacar(raca.velocidaDeMovimentoBase());
    }

    public void Atributos() {
        System.out.println(getRaca().vidaBase());
        System.out.println(getRaca().manaBase());
        System.out.println(getRaca().velocidadeDeAtaque());
        System.out.println(getRaca().velocidaDeMovimentoBase());
    }

}
