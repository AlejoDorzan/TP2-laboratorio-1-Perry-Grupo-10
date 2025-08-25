package tp2.laboratorio.pkg1.perry;

public class Castor {
    protected String nombre;
    protected double longitudCola; // cm
    protected int propulsion; //km/h (5..10)

    public Castor(String nombre, double longitudCola, int propulsion){
        this.nombre = nombre;
        this.longitudCola = Math.max(1, longitudCola);
        //La consigna pide 5..10 km/h. Birnakuzanis si se pasan.
        if(propulsion < 5) propulsion = 5;
        if(propulsion > 10) propulsion = 10;
        
        this.propulsion = propulsion;

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


    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " {nombre=" + nombre + ", longitudCola=" + longitudCola + " cm, propulsion=" + propulsion + " km/h}";
    }
}
