import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class VehiculoVendido {
    public static void main(String[] args){
        //Usamos la funcion reservada Scanner para recibir los valores por consola
        Scanner scanner = new Scanner(System.in);

        //Creamos dos hashmap "Diccionarios" para almacenar tanto el inventario de cada uno de los vehiculos, como las ventas que se realizan
        HashMap<Integer, Vehiculo> inventario = new HashMap<>();
        HashMap<Integer, Venta> ventas = new HashMap<>();

        //Pedimos los datos del vehiculo
        while (true){
            System.out.println("Deseas agregar un nuevo vehiculo? (S/N): ");
            String opcion = scanner.next().toLowerCase();
            if (opcion.equals("n")){
                System.out.println("Seleccionaste NO, salimos del programa.");
                break;
            }

            System.out.println("Ingrese el codigo del vehiculo: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese la marca del vehiculo: ");
            String marca = scanner.nextLine();

            String tipo = "";
            while(true) {
                System.out.println("Cual tipo de vehiculo es (M = Moto, A = Automovil, C = Camioneta): ");
                String tipoInput = scanner.nextLine();
                if (tipoInput.equalsIgnoreCase("m")) {
                    tipo = "Moto";
                    break;
                } else if (tipoInput.equalsIgnoreCase("a")) {
                    tipo = "Automovil";
                    break;
                } else if (tipoInput.equalsIgnoreCase("c")) {
                    tipo = "Camioneta";
                    break;
                } else {
                    System.out.println("Tipo de vehiculo no valido, por favor ingrese un tipo de vehiculo valido");
                }
            }

            System.out.println("Ingrese el modelo del vehiculo: ");
            int modelo = scanner.nextInt();

            System.out.println("Ingrese el kilometraje del vehiculo: ");
            int kilometraje = scanner.nextInt();

            System.out.println("Ingrese el precio del vehiculo: ");
            int precio_vehiculo = scanner.nextInt();

            Vehiculo vehiculo = new Vehiculo(codigo, marca, tipo, modelo, kilometraje, precio_vehiculo);
            inventario.put(codigo, vehiculo);
        }

        while (true) {
            System.out.print("¿Deseas vender un vehículo? (S/N): ");
            String eleccion = scanner.next().toLowerCase();
            if (eleccion.equals("n")) {
                System.out.println("Seleccionaste NO, salimos del programa.");
                break;
            }

            System.out.print("Ingrese el código del vehículo a vender: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el nombre del comprador: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el apellido del comprador: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese el documento del comprador: ");
            int documento = scanner.nextInt();

            Vehiculo.venderVehiculo(codigo, nombre, apellido, documento, inventario, ventas);
        }

        scanner.close();
    }
}

