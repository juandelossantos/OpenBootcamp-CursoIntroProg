/*
Ejercicio Tema 8:
Para practicar la encapsulación:

    * Crear clase Persona.
    * Crear variables las privadas edad, nombre y telefono de la clase Persona.
    * Crear gets y sets de cada propiedad.
    * Crear un objeto persona en el main.
    * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
      por último muéstralas por consola.
 */

public class Main {
    public static void main(String[] args) {
        Persona david = new Persona();
        david.setEdad(44);
        david.setNombre("David Emilio");
        david.setTelefono("345343434");

        String nombre = david.getNombre();
        int edad = david.getEdad();
        String telefono = david.getTelefono();
        System.out.printf("%s tiene %d años y su número telefónico es: %s%n", nombre, edad, telefono);
    }

    static class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return this.telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
}