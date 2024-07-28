/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

public class Mago extends Personaje {

    // Declaracion de variable 
    private double podermagico;

    // Constructor con atrributos heredados de la clase personaje
    public Mago(String nombre, double vida, int nivel, double experiencia, double podermagico) {
        super(nombre, vida, nivel, experiencia);
        this.podermagico = podermagico;
    }

    public double getPodermagico() {
        return podermagico;
    }

    public void setPodermagico(double podermagico) {
        this.podermagico = podermagico;
    }

    // Metodos abstractos de la clasepersonaje implementados por la clase 
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println("El mago " + nombre + " usa un hechizo de ataque");
        enemigo.quitarVida(podermagico);

    }

    @Override
    public void defender() {

        System.out.println("El mago " + nombre + "activa una barrera magica");

    }

}
