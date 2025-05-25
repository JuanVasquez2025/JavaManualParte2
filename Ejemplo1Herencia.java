public class Ejemplo1Herencia {

    public static void main(String[] args) {
        Alumno al = new Alumno(
                "Luis", "Erazo", 20, "Masculino", "caluco", "991", "grupo 1", "ds");

        Profesor pr = new Profesor(
                "Gerber", "Gonzalez", 30, "masculino", "Sonzacate", "913", 800, "0000000'-1",
                "00000-0000-000-1", "Desarollo de software");

        System.out.println("/***** ALUMNO *****/");
        al.mostrarInfAlumno();

        System.out.println("/***** PROFESOR *****/");
        pr.mostrarInfProfesor();
    }
}

class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String genero;
    protected String direccion;
    protected String telefono;

    public Persona() {
    }

    public Persona(String pNombre, String pApellido, int pEdad, String pGenero,
            String pDireccion, String pTelefono) {
        nombre = pNombre;
        apellido = pApellido;
        edad = pEdad;
        genero = pGenero;
        direccion = pDireccion;
        telefono = pTelefono;
    }

    public String saludoPersona() {
        return "Este texto es de la clase padre Persona";
    }
}

class Alumno extends Persona {
    private String seccion;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String pNombre, String pApellido, int pEdad, String pGenero,
            String pDireccion, String pTelefono, String pSeccion,
            String pCarrera) {
        super(pNombre, pApellido, pEdad, pGenero, pDireccion, pTelefono);
        seccion = pSeccion;
        carrera = pCarrera;
    }

    public void mostrarInfAlumno() {
        System.out.println("Nombre del alumno: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Seccion: " + seccion);
        System.out.println("Carrera: " + carrera);
    }
}

class Profesor extends Persona {
    private double sueldo;
    private String dui;
    private String nit;
    private String especialidad;

    public Profesor(String pNombre, String pApellido, int pEdad, String pGenero,
            String pDireccion, String pTelefono, double pSueldo, String pDui,
            String pNit, String pEspecialidad) {
        super(pNombre, pApellido, pEdad, pGenero, pDireccion, pTelefono);
        sueldo = pSueldo;
        dui = pDui;
        nit = pNit;
        especialidad = pEspecialidad;
    }

    public String saludoProfesor() {
        return "Este texto es específico de la clase Profesor";
    }

    public void mostrarInfProfesor() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("DUI: " + dui);
        System.out.println("NIT: " + nit);
        System.out.println("Especialidad: " + especialidad);
    }
}