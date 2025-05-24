public class EjemploEncapsulamiento {

    public static void main(String[] args) {

        Persona obj = new Persona();
        obj.setGenero("Masculino");
        obj.setNombre("Cayetano");
        obj.setEdad(25);
        obj.setPeso(70);
        obj.setTalla(1.5);
        obj.setApellido("Cruz");

        System.out.println("Nombre: " + obj.getNombre());
        System.out.println("Apellido: " + obj.getApellido());
        System.out.println("Edad: " + obj.getEdad());
        System.out.println("Peso: " + obj.getPeso());
        System.out.println("Talla: " + obj.getTalla());
        System.out.println("Genero: " + obj.getGenero());

    }

}

class Persona
{
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double talla;
    private String genero;

    public Persona() {}

    
    public Persona(String pNombre, String pApellido, int pEdad, double pPeso, double pTalla, String pGenero) {
        nombre = pNombre;
        apellido = pApellido;
        edad = pEdad;
        peso = pPeso;
        talla = pTalla;
        genero = pGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
