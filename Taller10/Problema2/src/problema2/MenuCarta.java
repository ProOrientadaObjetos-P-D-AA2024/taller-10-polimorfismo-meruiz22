/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public class MenuCarta extends Menu {
    
     // Declarando atributos 
    private double valorInicial;
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    // Consttructor con atributos heredados de la clase Menu
    public MenuCarta(String nombrePlato,double valorInicial, double valorGuarnicion, 
            double valorBebida, double porcentajeServicio) {
        super(nombrePlato);
        this.valorInicial = valorInicial;
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    // Metodo para calular el valor del Menu
    @Override
    public void calcularValor() {
      valorMenu = valorInicial + valorGuarnicion + valorBebida + (valorInicial * porcentajeServicio / 100);  
    }
    
}
