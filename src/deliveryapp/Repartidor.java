package deliveryapp;

import java.util.Random;

public class Repartidor {
    
    // Atributos
    private String nombre;
    private String idRepartidor;
    private String transporte;
    private int velocidad;
    
    // Constructor
    public Repartidor (String nombre, String idRepartidor, String transporte) {
        this.nombre = nombre;
        this.idRepartidor = "R-" + idRepartidor;
        this.transporte = transporte;
        this.velocidad = velocidadPromedio(transporte);
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getIdRepartidor() {
        return idRepartidor;
    }
    
    public void setIdRepartidor(String idRepartidor) {
        this.idRepartidor = idRepartidor;
    }
    
    public String getTransporte() {
        return transporte;
    }
    
    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    private int velocidadPromedio(String transporte) {
        Random rand = new Random();
        int velocidad = 10; // Velocidad por defecto
        
        if (transporte.equalsIgnoreCase("carro")) {
            velocidad = rand.nextInt(40, 60);
        } else if (transporte.equalsIgnoreCase("moto")) {
            velocidad = rand.nextInt(30, 51);
        } else if (transporte.equalsIgnoreCase("bicicleta")) {
            velocidad = rand.nextInt(10, 26);
        }
        
        return velocidad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nID: " + idRepartidor +
                "\nVehiculo: " + transporte +
                "\nVelocidad (km/h): " + velocidad;
    }
    
}