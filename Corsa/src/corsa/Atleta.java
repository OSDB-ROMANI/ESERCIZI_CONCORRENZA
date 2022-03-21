/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class Atleta extends Thread{
    final static int tracciato = 100;
    public Atleta(String name) {
        super(name);
    }
    @Override
    public void run() {
        int percorsi = 0;
        try{
            do{
                percorsi = percorsi + (int)(Math.random()*10);
                System.out.println(this.getName()+" ho percorso "+percorsi);
                Thread.sleep(100);
            }while(percorsi<tracciato);
            System.out.println(this.getName()+" HO FINITO");
        }   catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
