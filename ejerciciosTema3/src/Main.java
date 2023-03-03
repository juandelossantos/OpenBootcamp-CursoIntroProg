public class Main {

    // PRIMERA PARTE
    // Crear una función contres parámetros que sean números y se sumen entre sí.
    private static int suma(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    public static void main(String[] args) {

        // Ejecución Primera parte:

        System.out.println("Ejecución Primera parte:");
        System.out.println("");

        int num1 = 10;
        int num2 = 2;
        int num3 = 7;

        // Llamar a la función en el main y darle valores.

        System.out.println("la suma de 10 + 2 + 7 es igual a " + suma(num1, num2, num3));
        System.out.println("");

        System.out.println("-----------");
        System.out.println("");

        // Ejecución Segunda Parte

        // Crear una clase Coche
        // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        // Una función que incremente el número de puertas que tiene el coche.
        //
        // --> ver Coche.java

        System.out.println("Ejecución Segunda parte:");
        System.out.println("");

        // Crear un objeto miCoche en el main y añadirle una puerta.
        // Mostrar el número de puertas que tiene el objeto.

        Coche miCoche = new Coche(4);
        miCoche.agregarPuerta();
    }

}

