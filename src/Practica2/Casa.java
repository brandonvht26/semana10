package Practica2;

public class Casa extends Inmobiliaria{

    private int numeroHabitaciones;

    public Casa(int numeroHabitaciones, double precio, String direccion, String propietarioActual) {
        super();
        this.numeroHabitaciones = numeroHabitaciones;
        setPrecio(precio);
        setDireccion(direccion);
        setPropietarioActual(propietarioActual);
    }

    public void mostrarInfo() {
        System.out.print("\n\nDireccion: " + getDireccion() +
                        "\nPropietario actual: " + getPropietarioActual() +
                        "\nNúmero de habitaciones: " + numeroHabitaciones +
                        "\nPrecio: $" + getPrecio());
    }

}
