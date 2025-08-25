package tp2.laboratorio.pkg1.perry;

import java.util.Scanner;

public class OrniVerde extends PapaCastor implements MamaPato {

    //Constructor
    public OrniVerde(String nombre, double longitudCola, int propulsion) {
        super(nombre, longitudCola, propulsion);
    }

    //Implementacion de tocarOrgano() de la interfaz MamaPata
    @Override
    public void tocarOrgano() {
        Scanner sn = new Scanner(System.in);
        System.out.println("\nDo-Re-Mi");
        System.out.println("\nPresiona una tecla para continuar...");
        sn.nextLine(); // espera que el usuario presione una tecla
        System.out.println("\nFa-Sol-La-Si");
    }
    
    // M3todo propio: tocarGuitorgan
    public void tocarGuitorgan() {
        System.out.println("\n" + nombre + " está tocando el guitorgan:");
        super.tocarGuitarra();   // invoca el metodo del papá Castor
        this.tocarOrgano();      // invoca el metodo de la interfaz MamaPata
        System.out.println("\ncuac cuaac…!");
    }
}
