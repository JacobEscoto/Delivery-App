package deliveryapp;

public class Repartidor {
    
    // Atributos
    private String nombre;
    private String idRepartidor;
    private String transporte;
    private int velocidad;
    
    // Constructor
    public Repartidor (String nombre, String idRepartidor, String transporte, int velocidad) {
        this.nombre = nombre;
        this.idRepartidor = idRepartidor;
        this.transporte = transporte;
        this.velocidad = velocidad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}