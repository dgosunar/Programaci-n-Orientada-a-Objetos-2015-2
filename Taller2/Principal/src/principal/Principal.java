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
        Empleado empleado2 = new Empleado("Juan", "Jiménez", 560000);
        Empleado empleado3 = new Empleado("Pedro", "Rojas", 700000);
        Empleado empleado4 = new Empleado("Fabian", "Ramirez", 1000000);
        Empleado empleado5 = new Empleado("Gabriel", "Vargas", 1500000);
        
        System.out.println(empleado1 + "\n");
        System.out.println(empleado2 + "\n");
        System.out.println(empleado3 + "\n");
        System.out.println(empleado4 + "\n");
        System.out.println(empleado5 + "\n");
        System.out.println("\nIncremento 10%\n");
        empleado1.setSalario(empleado1.getSalario()+((empleado1.getSalario()*10)/100));
        empleado2.setSalario(empleado2.getSalario()+((empleado2.getSalario()*10)/100));
        empleado3.setSalario(empleado3.getSalario()+((empleado3.getSalario()*10)/100));
        empleado4.setSalario(empleado4.getSalario()+((empleado4.getSalario()*10)/100));
        empleado5.setSalario(empleado5.getSalario()+((empleado5.getSalario()*10)/100));
       System.out.println(empleado1 + "\n");
        System.out.println(empleado2 + "\n");
        System.out.println(empleado3 + "\n");
        System.out.println(empleado4 + "\n");
        System.out.println(empleado5 + "\n");
    }
    
}
