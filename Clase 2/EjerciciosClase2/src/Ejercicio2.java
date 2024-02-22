// Crea una función que reciba un arreglo y regrese el número máximo

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] numeros = {5, 89, 30, 1, 23};
        int mayor = numeroMayor(numeros);
        System.out.println("El número máximo del arreglo es: " + mayor);

    }

    public static int numeroMayor(int[] numeros) {
        int numMayor = 0;
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
            }

        }

        return numMayor;
    }


}
