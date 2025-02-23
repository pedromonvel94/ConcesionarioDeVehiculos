import java.util.List;
import java.util.HashMap;

public class Vehiculo {
    int codigo;
    String marca;
    String tipo;
    int modelo;
    int kilometraje;
    int precio_vehiculo;

    public Vehiculo(int codigo, String marca, String tipo, int modelo, int kilometraje, int precio_vehiculo) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.precio_vehiculo = precio_vehiculo;
    }

    //Metodo para agregar un vehiculo a la venta
    public static void venderVehiculo(int codigo, String nombre, String apellido, int documento,
                                      HashMap<Integer, Vehiculo> inventario, HashMap<Integer, Venta> ventas) {
        if (inventario.containsKey(codigo)) {
            Vehiculo vehiculoVendido = inventario.remove(codigo);
            Venta nuevaVenta = new Venta(vehiculoVendido, nombre, apellido, documento);
            ventas.put(codigo, nuevaVenta);
            System.out.println("Vehículo vendido exitosamente.");
            nuevaVenta.mostrarVenta();
        } else {
            System.out.println("El vehículo con código " + codigo + " no está en el inventario.");
        }
    }
}