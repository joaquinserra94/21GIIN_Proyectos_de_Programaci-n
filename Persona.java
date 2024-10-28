// Definición de la clase Persona
public class Persona {                                      //Aquí, se define la clase Persona, que representa el "molde" para crear objetos de tipo Persona.
    private String nombre;                                  //Las clases se declaran con la palabra clave class. 
    private int edad;                                       //Public significa que la clase puede ser accedida desde otras partes del programa.
    

    // Constructor                                          El constructor es un método especial que se llama automáticamente cuando creamos un objeto de la clase.
    public Persona(String nombre, int edad) {               //Define un constructor que toma dos parámetros: nombre (tipo String) y edad (tipo int).
        this.nombre = nombre;                               //this.nombre = nombre; asigna el valor del parámetro nombre a la variable de instancia nombre.
        this.edad = edad;
    }                                                       //El prefijo this diferencia las variables de instancia de los parámetros del constructor.

    // Metodo para mostrar información permite mostrar los datos de la persona en la consola
    public void mostrarInformacion() {                      //Define un método público sin valor de retorno (void), llamado mostrarInformacion.
        System.out.println("Nombre: " + nombre + ", Edad: " + edad); //System.out.println es la instrucción para imprimir texto en Java.
    }

    // Metodo principal para probar la clase, Aquí es donde comienza la ejecución.
    public static void main(String[] args) {                //El método main es el punto de entrada de un programa en Java.
                                                            //La palabra clave static indica que este método pertenece a la clase, no a una instancia en particular.
        // Crear un objeto de la clase Persona              
        Persona persona1 = new Persona("Juan", 30);         //Crea un objeto persona1 de la clase Persona con el nombre "Juan" y la edad 30. Esto llama al constructor y asigna los valores correspondientes.
        Persona persona2 = new Persona("Ana", 25);

        // Llamar al metodo mostrar Informacion en cada objeto
        persona1.mostrarInformacion();                      //Llama al método mostrarInformacion del objeto persona1, que imprimirá "Nombre: Juan, Edad: 30".
        persona2.mostrarInformacion();
    }
}

public class Coche{
    private String modelo;
    private String color;
    private int kilometraje;


    public Coche (String modelo, String color, int kilometraje) {
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo + "Color: " + color + "Kilometraje: " + kilometraje);
    }

    public static void main (String[] args) {
        Coche coche1 = new Coche("BMW", "Blanco", 200000);
        Coche coche2 = new Coche("Sandero", "Gris", 80000);

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
    }


}