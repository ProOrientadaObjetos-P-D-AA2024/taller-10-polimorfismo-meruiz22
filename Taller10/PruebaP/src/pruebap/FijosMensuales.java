/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebap;

public class FijosMensuales extends Empleado {
    private double salarioFijo;

    public FijosMensuales( String nombres, String direccion, String cedula, Jefe jefe, double salarioFijo) {
        super(nombres, direccion, cedula, jefe);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
     return salarioFijo;
    }

    @Override
    public boolean esComisionista() {
       return false;
    }
    
}
