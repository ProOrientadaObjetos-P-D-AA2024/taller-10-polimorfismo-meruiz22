/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public class MenuEconomico extends Menu {

     // Declarando atributos 
    private double valorInicial;
    private double porcentajeDescuento;

    // Consttructor con atributos heredados de la clase Menu
    public MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato);
        this.valorInicial = valorInicial;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    // Metodo para calular el valor del Menu
    @Override
    public void calcularValor() {

        double descuento = (valorInicial * porcentajeDescuento / 100);
        valorMenu = valorInicial - descuento;
    }

}
