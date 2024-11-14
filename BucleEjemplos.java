import java.util.Scanner;

public class BucleEjemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero positivo
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();

        // Bucle for para imprimir los números del 1 al n
        System.out.println("Números del 1 al " + n + " usando bucle for:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bucle while para calcular y mostrar la suma de los números del 1 al n
        int suma = 0;
        int contador = 1;
        while (contador <= n) {
            suma += contador;
            contador++;
        }
        System.out.println("La suma de los números del 1 al " + n + " es: " + suma);

        // Bucle do-while para imprimir los números del n al 1
        System.out.println("Números del " + n + " al 1 usando bucle do-while:");
        int j = n;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
        System.out.println();

        scanner.close();
    }
}
