package tp2.laboratorio.pkg1.perry;

import java.util.Scanner;

public class OrniVerde extends PapaCastor implements MamaPato {

    private String nombre;
    private final double pico = 6.8; // cm
    private final double patas = 7.5; // cm


    //Constructor
    public OrniVerde(String nombre, int velocidad, int longitudCola, double propulsion) {
        super(nombre, velocidad, longitudCola, propulsion);
        this.nombre = nombre;
    }

    //Implementacion de tocarOrgano() de la interfaz MamaPata
    @Override
    public void tocarOrgano() {
        Scanner sn = new Scanner(System.in);
        System.out.println("\nDo-Re-Mi");
        System.out.println("\nPresiona una tecla para continuar...");
        sn.nextLine(); // espera que el usuario presione una tecla
        System.out.println("Fa-Sol-La-Si");
    }
    
    // Metodo propio: tocarGuitorgan
    public void tocarGuitorgan() {
        System.out.println("\n" + nombre + " está tocando el guitorgan:\n");
        super.tocarGuitarra();   // invoca el metodo del papá Castor
        this.tocarOrgano();      // invoca el metodo de la interfaz MamaPata
        System.out.println("\ncuac cuaac…!");
    }
}
