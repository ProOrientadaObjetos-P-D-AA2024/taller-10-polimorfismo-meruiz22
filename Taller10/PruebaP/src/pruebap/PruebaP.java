/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebap;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PruebaP {

    
    public static void main(String[] args) {
       Jefe jefe1 = new Jefe("Alberto Perez", "Av.Eduardo Kingman", "12345678", 3000, 0.10);

        
        FijosMensuales empFijo = new FijosMensuales("luisa", "Calle Paris ", "234590979", jefe1, 1500);
        Comisionistas empComisionista = new Comisionistas("Luis Hernandez", "Calle Real 789", "34245432", jefe1, 0.05, 20000);
        PorHora empHoras = new PorHora("Juan Iñoguez", "Callle Principal", "1234656576", jefe1,10.6, 1.30);

        
        
        
    }

    public static void generarCSV(List<Empleado> empleados) {
        String archivoCSV = "nomina.csv";
        try (FileWriter writer = new FileWriter(archivoCSV)) {
            writer.append("Nombre,Direccion,Cedula,Jefe,Salario\n");
            for (Empleado emp : empleados) {
                writer.append(emp.getNombres())
                      .append(",")
                      .append(emp.getDireccion())
                      .append(",")
                      .append(emp.getCedula())
                      .append(",")
                      .append(emp.getJefe() != null ? emp.getJefe().getNombres() : "N/A")
                      .append(",")
                      .append(String.valueOf(emp.calcularSalario()))
                      .append("\n");
            }
            System.out.println("Archivo CSV generado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
    

