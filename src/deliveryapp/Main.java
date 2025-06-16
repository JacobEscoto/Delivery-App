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
            switch(opcion) {
                case 1:
                    System.out.println("------ GESTION DE CLIENTES ------");
                    System.out.println("1- Agregar cliente");
                    System.out.println("2- Actualizar cliente");
                    System.out.println("3- Buscar cliente");
                    System.out.println("4- Lista de clientes");
                    System.out.println("5- Borrar cliente");
                    System.out.print("Opcion a realizar: ");
                    opcion = read.nextInt();
                    read.nextLine();
                    break;
                case 2:
                    System.out.println("------ GESTION DE REPARTIDORES ------");
                    System.out.println("1- Agregar repartidor");
                    System.out.println("2- Actualizar repartidor");
                    System.out.println("3- Buscar repartidor");
                    System.out.println("4- Lista de repartidores");
                    System.out.println("5- Borrar repartidor");
                    System.out.print("Opcion a realizar: ");
                    opcion = read.nextInt();
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
                    opcion = read.nextInt();
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
                    opcion = read.nextInt();
                    read.nextLine();
                    break;
                case 5:
                    System.out.println("Saliendo del Delivery...");
                    break;
                default:
                    System.out.println("Opcion Invalida... Intenta nuevamente");
                    break;
            }
            
        } while(opcion != 5);

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

// Metodo - generar id aleatoria
    public static String generarId(String nombre) {
        Random rand = new Random();
        String caracteres = "1234567890!@_" + nombre;
        String id = "";

        int size = rand.nextInt(7, 12);
        for (int i = 0; i < size; i++) {
            int x = rand.nextInt(caracteres.length());
            char c = caracteres.charAt(x);
            id += c;
        }
        return id;
    }

}
