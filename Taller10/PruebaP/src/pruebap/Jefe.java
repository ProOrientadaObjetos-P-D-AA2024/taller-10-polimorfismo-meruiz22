/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebap;

public class Jefe extends Empleado {
    private double  sueldoFijo;
    private double porcentajeadicional;

    public Jefe( String nombres, String direccion, String cedula,double sueldoFijo, double porcentajeadicional) {
        super(nombres, direccion, cedula,null);
        this.sueldoFijo = sueldoFijo;
        this.porcentajeadicional = porcentajeadicional;
    }
    
    
    
    
    @Override
    public double calcularSalario() {
    return sueldoFijo;
    
}
    
   

    @Override
    public boolean esComisionista() {
        return false;
    }
    

   
    }
