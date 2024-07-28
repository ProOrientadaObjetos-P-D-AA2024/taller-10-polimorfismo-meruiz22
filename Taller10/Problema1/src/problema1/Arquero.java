/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;


public class Arquero extends Personaje {

    // Declaracion de variable 
    private double flecha;

    // Constructor con atrributos heredados de la clase personaje
    public Arquero( String nombre, double vida, int nivel, double experiencia,double flecha) {
        super(nombre, vida, nivel, experiencia);
        this.flecha = flecha;
    }
    public double getFlecha() {
        return flecha;
    }

    public void setFlecha(double flecha) {
        this.flecha = flecha;
    }

    // Metodos abstractos de la clasepersonaje implementados por la clase 
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("El arquero "+nombre+" dispara una flecha");
        enemigo.quitarVida(flecha);
    }

    @Override
    public void defender() {
        System.out.println("El arquero intenta evadir el ataque");
    }
    
    
    
    
    
    
   
    
}
