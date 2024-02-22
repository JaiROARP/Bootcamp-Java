// Crea una función que reciba un arreglo e imprima los números pares.

public class Ejercicio3 {
    public static void main(String[] args) {

    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    numerosPares(numeros);


    }

    public static void numerosPares(int[]numeros) {

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }

        }
    }


}
