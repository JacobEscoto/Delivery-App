package deliveryapp;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList();
        int opcion, accion;

        // Menu Principal
        do {
            mainMenu();
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("------ GESTION DE CLIENTES ------");
                    System.out.println("1- Agregar cliente");
                    System.out.println("2- Actualizar cliente");
                    System.out.println("3- Buscar cliente");
                    System.out.println("4- Lista de clientes");
                    System.out.println("5- Borrar cliente");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();
                    if (accion == 1) {
                        System.out.println("\n------ AGREGAR CLIENTE ------");
                        System.out.print("Nombre: ");
                        String nombreCliente = read.nextLine();
                        System.out.print("Edad: ");
                        int edad = read.nextInt();
                        read.nextLine();
                        System.out.print("Telefono: +504 ");
                        String telefono = read.next();
                        boolean valido = true;
                        for (int i = 0; i < telefono.length(); i++) {
                            char num = telefono.charAt(i);
                            if (num < '0' || num > '9') {
                                valido = false;
                                break;
                            }
                        }
                        while (!valido || telefono.length() != 8) {
                            System.out.print("Numero con formato incorrecto\nIntenta de nuevo: ");
                            telefono = read.next();
                        }
                        
                        System.out.print("Correo: ");
                        String correo = read.next();
                        while (correo.indexOf("@gmail.com") == -1 && correo.indexOf("@hotmail.com") == -1) {
                            System.out.print("Formato invalido para correo\nIntenta de nuevo: ");
                            correo = read.next();
                        }
                        read.nextLine();
                        System.out.print("Direccion (Coordenadas): ");
                        String direccion = read.nextLine();
                        direccion = formatoDireccion(direccion);
                        Cliente newCliente = new Cliente(nombreCliente, edad, telefono, correo, direccion);
                        newCliente.generarId(nombreCliente);
                        boolean idIdenticas;
                        do {
                            idIdenticas = newCliente.verificarId(clientes, newCliente.getIdCliente());
                            if (idIdenticas) {
                                newCliente.generarId(nombreCliente);
                            }

                        } while (idIdenticas);
                        clientes.add(newCliente);
                        System.out.println("Cliente agregado con exito!");
                    } else if (accion == 2) {
                        // Seccion a completar
                    } else if (accion == 3) {
                        if (clientes.isEmpty()) {
                            System.out.println("Todavia no hay clientes registrados");
                            break;
                        }
                        System.out.printf("------ BUSCAR CLIENTE ------ %n ID / Nombre del Cliente a buscar: ");
                        String searchClient = read.nextLine();

                        boolean encontrado = false;
                        for (int i = 0; i < clientes.size(); i++) {
                            if (clientes.get(i).getNombre().equalsIgnoreCase(searchClient) || clientes.get(i).getIdCliente().equals(searchClient)) {
                                encontrado = true;
                                System.out.printf("%nCliente %d%s%n", (i + 1), clientes.get(i).toString());
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.printf("%n No se encontro ningun resultado en la busqueda realizada");
                        }
                    } else if (accion == 4) {
                        if (clientes.isEmpty()) {
                            System.out.println("Todavia no hay clientes registrados");
                            break;
                        }
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.printf("%nCliente %d%s%n", (i + 1), clientes.get(i).toString());
                        }
                    } else if (accion == 5) {
                        System.out.println("------ BORRAR CLIENTE ------");
                        System.out.print("Escribe Nombre / ID del cliente a borrar: ");
                        String borrarCliente = read.nextLine();
                        boolean borrado = false;
                        
                        for (int i = 0; i < clientes.size(); i++) {
                            if(clientes.get(i).getNombre().equalsIgnoreCase(borrarCliente) || clientes.get(i).getIdCliente().equals(borrarCliente)) {
                                clientes.remove(i);
                                borrado = true;
                                System.out.println("Cliente borrado exitosamente!");
                                break;
                            }
                        }
                        
                        if (!borrado) {
                            System.out.println("No se encontro un cliente con el Nombre / ID proporcionado");
                        }
                    }
                    break;
                case 2:
                    System.out.println("------ GESTION DE REPARTIDORES ------");
                    System.out.println("1- Agregar repartidor");
                    System.out.println("2- Actualizar repartidor");
                    System.out.println("3- Buscar repartidor");
                    System.out.println("4- Lista de repartidores");
                    System.out.println("5- Borrar repartidor");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();
                    break;
                case 3:
                    System.out.println("------ GESTION DE PAQUETES ------");
                    System.out.println("1- Agregar paquete");
                    System.out.println("2- Actualizar paquete");
                    System.out.println("3- Buscar paquete por ID");
                    System.out.println("4- Lista de paquetes");
                    System.out.println("5- Borrar paquete");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();
                    break;
                case 4:
                    System.out.println("------ GESTION DE PEDIDOS ------");
                    System.out.println("1- Crear pedido");
                    System.out.println("2- Enviar pedido");
                    System.out.println("3- Buscar pedido");
                    System.out.println("4- Lista de pedidos");
                    System.out.println("5- Cancelar pedido");
                    System.out.print("Opcion a realizar: ");
                    accion = read.nextInt();
                    read.nextLine();
                    break;
                case 5:
                    System.out.println("Saliendo del Delivery...");
                    break;
                default:
                    System.out.println("Opcion Invalida... Intenta nuevamente");
                    break;
            }

        } while (opcion != 5);

    }

    public static void mainMenu() {
        System.out.println("------ DELIVERY APP ------");
        System.out.println("1- Gestion de Clientes");
        System.out.println("2- Gestion de Repartidores");
        System.out.println("3- Gestion de Paquetes");
        System.out.println("4- Gestion de Pedidos");
        System.out.println("5- Salir");
        System.out.print("Ingrese una opcion: ");
    }
    
    public static String formatoDireccion(String direccion) {
        boolean contieneEspacio = direccion.indexOf(" ") == -1;
        if (contieneEspacio) {
            direccion.replace(" ", "");
        }
        
        return direccion;
    }

}
