public class Ejercicio1Encapsulamiento {

    public static void main(String[] args) {
        Animal animal = new Animal("Perro", 3, 4);
        
        System.out.println("Detalles del Animal:"); 
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Orden: " + animal.getOrden());
        System.out.println("Extremidades: " + animal.getExtremidades());
        
        // Modificando los valores
        animal.setNombre("Gato");
        animal.setOrden(1);
        animal.setExtremidades(4);
        
        System.out.println("\nDetalles actualizados del Animal:"); 
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Orden: " + animal.getOrden());
        System.out.println("Extremidades: " + animal.getExtremidades());
    }

    static class Animal {  // Añadido 'static' para que pueda ser instanciado desde main
        private String nombre;
        private int orden;
        private int extremidades;

        public Animal(String nombre, int orden, int extremidades) {
            this.nombre = nombre;
            this.orden = orden;
            setExtremidades(extremidades);  // Usamos el setter para validación si la hubiera
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getOrden() {
            return orden;
        }

        public void setOrden(int orden) {
            this.orden = orden;
        }

        public int getExtremidades() {
            return extremidades;
        }

        public void setExtremidades(int extremidades) {
            if (extremidades >= 0) {  // Validación simple
                this.extremidades = extremidades;
            } else {
                System.out.println("Error: Las extremidades no pueden ser negativas");
            }
        }
    }
}