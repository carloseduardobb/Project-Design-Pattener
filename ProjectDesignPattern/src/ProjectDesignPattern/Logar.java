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
public class Logar {
    private static Logar logar;
    
    private Logar(){
        System.out.println("Logando Conta");
    }
    
    public synchronized static Logar getLogar() {
        if (logar == null) {
            logar = new Logar();
        }
        return logar;
    }
    
}
