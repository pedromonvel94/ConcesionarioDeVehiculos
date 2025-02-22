import java.util.List;

public class Vehiculo {
    int codigo;
    String marca;
    List<String> tipo;
    int modelo;
    int kilometraje;
    int precio_vehiculo;

    public Vehiculo(int codigo, String marca, List<String> tipo, int modelo, int kilometraje, int precio_vehiculo) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.precio_vehiculo = precio_vehiculo;
    }
}