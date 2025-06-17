package Practica2;

public class Oficina extends Inmobiliaria {

    private boolean servicioSeguridad;

    public Oficina(boolean servicioSeguridad, double precio, String direccion, String propietarioActual) {
        super();
        this.servicioSeguridad = servicioSeguridad;
        setPrecio(precio);
        setDireccion(direccion);
        setPropietarioActual(propietarioActual);
    }

    public void mostrarInfo() {
        System.out.print("\n\nDireccion: " + getDireccion() +
                "\nPropietario actual: " + getPropietarioActual() +
                "\nSeguridad: " + servicioSeguridad +
                "\nPrecio: $" + getPrecio());
    }

}