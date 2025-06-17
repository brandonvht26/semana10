package Practica2;

public class Inmobiliaria {

    private double precio;
    private String direccion;
    private String propietarioActual;

    public Inmobiliaria() {}

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPropietarioActual() {
        return propietarioActual;
    }
    public void setPropietarioActual(String propietarioActual) {
        this.propietarioActual = propietarioActual;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
