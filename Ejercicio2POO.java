public class Ejercicio2POO {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Julian Pérez", "EMP-001", 160, 15.50);
        emp.Registrar();
        System.out.println("Sueldo calculado: $" + emp.calcularSueldo());
    }
}

abstract class Personal {
    public abstract void Registrar();
    
    public abstract double calcularSueldo();
}

class Empleado extends Personal {
    private String nombre;
    private String id;
    private int horasTrabajadas;
    private double tarifaPorHora;

    public Empleado(String nombre, String id, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.id = id;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public void Registrar() {
        System.out.println("Empleado registrado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: $" + tarifaPorHora);
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
}


