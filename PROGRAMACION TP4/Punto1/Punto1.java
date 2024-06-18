package Punto1;
import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero 0>12 para calcular su factorial: ");
        String input = scanner.nextLine();

        try {
            int numero = Integer.parseInt(input);
            long result = factorial(numero);
            System.out.println("El factorial de " + numero + " es " + result);
        } catch (NumberFormatException e) {//exception si no es un numero entero
            System.out.println("Error: La entrada no es un numero entero");
        } catch (IllegalArgumentException e) {//exception si es un argumento que no va
            System.out.println(e.getMessage());//para manejar la excepcion
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un numero negativo");
        }
        if (n > 12) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un numero mayor a 12");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }}