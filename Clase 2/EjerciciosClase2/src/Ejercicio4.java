//Crea una función que reciba un número y regrese verdadero o falso dependiendo si el número es primo.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int num = sc.nextInt();

        boolean esPrimo = esPrimo(num);
        if (esPrimo) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }


    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}



