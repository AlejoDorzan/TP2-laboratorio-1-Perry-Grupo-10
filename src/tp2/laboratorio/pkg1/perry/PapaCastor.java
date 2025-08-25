package tp2.laboratorio.pkg1.perry;

import java.util.Random;
import java.util.Scanner;

public class PapaCastor {
    protected String nombre;
    protected double velocidad;
    protected double longitudCola; // cm
    protected int propulsion; //km/h (5..10)
    // Naty: Agregué atributo velocidad, lo sumé al constructor
    //Agregué también los getters y setters
    //Mati:
    //Cambie el nombre de Castor a PapaCastor.
    public PapaCastor(String nombre, double velocidad, double longitudCola, int propulsion){
        this.nombre = nombre;
         Scanner scanner =new Scanner (System.in);
        System.out.println("Ingrese la velocidad del castor (km/s): ");
        this.velocidad = scanner.nextInt();
        
        this.longitudCola = Math.max(1, longitudCola);
        //La consigna pide 5..10 km/h. Birnakuzanis si se pasan.
        if(propulsion < 5) propulsion = 5;
        if(propulsion > 10) propulsion = 10;
        
        this.propulsion = propulsion;

    }
     //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getLongitudCola() {
        return longitudCola;
    }    

    public int getPropulsion() {
        return propulsion;
    }

    public void nadar(){
        System.out.println( this.nombre + " nada a " + this.propulsion + " km/h");
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getLongitudCola() {
        return longitudCola;
    }    

    public int getPropulsion() {
        return propulsion;
    }

    //Mati:
    //Implemente el metodo tocarGuitarra() como muestra en el pdf.
    //Importe la libreria java.util.Random, para generar el valor de cuerda entre 1 y 6.
    public void tocarGuitarra(){
        Random rand = new Random();
        int cuerda = rand.nextInt(6) + 1;
        
        for(int i = 1; i <= 3; i++){//Como dice en el pdf, hacer que el metodo imprima 3 cuerdas aleatorias.
            System.out.println("Toca cuerda" + cuerda); 
        }
    }

    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " {nombre=" + nombre + ", longitudCola=" + longitudCola + " cm, propulsion=" + propulsion + " km/h}";
    }
}
