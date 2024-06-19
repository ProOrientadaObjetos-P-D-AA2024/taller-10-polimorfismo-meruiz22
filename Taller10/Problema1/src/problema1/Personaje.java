/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author Usuario
 */
public abstract class Personaje {

    protected String nombre;
    protected double vida;
    protected int nivel;
    protected double experiencia;

    public Personaje(String nombre, double vida, int nivel, double experiencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public abstract void atacar(Personaje enemigo);

    public abstract void defender();

    public void quitarVida(double daño) {
        vida = vida - daño;

    }

    public void subirNivel() {
        int nivel = getNivel();
        int subir = nivel + 1;
        double experiencia= getExperiencia();
        double subirexpo= 100;
        System.out.println("---------------------------------------");
        System.out.println("| Nivel"+nivel+"|"+"\n| Aumentado ++ " + subir+" |");
        System.out.println("---------------------------------------");
        System.out.println("| Experiencia "+experiencia+" |"+"\n| Aumnetada ++ "+subirexpo+" |");

    }

}
