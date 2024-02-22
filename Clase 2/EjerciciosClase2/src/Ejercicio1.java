// Crea una función que sume los números del 1 - 255

public class Ejercicio1 {
    public static void main(String[] args) {

        int resultado = sumarNumeros();
        System.out.println("La suma de los numeros del 1 al 255 es = " + resultado);

    }


    public static int sumarNumeros() {
        int suma = 0;
        for (int i = 1; i <= 255; i++) {

            suma += i;

        }

        return suma;

    }

}