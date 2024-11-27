import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el primer número
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        // Pedir al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar las operaciones y mostrar los resultados
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = 0;

        // Verificar que no se realice una división por cero
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (num2 != 0) {
            System.out.println("División: " + division);
        }

        // Cerrar el scanner
        scanner.close();
    }
}