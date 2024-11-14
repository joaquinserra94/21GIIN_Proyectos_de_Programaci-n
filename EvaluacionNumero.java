import java.util.Scanner;

public class EvaluacionNumero {
    public static void main(String[] args) {
        // Paso 1: Crear un "escáner" para leer el número que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario que escriba un número entero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt(); // Guardamos el número que el usuario escribe

        // Paso 3: Comprobar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo."); // Si es mayor que cero, es positivo
        } else if (numero < 0) {
            System.out.println("El número es negativo."); // Si es menor que cero, es negativo
        } else {
            System.out.println("El número es cero."); // Si no es mayor ni menor, es cero
        }

        // Paso 4: Comprobar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par."); // Si el resto al dividir entre 2 es 0, es par
        } else {
            System.out.println("El número es impar."); // Si no, entonces es impar
        }

        // Paso 5: Cerrar el escáner para liberar recursos
        scanner.close();
    }
}
