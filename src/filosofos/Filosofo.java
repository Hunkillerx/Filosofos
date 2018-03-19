/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class Filosofo extends Thread {

    private int id;
    private Palillo izda, dcha;
    private Silla s;
    
    public Filosofo(int id, Palillo izda, Palillo dcha, Silla s) {
        this.id = id;
        this.izda = izda;
        this.dcha = dcha;
        this.s = s;
    }

    public void run() {
        while (true) {
            try { 
                s.qSilla(id);
                izda.qPalillo(id);
                dcha.qPalillo(id);
                // comer
                System.out.println("Filosofo "+id+" Ya comio");
                dcha.sPalillo(id);
                izda.sPalillo(id);
                s.sSilla(id);
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
