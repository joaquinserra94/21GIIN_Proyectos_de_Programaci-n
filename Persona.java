//Constructores

public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona1 = new Persona("Juan", 30);
        persona1.mostrarInformacion();
    }
}

/*En este ejemplo:

Clase Persona: Define dos atributos privados, nombre y edad.
Constructor Persona: Inicializa los atributos nombre y edad cuando se crea una nueva instancia de la clase.
MÃ©todo mostrarInformacion: Imprime el nombre y la edad de la persona.
MÃ©todo main: Crea una instancia de la clase Persona y llama al mÃ©todo mostrarInformacion.*/