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

public class Docente extends Persona{

    private int materiasImpartidas;

    public Docente(String nombre) {
        setNombre(nombre);
    }

    public Docente(int materiasImpartidas, int semestre, String cedula, String direccion) {
        this.materiasImpartidas = materiasImpartidas;
        super();
        setCedula(cedula);
        setDireccion(direccion);
    }

    public void mostrarInfo() {
        System.out.print("\n\nEstudiante: " + getNombre() +
                "\nCédula: " + getCedula() +
                "\nDirección: " + getDireccion() +
                "\nNúmero de materias: " + materiasImpartidas);
    }

}
