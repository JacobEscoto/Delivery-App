package deliveryapp;

public class Cliente {

    // Atributos
    private String nombre;
    private String idCliente;
    private int edad;
    private String telefono;
    private String correo;
    private String direccion;

    // Constructor
    public Cliente(String nombre, String idCliente, int edad, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nID: " + idCliente +
                "\nEdad: " + edad +
                "\nTelefono: +504 " + telefono +
                "\nCorreo: " + correo +
                "\nDireccion: " + direccion;
    }
}
