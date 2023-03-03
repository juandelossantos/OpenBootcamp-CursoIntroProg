public class Coche {
    int cantidadPuertas;
    public Coche(int numeroPuertas) {
        cantidadPuertas = numeroPuertas;
        System.out.println("el Coche original tiene " + cantidadPuertas + " puertas");
    }

    public void agregarPuerta() {
        cantidadPuertas++;
        System.out.println("al coche ahora tiene " + cantidadPuertas + " puertas");
    }
}
