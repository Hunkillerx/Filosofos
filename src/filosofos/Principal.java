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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Silla s = new Silla();
        Palillo[] palillos= new Palillo[5];
        for(int i=0;i < palillos.length;i++){
            palillos[i]=new Palillo(i); 
        }
        Filosofo[] filosofos = new Filosofo[5];
        for(int i =0;i < filosofos.length;i++){
            filosofos[i] = new Filosofo(i,palillos[i],palillos[(i+1)%5],s);           
        }
        for(int i =0;i < filosofos.length;i++){
            filosofos[i].start();
        }
    }
    
}
