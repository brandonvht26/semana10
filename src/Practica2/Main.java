/*
2. Inmobiliaria con Herencia y Atributos Propios
    Diseñar una clase padre llamada Inmobiliaria con tres atributos comunes.
    Crear dos clases hijas que hereden de Inmobiliaria, y en cada una agregar un atributo adicional propio, distinto al de
    la clase base.
    Implementar métodos que permitan mostrar los datos ingresados de cada objeto.
*/

package Practica2;
import javax.sound.midi.SysexMessage;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroHabitaciones;
        boolean balcon, servicioSeguridad;

        System.out.print("\nIngrese el número de habitaciones de la casa: ");
        numeroHabitaciones = sc.nextInt();
        sc.nextLine();

        Casa c1 = new Casa(numeroHabitaciones, 21000.65, "La mena", "Brandon Huera");
        c1.mostrarInfo();

        System.out.print("\nEl departamento tiene balcón? (0 = false | 1 = true): ");
        balcon = sc.nextBoolean();

        Departamento d1 = new Departamento(balcon, 45000, "Magdalena", "S.A Pedrito");
        d1.mostrarInfo();

        System.out.print("\nLa oficina tiene servicio de seguridad? (0 = false | 1 = true): ");
        servicioSeguridad = sc.nextBoolean();

        Oficina o1 = new Oficina(servicioSeguridad, 252500, "El bosque", "DePrati");
        o1.mostrarInfo();

        System.out.print("\n\n");

    }
}
