/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebap;


public class Comisionistas extends Empleado {
    private double porcentajeFijo;
    private double ventasRealizadas;

    public Comisionistas(String nombres, String direccion, String cedula, Jefe jefe,double porcentajeFijo, double ventasRealizadas) {
        super(nombres, direccion, cedula, jefe);
        this.porcentajeFijo = porcentajeFijo;
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public double calcularSalario() {
        return porcentajeFijo*ventasRealizadas;
    }
    
    @Override
    public boolean esComisionista() {
        return true;
    }
    
}
