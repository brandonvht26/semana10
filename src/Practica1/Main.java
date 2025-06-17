/*
1. Clase Vehículo: Kilometraje con Encapsulamiento

    Crear una clase llamada Vehiculo que contenga un atributo placa y un atributo kilometraje, el cual debe
    inicializarse en 0.
    El atributo kilometraje debe ser privado, y su valor solo podrá ser modificado desde fuera de la clase utilizando un
    metodo setter.
    Simular el cambio de kilometraje a 80 km desde otra clase.
*/

package Practica1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo("AAA123");
        double velocidad;

        System.out.print("La velocida actual del vehiculo de placas " + v1.placa + " es: " + v1.getKilometraje());
        System.out.print("\nIngrese una nueva velocidad: ");
        velocidad = sc.nextDouble();

        v1.setKilometraje(velocidad);
        System.out.print("La velocida actual del vehiculo de placas " + v1.placa + " es: " + v1.getKilometraje());
    }
}