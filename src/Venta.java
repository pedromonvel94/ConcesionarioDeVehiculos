public class Venta {
    int codigoVehiculo;
    String marca;
    String tipo;
    int modelo;
    int kilometraje;
    int precio;

    String nombreComprador;
    String apellidoComprador;
    int documentoComprador;

    public Venta(Vehiculo vehiculo, String nombre, String apellido, int documento) {
        this.codigoVehiculo = vehiculo.codigo;
        this.marca = vehiculo.marca;
        this.tipo = vehiculo.tipo;
        this.modelo = vehiculo.modelo;
        this.kilometraje = vehiculo.kilometraje;
        this.precio = vehiculo.precio_vehiculo;

        this.nombreComprador = nombre;
        this.apellidoComprador = apellido;
        this.documentoComprador = documento;
    }

    public void mostrarVenta() {
        System.out.println("Vehículo vendido:");
        System.out.println("Código: " + codigoVehiculo);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Precio: $" + precio);
        System.out.println("Comprador: " + nombreComprador + " " + apellidoComprador);
        System.out.println("Documento: " + documentoComprador);
    }
}
