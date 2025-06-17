package Practica1;

public class Vehiculo {

    public String placa;
    private double kilometraje = 0;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getKilometraje() {
        return "Su velocidad actual es de  " + kilometraje + "km/h!";
    }

}
