/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsa2;

/**
 *
 * @author Paolo
 */
public class Corsa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Classifica c = new Classifica(5);
        c.start();
        new Thread(new Atleta("A",c)).start();
        new Thread(new Atleta("B",c)).start();
        new Thread(new Atleta("C",c)).start();
        new Thread(new Atleta("D",c)).start();
        new Thread(new Atleta("E",c)).start();
        
    }
    
}
