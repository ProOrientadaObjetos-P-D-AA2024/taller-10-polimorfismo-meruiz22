/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public class MenuNinos extends Menu {

     // Declarando atributos 
    private double valorInicial;
    private double valorHelado;
    private double valorPastel;

    // Consttructor con atributos heredados de la clase Menu
    public MenuNinos(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato);
        this.valorInicial = valorInicial;
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    // Metodo para calular el valor del Menu
    @Override
    public void calcularValor() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

}
