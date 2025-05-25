public class Ejercicio3POO {
    public static void main(String[] args) {
        Profesion[] profesionales = new Profesion[2];
        
        profesionales[0] = new Medico("Dra. María López", 20, 120.0);
        profesionales[1] = new Ingeniero("Ing. Carlos Ruiz", 40, 85.50);
        
        for (Profesion prof : profesionales) {
            System.out.println(prof.getClass().getSimpleName() + ":");
            System.out.println("Sueldo calculado: $" + prof.calcularSueldo());
            System.out.println("------------");
        }
    }
}

interface Profesion {
    double calcularSueldo();
}

class Medico implements Profesion {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaPorHora;

    public Medico(String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSueldo() {
        return (horasTrabajadas * tarifaPorHora) * 1.05;
    }
}

class Ingeniero implements Profesion {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaPorHora;

    public Ingeniero(String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
}


