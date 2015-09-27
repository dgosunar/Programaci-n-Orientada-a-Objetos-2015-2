/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


/**
 *
 * @author Raúl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Andres", "Castro", 1200000);
        
        System.out.println(empleado1);
        System.out.println("\nIncremento 10%");
        empleado1.setSalario(empleado1.getSalario()+((empleado1.getSalario()*10)/100));
        System.out.println(empleado1);
        
    }
    
}
