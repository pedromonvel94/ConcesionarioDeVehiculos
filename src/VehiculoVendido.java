import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehiculoVendido {
    public static void main(String[] args){
        //Usamos la funcion reservada Scanner para recibir los valores por consola
        Scanner scanner = new Scanner(System.in);

        //Pedimos los datos del vehiculo
        System.out.println("Ingrese el codigo del vehiculo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la marca del vehiculo");
        String marca = scanner.nextLine();

        System.out.println("Cual tipo de vehiculo es (M = moto, A = automovil, C = camioneta)");
        String tipo = scanner.nextLine();
            if (tipo.toLowerCase().equals("m")) {
                tipo = "Moto";
            } else if (tipo.toLowerCase().equals("a")) {
                tipo = "Automovil";
            } else if (tipo.toLowerCase().equals("c")) {
                tipo = "Camioneta";
            } else {
                tipo = "Tipo de vehiculo no valido";
            }

        System.out.println("Ingrese el modelo del vehiculo: ");
        int modelo = scanner.nextInt();

        System.out.println("Ingrese el kilometraje del vehiculo: ");
        int kilometraje = scanner.nextInt();

        System.out.println("Ingrese el precio del vehiculo: ");
        int






        Vehiculo VehiculoVendido = new Vehiculo();
    }
}

