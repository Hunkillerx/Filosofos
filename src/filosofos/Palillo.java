/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

/**
 *
 * @author jose
 */
public class Palillo {
    private int id;
    private boolean libre=true;
    
    public Palillo(int id){
        this.id = id;
    }
    
    public synchronized void qPalillo(int i) throws InterruptedException {
        while (!libre)
            wait();
        System.out.println("Filosofo " +i+ " coge palillo "+id);
        libre = false;
    }
    
    public synchronized void sPalillo(int i){
        libre = true;
        System.out.println("Filosofo "+ i +" suelta el palillo " +id);
        notify();
    }
}
