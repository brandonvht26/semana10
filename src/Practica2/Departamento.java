package Practica2;

public class Departamento extends Inmobiliaria {

    private boolean balcon;

    public Departamento(boolean balcon, double precio, String direccion, String propietarioActual) {
        super();
        this.balcon = balcon;
        setPrecio(precio);
        setDireccion(direccion);
        setPropietarioActual(propietarioActual);
    }

    public void mostrarInfo() {
        System.out.print("\n\nDireccion: " + getDireccion() +
                "\nPropietario actual: " + getPropietarioActual() +
                "\nBalcón: " + balcon +
                "\nPrecio: $" + getPrecio());
    }

}
