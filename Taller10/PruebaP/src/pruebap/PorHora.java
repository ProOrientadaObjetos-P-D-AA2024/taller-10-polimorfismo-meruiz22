/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebap;

public class PorHora extends Empleado {

    private double precioPorHora;
    private double horasRealizadas;

    public PorHora(String nombres, String direccion, String cedula, Jefe jefe,
            double precioPorHora, double horasRealizadas) {
        super(nombres, direccion, cedula, jefe);
        this.precioPorHora = precioPorHora;
        this.horasRealizadas = horasRealizadas;
    }

    @Override
    public double calcularSalario() {
        if (horasRealizadas <= 40) {
            return horasRealizadas * precioPorHora;
        } else {
            return 40 * precioPorHora + (horasRealizadas - 40) * precioPorHora * 2;
        }
    }
    
    @Override
    public boolean esComisionista() {
        return false;
    }
}
