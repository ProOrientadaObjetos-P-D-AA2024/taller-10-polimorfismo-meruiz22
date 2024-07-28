/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import java.util.ArrayList;
import java.util.List;

public class Ejecutor1 {
   public static void main(String[] args) {
      // Crear objetos de tipo Menú de Niños
        MenuNinos menuNinos1 = new MenuNinos("Monstruos de Espagueti", 
                5.00, 1.00, 2.50);
        MenuNinos menuNinos2 = new MenuNinos("La Torre de Hamburguesas", 
                4.00, 1.00, 2.50);

        // Crear objeto de tipo Menú Económico
        MenuEconomico menuEconomico = new MenuEconomico("Hamburguesa con queso y patatas fritas", 
                8.00, 20.00);

        // Crear objeto de tipo Menú del Día
        MenuDia menuDelDia = new MenuDia("Lomo Saltado Explosivo", 
                10.00, 1.00, 1.00);

        // Crear objeto de tipo Menú a la Carta
        MenuCarta menuCarta = new MenuCarta("Lasagna Bolognesa de la Nonna",
                9.00, 1.50, 2.00, 10.00);

        // Agregar todos los menús a una lista
        List<Menu> listaMenus = new ArrayList<>();
        listaMenus.add(menuNinos1);
        listaMenus.add(menuNinos2);
        listaMenus.add(menuEconomico);
        listaMenus.add(menuDelDia);
        listaMenus.add(menuCarta);

        // Calcular el valor de cada menú
        listaMenus.forEach(Menu::calcularValor);

        // Crear objeto de tipo Cuenta
        Cuenta cuenta = new Cuenta("Maria ", listaMenus, 12);
        cuenta.establecerSubtotal();
        cuenta.establecerValorCancelar();

        // Imprimir la información de la cuenta
        System.out.printf("%s\n", cuenta);
        
        
    }  
}
