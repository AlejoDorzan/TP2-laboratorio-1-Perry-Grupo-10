
package tp2.laboratorio.pkg1.perry;

import java.util.*;

public class TP2Laboratorio1Perry {

    public static void main(String[] args) {
      //NuevosDatos
        

        //Mati (Pueden modificarlo libremente si quieren :D)
        Scanner key = new Scanner(System.in);
        PapaCastor papaCastor = null;
        OrniVerde orniVerde = null;
        OrniAzul orniAzul1= null;
        OrniAzul orniAzul2= null;
        String nombre;
        int longitudCola, velocidad;
        double propulsion;
        
        
        System.out.println("\n--- Ingresa los datos de los mamiferos ---");
        
        //Papa Castor
        while(true){
            try{
                System.out.println("\n Datos del Papa Castor:");
                System.out.print("Nombre: "); nombre = key.nextLine();
                System.out.print("Velocidad (km/h): "); velocidad = key.nextInt();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/h a 10km/h): "); propulsion = key.nextDouble();
            }catch (Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
                key.nextLine(); // limpiar el buffer
                continue;
            }

            //El condicional para que puede salir del bucle y no haya error.
            if(!nombre.isEmpty() && longitudCola > 0 && propulsion >= 5 && propulsion <= 10){
                papaCastor = new PapaCastor(nombre, velocidad,  longitudCola, propulsion);
                key.nextLine(); // limpiar el buffer
                break;
            }else{
                System.out.println("Error: Debes ingresar valores validos.");
                key.nextLine(); // limpiar el buffer
            }
        }
        // Orni Verde
        while(true){
            try{
                System.out.println("\n Datos del OrniVerde:");
                System.out.print("Nombre: "); nombre = key.nextLine();
                System.out.print("Velocidad (km/h): "); velocidad = key.nextInt();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/h a 10km/h): "); propulsion = key.nextDouble();
            }catch (Exception e){
                System.out.println("Error inesperado: " + e.getMessage());
                key.nextLine(); // limpiar el buffer
                continue;
            }
            if(!nombre.isEmpty() && longitudCola > 0 && propulsion >= 5 && propulsion <= 10){
                orniVerde = new OrniVerde(nombre, velocidad, longitudCola,  propulsion);
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
                System.out.print("Velocidad (km/h): "); velocidad = key.nextInt();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/s a 10km/s): "); propulsion = key.nextDouble();
            }catch (Exception e){    
                System.out.println("Error inesperado: " + e.getMessage());
                key.nextLine();// limpiar el buffer
                continue;
            }   
            if(!nombre.isEmpty() && longitudCola > 0 && propulsion >= 5 && propulsion <= 10){
                orniAzul1 = new OrniAzul(nombre, velocidad, longitudCola,  propulsion);
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
                System.out.print("Velocidad (km/h): "); velocidad = key.nextInt();
                System.out.print("Longitud de la cola (cm): "); longitudCola = key.nextInt();
                System.out.print("Propulsion (5km/s a 10km/s): "); propulsion = key.nextDouble();
            }catch (Exception e){    
                System.out.println("Error inesperado: " + e.getMessage());
                key.nextLine();// limpiar el buffer
                continue;
            }   
            if(!nombre.isEmpty() && longitudCola > 0 && propulsion >= 5 && propulsion <= 10){
                orniAzul2 = new OrniAzul(nombre, velocidad, longitudCola,  propulsion);
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

        System.out.println("\n--- Habilidades de " + orniVerde.getNombre()); 
        orniVerde.tocarGuitorgan();
 
    
    
        //Crear arreglo de hermanos
        PapaCastor[] hermanos = new PapaCastor[3];
        hermanos[0] = orniVerde;
        hermanos[1] = orniAzul1;
        hermanos[2] = orniAzul2;

        //Bloque Finally
        System.out.println("\nBloque Finally: ¡Que digan 'los ornitorrincos juntos al fin...'");
        for (PapaCastor o : hermanos) {
            System.out.println("- " + o.getNombre());

        }    

        //Lista de nadadores (los 2 mejores por velocidad total)
        List<PapaCastor> nadadores = new ArrayList<>();
        nadadores.add(orniAzul1);
        nadadores.add(orniAzul2);


        //Ordenar por propulsion ascendente y mostrar con Iterator
        nadadores.sort(Comparator.comparingDouble(PapaCastor::getPropulsion));
        System.out.println("\nLista de nadadores ordenados por propulsión:");
        Iterator<PapaCastor> it = nadadores.iterator();
        while (it.hasNext()) {
            PapaCastor o = it.next();
            System.out.println(o.getNombre() + " - Propulsión: " + o.getPropulsion());


        }
    
    
    
    
    
    }










}