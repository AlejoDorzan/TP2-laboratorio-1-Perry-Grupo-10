package tp2.laboratorio.pkg1.perry;

import java.util.Random;

public class PapaCastor {
    protected String nombre;
    protected int velocidad;
    protected int longitudCola; // cm
    protected double propulsion; //km/h (5..10)
    // Naty: Agregué atributo velocidad, lo sumé al constructor
    //Agregué también los getters y setters
    //Mati:
    //Cambie el nombre de Castor a PapaCastor.
    public PapaCastor(String nombre, int velocidad, int longitudCola, double propulsion){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.longitudCola = Math.max(1, longitudCola);

        
        //La consigna pide 5..10 km/h. estables si se pasan.
        if(propulsion < 5) propulsion = 5;
        if(propulsion > 10) propulsion = 10;
        
        this.propulsion = propulsion;

    }
     //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getLongitudCola() {
        return longitudCola;
    }    

    public double getPropulsion() {
        return propulsion;
    }

    public void nadar(){
        System.out.println( this.nombre + " nada a " + this.propulsion + " km/h");
    }

    
    //Mati:
    //Implemente el metodo tocarGuitarra() como muestra en el pdf.
    //Importe la libreria java.util.Random, para generar el valor de cuerda entre 1 y 6.
    public void tocarGuitarra(){
        Random rand = new Random();
        for (int i = 1; i <= 3; i++) {
            int cuerda = rand.nextInt(6) + 1; 
            System.out.println("Toca cuerda " + cuerda);
        }
        //System.out.println("\n"); // Salto de linea
        
        
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " {nombre=" + nombre + ", longitudCola=" + longitudCola + " cm, propulsion=" + propulsion + " km/h}";
        }
    
}