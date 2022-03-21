/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsa2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class Atleta implements Runnable{
    final static int tracciato = 100;
    private Classifica c;
    private String name;
    public Atleta(String name, Classifica c) {
        this.name = name;
        this.c = c;
    }
    @Override
    public void run() {
        int percorsi = 0;
        try{
            do{
                percorsi = percorsi + (int)(Math.random()*10);
                Thread.sleep(100);
            }while(percorsi<tracciato);
            c.setPosto(name);
            System.out.println(name+" arrivato");
        }   catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
