/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

public class EjecutarJuegoRol {

    public static void main(String[] args) {

        /* Creando objetos personajes pasando los para metros nombre,vida,nivel,
        experinecia,ataque que depende del tipo de personaje */
        Guerrero guerrero = new Guerrero("Arturo", 150.55, 16, 100.0, 30.0);
        Mago mago = new Mago("Merlin", 120.00, 14, 100.0, 45.0);
        Arquero arquero = new Arquero("Robin Hoob", 100.0, 15, 100.0, 35.5);
        Mago mago2 = new Mago("Salazar", 120.00, 12, 100.0, 40.0);

        // Invacando metodo para el combate entre personajes 
        combate(guerrero, mago);
        combate(mago2, arquero);
        combate(arquero, guerrero);
    }

    // Metodo para el combate entre personajes 
    public static void combate(Personaje p1, Personaje p2) {
        System.out.println("Combate entre " + p1.getNombre() + " y " + p2.getNombre());
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            p1.atacar(p2);
            p2.defender();
            if (p2.getVida() > 0) {
                p2.atacar(p1);
                p1.defender();
            }
        }

        if (p1.getVida() > 0) {
            System.out.println(p1.getNombre() + " gana la batalla!");
            p1.subirNivel();
        } else {
            System.out.println(p2.getNombre() + " gana la batalla!");
            p2.subirNivel();
        }
    }

}
