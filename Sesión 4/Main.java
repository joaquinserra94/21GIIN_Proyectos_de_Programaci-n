interface Volador {
    void volar();
}

class Pajaro implements Volador {
    public void volar() {
        System.out.println("El pÃ¡jaro vuela");
    }
}

public class Main {
    public static void main(String[] args) {
        Volador miVolador = new Pajaro();
        miVolador.volar(); // Salida: El pÃ¡jaro vuela
    }
}