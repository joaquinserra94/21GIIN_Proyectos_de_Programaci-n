//Herencia
// Clase base o padre
class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        // MÃ©todo que serÃ¡ sobrescrito por las clases hijas
    }
}

// Clase derivada o hija
class Perro extends Animal {
    private String firstname;
    public Perro(String nombre) {
        super(nombre);
    }
    public String getFirstName() {
        return firstname;
    }
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

// Clase derivada o hija
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

// Clase principal para probar las clases
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Rex");
        Gato miGato = new Gato("Luna");

        System.out.println(miPerro.getNombre() + " dice ");
        miPerro.hacerSonido();
        miPerro.

        System.out.println(miGato.getNombre() + " dice ");
        miGato.hacerSonido();
    }
}