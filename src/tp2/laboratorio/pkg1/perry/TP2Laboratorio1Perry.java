
package tp2.laboratorio.pkg1.perry;

import java.util.Scanner;

public class TP2Laboratorio1Perry {

    public static void main(String[] args) {
        System.out.println("Prueba Mati");
        System.out.println("Prueba Eze ._.");

        //Mati (Pueden modificarlo libremente si quieren :D)
        Scanner key = new Scanner(System.in);
        PapaCastor papaCastor = null;
        OrniVerde orniVerde = null;
        String nombre = null;
        double longitudCola = 0;
        int propulsion = 0;

        System.out.println("\n--- Ingresa los datos de los mamiferos ---");
        while(true){
            try{
                System.out.println("\n Datos del Papa Castor:");
                System.out.print("Nombre: "); nombre = key.nextLine();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextDouble();
                System.out.print("Propulsion (5km/h a 10km/h): "); propulsion = key.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Error: Debes ingresar un número valido.");
            }catch(Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            }

            //El condicional para que puede salir del bucle y no haya error.
            if(!nombre.isEmpty() && longitudCola > 0 && (propulsion > 5 && propulsion <= 10)){
                papaCastor = new PapaCastor(nombre, longitudCola, propulsion);
                key.nextLine(); // limpiar el buffer
                break;
            }else{
                System.out.println("Error: Debes ingresar valores validos.");
                key.nextLine(); // limpiar el buffer
            }
        }

        while(true){
            try{
                System.out.println("\n Datos del OrniVerde:");
                System.out.print("Nombre: "); nombre = key.nextLine();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextDouble();
                System.out.print("Propulsion (5km/h a 10km/h): "); propulsion = key.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Error: Debes ingresar un número valido.");
            }catch(Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            }

            if(!nombre.isEmpty() && longitudCola > 0 && (propulsion > 5 && propulsion <= 10)){
                orniVerde = new OrniVerde(nombre, longitudCola, propulsion);
                key.nextLine(); // limpiar el buffer
                break;
            }else{
                System.out.println("Error: Debes ingresar valores validos.");
                key.nextLine(); // limpiar el buffer
            }
        }

        //Falta crear dos orniAzules y probar sus metodos
    }
}
