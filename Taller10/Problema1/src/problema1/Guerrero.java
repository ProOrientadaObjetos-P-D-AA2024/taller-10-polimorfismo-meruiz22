/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;


public class Guerrero extends Personaje {
   
    // Declaracion de variable 
    private double fuerza;

    // Constructor con atrributos heredados de la clase personaje
    public Guerrero( String nombre, double vida, int nivel, double experiencia,double fuerza) {
        super(nombre, vida, nivel, experiencia);
        this.fuerza = fuerza;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    // Metodos abstractos de la clasepersonaje implementados por la clase 
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("El guerrro "+nombre+" ataca con su espada");
        enemigo.quitarVida(fuerza);
    }

    @Override
    public void defender() {
        System.out.println("El guerrero "+nombre+" usa su escudo para defenderse");
        
    }
    
    
    
}
