import com.sun.source.tree.DoWhileLoopTree;

public class Main {
    public static void main(String[] args) {

        // EJERCICIOS TEMA 4
        // Ejercicio IF

        System.out.println("Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.\n" +
                "Pista: Los números inferiores a 0 son negativos y los superiores, positivos.\n");
        int numeroIf = 10;
        if (numeroIf <0) {
            System.out.println(numeroIf + " es menor que 0");
        } else if (numeroIf == 0) {
            System.out.println(numeroIf + " es igual a 0");
        } else System.out.println(numeroIf + " es mayor que 0\n\n");



        // Ejercicio While

        System.out.println("""
                Crea un bucle While, este bucle tendrá que tener como condición que la variable
                numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
                Incrementar el valor de la variable en uno cada vez que se ejecute.
                Mostrarlo por pantalla cada vez que se ejecute.
                """);

        int numeroWhile = 0;

        while (numeroWhile<3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // Ejercicio Do While

        System.out.println("\n\n Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.");

        int numeroDoWhile = 0;
        do {
            numeroDoWhile = numeroDoWhile + 3;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);


        // Ejercicio For

        System.out.println("\n \nPara el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 \ny su condición será que la variable sea igual o menor que 3, \nse irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.\n");

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Ejercicio Switch

        System.out.println("\n\nPor último, para el Switch, deberás crear la variable estacion, y distintos case para\nlas cuatro estaciones del año. Dependiendo del valor de la variable estacion\nse deberá mandar un mensaje por consola informando de la estación\nen la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación. \n\n");

        String estacion = "Primavera";

        switch(estacion) {
            case "Primavera":
                System.out.println("Estación: Primavera");
                break;
            case "Verano":
                System.out.println("Estación: Verano");
                break;
            case "Otoño":
                System.out.println("Estación: Otoño");
                break;
            case "Invierno":
                System.out.println("Estación: Invierno");
                break;
            default:
                System.out.println("Estación: NO DEFINIDA");
        }
    }
}