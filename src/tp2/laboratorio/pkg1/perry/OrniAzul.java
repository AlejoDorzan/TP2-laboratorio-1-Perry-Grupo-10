package tp2.laboratorio.pkg1.perry;
// Acá cree una parte del OrniAzul - en breve agregamos los métodos

import java.util.Scanner;


public class OrniAzul extends PapaCastor{
 private String nombre;
    private int propulsion;
    private double pico = 6.8; // cm
    private double patas = 7.5; // cm
    
    public OrniAzul(String nombre, double velocidad, double longitudCola, int propulsion) {
        super(nombre, velocidad, longitudCola,  propulsion);
        this.nombre = nombre;
        
        if (propulsion >= 5 && propulsion <= 10) {
            this.propulsion = propulsion;
        } else {
            System.out.println("Advertencia: Propulsión fuera de rango (5-10 km/s). Asignando valor por defecto: 5 km/s");
            this.propulsion = (int) 5.0;
        }
    }
    
    
