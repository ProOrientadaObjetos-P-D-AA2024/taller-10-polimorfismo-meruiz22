/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public class MenuDia extends Menu {

    // Declarando atributos  
    private double valorInicial;
    private double valorPostre;
    private double valorBebida;

    // Consttructor con atributos heredados de la clase Menu
    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato);
        this.valorInicial = valorInicial;
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    // Metodo para calular el valor del Menu
    @Override
    public void calcularValor() {

        valorMenu = valorInicial + valorPostre + valorBebida;
    }

}
