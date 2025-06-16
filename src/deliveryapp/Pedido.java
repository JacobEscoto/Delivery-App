package deliveryapp;

public class Pedido {
    
    // Atributos
    private String idPedido;
    private Cliente cliente;
    private Paquete paquete;
    private Repartidor repartidor;
    private String estado;
    
    // Constructor
    public Pedido(String idPedido, Cliente cliente, Paquete paquete, Repartidor repartidor, String estado) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.paquete = paquete;
        this.repartidor = repartidor;
        this.estado = estado;
    }
    
    // Getters y Setters
    public String getIdPedido() {
        return idPedido;
    }
}