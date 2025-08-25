
package tp2.laboratorio.pkg1.perry;

import java.util.Scanner;

public class TP2Laboratorio1Perry {

    public static void main(String[] args) {
      NuevosDatos
        System.out.println("Prueba Mati");
        System.out.println("Prueba Eze ._.");

        //Mati (Pueden modificarlo libremente si quieren :D)
        Scanner key = new Scanner(System.in);
        PapaCastor papaCastor = null;
        OrniVerde orniVerde = null;
        OrniAzul orniAzul1= null;
        OrniAzul orniAzul2= null;
        String nombre = null;
        int longitudCola = 0;
        double propulsion = 0;
        int velocidad =0;

        System.out.println("\n--- Ingresa los datos de los mamiferos ---");
        while(true){
            try{
                System.out.println("\n Datos del Papa Castor:");
                System.out.print("Nombre: "); nombre = key.nextLine();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/h a 10km/h): "); propulsion = key.nextDouble();
            }catch (NumberFormatException e){
                System.out.println("Error: Debes ingresar un número valido.");
            }catch(Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            }

            //El condicional para que puede salir del bucle y no haya error.
            if(!nombre.isEmpty() && longitudCola > 0 && (propulsion > 5 && propulsion <= 10)){
                papaCastor = new PapaCastor(nombre, velocidad,  longitudCola, (int) propulsion);
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
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/h a 10km/h): "); propulsion = key.nextDouble();
            }catch (NumberFormatException e){
                System.out.println("Error: Debes ingresar un número valido.");
            }catch(Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            }

            if(!nombre.isEmpty() && longitudCola > 0 && (propulsion > 5 && propulsion <= 10)){
                orniVerde = new OrniVerde(nombre, velocidad, longitudCola, (int) propulsion);
                key.nextLine(); // limpiar el buffer
                break;
            }else{
                System.out.println("Error: Debes ingresar valores validos.");
                key.nextLine(); // limpiar el buffer
            }
        }
        //Orni Azul 1 --kari
        while(true){
            try{
                System.out.println("\n Datos del OrniAzul1: ");
                System.out.print("Nombre: "); nombre = key.nextLine();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/s a 10km/s): "); propulsion = key.nextDouble();
            }catch (NumberFormatException e){    
                System.out.println("Error: Debes ingresar un número válido.");
            }catch (Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            }   
            if(!nombre.isEmpty() && longitudCola > 0 && (propulsion >= 5 && propulsion <= 10)){
                orniAzul1 = new OrniAzul(nombre, papaCastor.getVelocidad(), longitudCola, (int) propulsion);
                key.nextLine(); 
                break; 
            }else{
                System.out.println("Error: Debes ingresar valores validos.");
                key.nextLine(); 
            }
        }
        
        //Orni Azul 2 --kari
         while(true){
            try{
                System.out.println("\n Datos del OrniAzul2: ");
                System.out.print("Nombre: "); nombre = key.nextLine();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/s a 10km/s): "); propulsion = key.nextDouble();
            }catch (NumberFormatException e){    
                System.out.println("Error: Debes ingresar un número válido.");
            }catch (Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
            }   
            if(!nombre.isEmpty() && longitudCola > 0 && (propulsion >= 5 && propulsion <= 10)){
                orniAzul2 = new OrniAzul(nombre, papaCastor.getVelocidad(), longitudCola, (int) propulsion);
                key.nextLine(); 
                break; 
            }else{
                System.out.println("Error: Debes ingresar valores validos.");
                key.nextLine(); 
            }
        }
        
        //Agrego los métodos el los Ornis Azules Naty
        
        System.out.println("\n Habilidades de " + orniAzul1.getNombre());
        orniAzul1.nadar(); // Método sobrescrito con propulsión
        orniAzul1.tocarGuitarra(); // Heredado del papá castor
        
        // Habilidades del OrniAzul2
        System.out.println("\n--- Habilidades de " + orniAzul2.getNombre());
        orniAzul2.nadar(); // Método sobrescrito con propulsión
        orniAzul2.tocarGuitarra(); // Heredado del papá castor
        //Agregar arreglo, lista de nadadores y el iterator para la propulsion---

        System.out.println("------------ Prueba de OrniVerde ------------"); 
        OrniVerde o1 = new OrniVerde("prueba", 5, 100);
        o1.tocarGuitorgan();
 main
    }
}
