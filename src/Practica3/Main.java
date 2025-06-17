package Practica3;

/*
3. Institución Educativa y Visualización de Datos

    Una institución educativa desea automatizar el ingreso de información personal de estudiantes y docentes.
    Se conocen los siguientes datos: el estudiante ya tiene registrados su nombre, carrera y semestre; el docente ya
    tiene registrados su nombre y el número de materias a cargo.
    Sin embargo, ambos aún no tienen registrados su número de cédula ni dirección, los cuales deben ser ingresados desde
    consola.

    - Crea la clase Persona con los atributos comunes.
    - Crea las clases hijas Estudiante y Docente, heredando de Persona, e implementa los atributos específicos.
    - Inicializa los datos preestablecidos de estudiante y docente.
    - Usa Scanner para ingresar cédula y dirección.
    - Muestra los datos antes y después de completar la información faltante.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int materiasImpartidas, semestre;
        String carrera, cedula, direccion;

        Estudiante est1 = new Estudiante("Brandon");
        est1.mostrarInfo();

        System.out.print("\n\nIngrese la cédula del estudiante: ");
        cedula = sc.nextLine();
        System.out.print("Ingrese la dirección del estudiante: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese la carrera del estudiante: ");
        carrera = sc.nextLine();
        System.out.print("Ingrese el semestre del estudiante: ");
        semestre = sc.nextInt() ;
        sc.nextLine();
        System.out.print("\n\n");

        est1.mostrarInfo();

        Docente doc1 = new Docente("Pedro");
        doc1.mostrarInfo();

        System.out.print("\n\nIngrese la cédula del docente: ");
        cedula = sc.nextLine();
        System.out.print("Ingrese la dirección del docente: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese las materias imaprtidas del docente: ");
        materiasImpartidas = sc.nextInt() ;
        sc.nextLine();
        System.out.print("\n\n");
        doc1.mostrarInfo();



    }
}
