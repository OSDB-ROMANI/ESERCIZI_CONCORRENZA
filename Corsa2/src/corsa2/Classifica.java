/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsa2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class Classifica extends Thread{
    private String[] lista;
    private int pos = 0;
    private boolean fine= true;
    
    public Classifica(int num){
        lista = new String[num];
    }
    
    public synchronized void setPosto(String name){
        lista[pos] = name;
        pos++;
        if(pos == lista.length){
            fine = false;
 
        }
    }
    
    @Override
    public void run(){
        System.out.println("CORSA INIZIA");
        while(fine){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Classifica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("CLASSIFICA");
        for(int i=0; i<lista.length;i++)
            System.out.println(i+1+" "+lista[i]);        
    }
}
