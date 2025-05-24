import java.util.Scanner;
public class Nivel1 {

        public int puntaje;
        private String respuesta;
        private final String []animales;
        private final Scanner ent;

        public Nivel1() {
            puntaje = 0;
            respuesta = "";
            animales = new String[2];
            animales[0] = "perro";
            animales[1] = "gato";
            ent = new Scanner(System.in);
        }

        private void puntajePerro(){
            if(respuesta.equalsIgnoreCase(animales[0])){
                System.out.println("Correcto haz ganado 10 puntos");
                puntaje += 10;
            } else {
                System.out.println("incorrecto La respuesta correcta es: " + animales[0]);
                System.out.println("Has perdido 5 puntos");
                puntaje -= 5;
            }
        }

        private void puntajeGato(){
            if(respuesta.equalsIgnoreCase(animales[1])){
                System.out.println("Correcto haz ganado 10 puntos");
                puntaje += 10;
            } else {
                System.out.println("incorrecto La respuesta correcta es: " + animales[1]);
                System.out.println("Has perdido 5 puntos");
                puntaje -= 5;
            }
        }

        public void imprimirPregunta() {
            System.out.println("Es un animal que ladra y come croquetas?");
            respuesta = ent.nextLine();
            puntajePerro();
            System.out.println("Es un animal que maulla y toma leche?");
            respuesta = ent.nextLine();
            puntajeGato();
        }
}
