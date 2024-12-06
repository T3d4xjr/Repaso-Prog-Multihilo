/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RatonMultiHilo;

/**
 *
 * @author tedax
 */
public class RatonHilo extends Thread{
    String nombre;
    int tiempoComer;

    public RatonHilo(String nombre, int tiempoComer) {
        this.nombre = nombre;
        this.tiempoComer = tiempoComer;
    }
    
    public void run(){
        try {
        System.out.println("El raton "+nombre+" ha empezado a comer" );
        
        Thread.sleep(tiempoComer*1000);
        
        System.out.println("El raton " +nombre+ " ha terminado de comer ");   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        RatonHilo rt1 = new RatonHilo("Fievel", 4);
        RatonHilo rt2 = new RatonHilo("Jerry", 5);
        RatonHilo rt3 = new RatonHilo("Pinky", 3);
        RatonHilo rt4 = new RatonHilo("Mickey", 6);
        
        rt1.start();
        rt2.start();
        rt3.start();
        rt4.start();
    }
    
}
