import java.util.Scanner;

public class JuegoAnimales {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int puntajeTotal = 0;
        
        System.out.println("//***** BIENVENIDO AL JUEGO DE ANIMALES *****//");
        
        // Nivel 1
        System.out.println("******* NIVEL 1 *******");
        Nivel1 nivel1 = new Nivel1();
        nivel1.imprimirPregunta();
        System.out.println("\nPuntaje Nivel 1: " + nivel1.puntaje);
        puntajeTotal += nivel1.puntaje;
        
        // Preguntar si quiere continuar al nivel 2
        System.out.println("\n¿Deseas continuar al Nivel 2? (s/n)");
        String continuar = ent.nextLine();
        
        Nivel2 nivel2 = null;
        if (continuar.equalsIgnoreCase("s")) {
            // Nivel 2
            System.out.println("\n=== NIVEL 2 ===");
            nivel2 = new Nivel2();
            nivel2.imprimirPregunta();
            System.out.println("\nPuntaje Nivel 2: " + nivel2.puntaje);
            puntajeTotal += nivel2.puntaje;
        }
        
        // Mostrar resultados finales
        System.out.println("\n//***** RESULTADOS FINALES *****//");
        System.out.println("Puntaje Nivel 1: " + nivel1.puntaje);
        if (continuar.equalsIgnoreCase("s")) {
            System.out.println("Puntaje Nivel 2: " + nivel2.puntaje);
        } else {
            System.out.println("Nivel 2 no jugado");
        }
        System.out.println("Puntaje Total: " + puntajeTotal);
    }
}