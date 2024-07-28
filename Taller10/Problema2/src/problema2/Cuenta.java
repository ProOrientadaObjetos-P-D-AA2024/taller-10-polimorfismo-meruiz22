/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import java.util.List;


public class Cuenta {
   
    // Declarando atributos 
    private String nombreCliente;
    private List<Menu> listadoMenus;
    private double subtotal;
    private double iva;
    private double valorTotal;

    // Constructor
    public Cuenta(String nombreCliente, List<Menu> listadoMenus, double iva) {
        this.nombreCliente = nombreCliente;
        this.listadoMenus = listadoMenus;
        this.iva = iva;
    }
    
    
     public void establecerSubtotal() {
        subtotal = listadoMenus.stream().mapToDouble(Menu::getValorMenu).sum();
    }

    public void establecerValorCancelar() {
        valorTotal = subtotal + (subtotal * iva / 100);
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        sb.append("Listado de Menús:\n");
        for (Menu menu : listadoMenus) {
            sb.append(menu.toString()).append("\n");
        }
        sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("IVA: ").append(iva).append("\n");
        sb.append("Valor a Cancelar: ").append(valorTotal).append("\n");
        return sb.toString();
    }
    
    
}
