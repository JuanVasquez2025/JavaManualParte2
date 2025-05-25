public class Ejercicio1POO {

    //Desarrollar un programa en que se defina la clase principal Vehículo y se creen tres clases derivadas de ésta:
//Automóvil, Barco y Avión; las clases derivadas deberán sobrescribir por lo menos un método de la clase
//principal utilizando polimorfismo.

    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        
        vehiculos[0] = new Automovil();
        vehiculos[1] = new Barco();
        vehiculos[2] = new Avion();
        
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarTipo();
            vehiculo.mover();
            System.out.println("------------");
        }
    }
}

class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo");
    }
    
    public void mostrarTipo() {
        System.out.println("Soy un vehículo genérico");
    }
}

class Automovil extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El automóvil está circulando por la carretera");
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("SOY UN AUTOMÓVIL");
    }
}

class Barco extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El barco está navegando por el mar");
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("SOY UN BARCO");
    }
}

class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avión está volando por el cielo");
    }
    
    @Override
    public void mostrarTipo() {
        System.out.println("SOY UN AVIÓN");
    }
}


