/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RatonMonoHilo;

/**
 *
 * @author tedax
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Raton raton1 =new Raton("Fievel", 4);
        Raton raton2 =new Raton("Jerry", 5);
        Raton raton3 =new Raton("Pinky", 3);
        Raton raton4 =new Raton("Mickey", 6);
        
        raton1.comer();
        raton2.comer();
        raton3.comer();
        raton4.comer();
        
    }
}
