/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebap;


public abstract class Empleado {

    protected String nombres;
    protected String direccion;
    protected String cedula;
    protected Jefe jefe;

    

    public Empleado(String nombres, String direccion, String cedula, Jefe jefe) {
        this.nombres = nombres;
        this.direccion = direccion;
        this.cedula = cedula;
        this.jefe = jefe;

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public abstract double calcularSalario();

    public abstract boolean esComisionista();
    
    
}
