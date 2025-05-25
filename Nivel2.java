import java.util.Scanner;

class Nivel2 {
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public Nivel2() {
        puntaje = 0;
        respuesta = "";
        animales = new String[4];
        animales[0] = "leon";
        animales[1] = "elefante";
        animales[2] = "mono";
        animales[3] = "tigre";
        ent = new Scanner(System.in);
    }

    public void imprimirPregunta() {
        System.out.println("Es el rey de la selva y tiene melena?");
        respuesta = ent.nextLine();
        if(respuesta.equalsIgnoreCase(animales[0])) {
            System.out.println("Correcto haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("incorrecto La respuesta correcta es: " + animales[0]);
            puntaje -= 10;
        }
        
        System.out.println("Es el animal terrestre más grande y tiene trompa?");
        respuesta = ent.nextLine();
        if(respuesta.equalsIgnoreCase(animales[1])) {
            System.out.println("Correcto haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("incorrecto La respuesta correcta es: " + animales[1]);
            puntaje -= 10;
        }
        
        System.out.println("Es un animal que trepa árboles y come bananas?");
        respuesta = ent.nextLine();
        if(respuesta.equalsIgnoreCase(animales[2])) {
            System.out.println("Correcto haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("incorrecto La respuesta correcta es: " + animales[2]);
            puntaje -= 10;
        }
        
        System.out.println("Es un felino grande con rayas negras?");
        respuesta = ent.nextLine();
        if(respuesta.equalsIgnoreCase(animales[3])) {
            System.out.println("Correcto haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("incorrecto La respuesta correcta es: " + animales[3]);
            puntaje -= 10;
        }
    }
}
