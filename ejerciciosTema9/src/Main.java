/*
Ejercicio Tema 9:

Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable crédito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
el teléfono, el nombre y el crédito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
y con una variable salario que solo tenga la clase Trabajador.
*/
public class Main {
     public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(34);
        persona.setNombre("David");
        persona.setTelefono("123123123");
        // Imprime los datos de la clase Persona
        System.out.println("- La Persona "+persona.getNombre() + " tiene " + persona.getEdad() + " años y su No. telefónico es: " + persona.getTelefono());


        // Instancia la clase Cliente
        Cliente cliente = new Cliente();
        cliente.setEdad(28);
        cliente.setNombre("Andrea");
        cliente.setTelefono("568941");
        cliente.setCredito(1200);

        // Imprime los datos de la clase Cliente
        System.out.println("\n- El cliente " + cliente.getNombre() + " tiene " + cliente.getEdad() + " años, su No telefónico es: " + cliente.getTelefono() + " y tiene un crédito de : $" + cliente.getCredito());

        // Instancia la clase Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(44);
        trabajador.setNombre("Jorge");
        trabajador.setTelefono("789789");
        trabajador.setSalario(7800);

         // Imprime los datos de la clase Trabajador
         System.out.println("\n- EL trabajador " + trabajador.getNombre() + " tiene " + trabajador.getEdad() + " años, su No. telefónico es: " + trabajador.getTelefono() + "y tiene un salario de : $" + trabajador.getSalario());

     }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}