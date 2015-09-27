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


public class Empleado {

    private String Nombre;
    private String Apellido;
    private double Salario;

    public Empleado(String Nombre, String Apellido, double Salario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        if (Salario < 0)this.Salario = Salario;
        else this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public double getSalario() {
        return Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + "\nApellido: " + Apellido + "\nSalario: " + Salario;
    }
    
    
    
}
