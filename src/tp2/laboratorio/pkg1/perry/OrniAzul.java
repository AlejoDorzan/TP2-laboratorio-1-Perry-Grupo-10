package tp2.laboratorio.pkg1.perry;


import java.util.Scanner;


public class OrniAzul extends PapaCastor{
    private int propulsion; // km/s

    public OrniAzul(String nombre) {
        super();
        Scanner scanner= new Scanner (System.in);
        do{
            System.out.println("Ingrese propulsión del OrniAzul ( 5  a 10 km/s");
            this.propulsion =scanner.nextInt();
        
        }while (propulsion <5 || propulsion >10);
    }
    
