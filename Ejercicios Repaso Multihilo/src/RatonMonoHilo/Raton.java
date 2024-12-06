/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RatonMonoHilo;

/**
 *
 * @author tedax
 */
public class Raton {
    String nombre;
    int tiempoComer;

    public Raton(String nombre, int tiempoComer) {
        this.nombre = nombre;
        this.tiempoComer = tiempoComer;
    }
    
    public void comer() throws InterruptedException{
        System.out.println("El raton "+nombre+ " ha empezado a comer");
        
        Thread.sleep(tiempoComer*1000);
        
        System.out.println("El raton "+nombre+ " ha dejado de comer");
        
    }
}
