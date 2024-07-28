/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.ArrayList;
import java.util.List;

public class Ejecutor2 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        List<Menu> lista = new ArrayList<>();

        // Procesar Menús de Niños
        for (String[] datos : datos001) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double valorHelado = Double.parseDouble(datos[2]);
            double valorPastel = Double.parseDouble(datos[3]);
            MenuNinos menuNinos = new MenuNinos(nombre, valorInicial, 
                    valorHelado, valorPastel);
            lista.add(menuNinos);
        }

        // Procesar Menús Económicos
        for (String[] datos : datos002) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double porcentajeDescuento = Double.parseDouble(datos[2]);
            MenuEconomico menuEconomico = new MenuEconomico(nombre, 
                    valorInicial, porcentajeDescuento);
            lista.add(menuEconomico);
        }

        // Procesar Menús del Día
        for (String[] datos : datos003) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double valorPostre = Double.parseDouble(datos[2]);
            double valorBebida = Double.parseDouble(datos[3]);
            MenuDia menuDelDia = new MenuDia(nombre, valorInicial, valorPostre, valorBebida);
            lista.add(menuDelDia);
        }

        // Procesar Menús a la Carta
        for (String[] datos : datos004) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double valorGuarnicion = Double.parseDouble(datos[2]);
            double valorBebida = Double.parseDouble(datos[3]);
            double porcentajeServicio = Double.parseDouble(datos[4]);
            MenuCarta menuCarta = new MenuCarta(nombre, valorInicial, 
                    valorGuarnicion, valorBebida, porcentajeServicio);
            lista.add(menuCarta);
        }

        // Calcular el valor de cada menú
        for (Menu menu : lista) {
            menu.calcularValor();
        }

        // Crear objeto de tipo Cuenta
        Cuenta cuenta = new Cuenta("Luis Andrade", lista, 10);
        cuenta.establecerSubtotal();
        cuenta.establecerValorCancelar();

        // Imprimir la información de la cuenta
        System.out.printf("%s\n", cuenta);
    }

}
