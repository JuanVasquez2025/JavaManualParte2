public class Ejemplo1Polimorfismo {
    public static void main(String[] args) {
        // Declarar un objeto de la clase principal
        Mascota ma;

        // Crear un objeto de la clase Perro
        ma = new Perro("Kaizer", "Negro con blanco", "Mediano", "Pitbull", 15);
        ma.mostrarInformacion();
        ma.comunicarse();

        System.out.println("");
        // Crear un objeto de la clase Gato
        ma = new Gato("Pancho", "Blanco", "Pequeño", "Ángora", 1);
        ma.mostrarInformacion();
        ma.comunicarse();
    }
}

class Mascota {
    private String nombre;
    private String color;
    private String tamanio;
    private String raza;

    public Mascota() {
    }

    public Mascota(String nombre, String color, String tamanio, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
        this.raza = raza;
    }

    public void mostrarInformacion() {
        System.out.println("/********DATOS DE MASCOTA********/");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamanio);
    }

    public void comunicarse() {
        System.out.println("Soy una mascota y me comunico así");
    }
}

class Perro extends Mascota {
    private int personasMordidas;

    public Perro() {
    }

    public Perro(String nombre, String color, String tamanio, String raza, int personasMordidas) {
        super(nombre, color, tamanio, raza);
        this.personasMordidas = personasMordidas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Personas mordidas: " + personasMordidas);
    }

    @Override
    public void comunicarse() {
        System.out.println("Soy un perro y ladro");
    }
}

class Gato extends Mascota {
    private int ratonesCapturados;

    public Gato() {
    }

    public Gato(String nombre, String color, String tamanio, String raza, int ratonesCapturados) {
        super(nombre, color, tamanio, raza);
        this.ratonesCapturados = ratonesCapturados;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Ratones capturados: " + ratonesCapturados);
    }

    @Override
    public void comunicarse() {
        System.out.println("Soy un gato y maullo");
    }
}