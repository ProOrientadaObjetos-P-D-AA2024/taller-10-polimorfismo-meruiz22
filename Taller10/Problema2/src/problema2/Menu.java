/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public abstract class Menu {

    // Declarando atributos
    protected String nombrePlato;
    protected double valorMenu;
    
    // Constructor
    public Menu(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    // Metodos abstractos 
    public abstract void calcularValor();

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }
    
     @Override
    public String toString() {
        return"Nombre del Plato:" + nombrePlato + " -Valor del Menú: "+valorMenu;
    }
}
    


