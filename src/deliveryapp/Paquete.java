package deliveryapp;

public class Paquete {
    
    // Atributos
    private String idPaquete;
    private String categoria;
    private double peso;
    private double costoTotal;
    private String descripcion;
    private boolean incluirSeguro;
    private Cliente cliente;
    
    // Constructor
    public Paquete(String idPaquete, String categoria, double peso, double costoTotal, String descripcion, boolean incluirSeguro, Cliente cliente) {
        this.idPaquete = idPaquete;
        this.categoria = categoria;
        this.peso = peso;
        this.costoTotal = costoTotal;
        this.descripcion = descripcion;
        this.incluirSeguro = incluirSeguro;
        this.cliente = cliente;
    }
    
    // Getters y Setters
    public String getIdPaquete() {
        return idPaquete;
    }
    
    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getCostoTotal() {
        return costoTotal;
    }
    
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean getIncluirSeguro() {
        return incluirSeguro;
    }

    public void setIncluirSeguro(boolean incluirSeguro) {
        this.incluirSeguro = incluirSeguro;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
}
