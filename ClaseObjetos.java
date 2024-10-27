// Definición de la clase Persona
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Metodo principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Ana", 25);

        // Llamar al mÃ©todo mostrar Informacion en cada objeto
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
    }
}