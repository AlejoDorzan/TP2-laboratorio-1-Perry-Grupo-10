package tp2.laboratorio.pkg1.perry;
// Acá cree una parte del OrniAzul - en breve agregamos los métodos


public class OrniAzul extends PapaCastor{
    private String nombre;
    private double propulsion;
    private double pico = 6.8; // cm
    private double patas = 7.5; // cm
    
    public OrniAzul(String nombre, int velocidad, int longitudCola, double propulsion) {
        super(nombre, velocidad, longitudCola,  propulsion);
        this.nombre = nombre;
        
        if (propulsion >= 5 && propulsion <= 10) {
            this.propulsion = propulsion;
        } else {
            System.out.println("Advertencia: Propulsión fuera de rango (5-10 km/s). Asignando valor por defecto: 5 km/s");
            this.propulsion =  5.0;
        }
    }
     @Override
    public void nadar() {
        double velocidadTotal = super.getVelocidad() + propulsion;
        System.out.println(nombre + " nadando a velocidad de " + velocidadTotal + " km/h (velocidad padre + propulsión)");
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public double getPropulsion() {
        return propulsion;
    }
    
    public double getVelocidadTotal() {
         return super.getVelocidad() + propulsion;
    
    }
}
    
