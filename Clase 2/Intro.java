/*
PascalCase: CadaPalabravaConMayuscula -> Nombre Archivos y Nombres de Clases
javac NombreArchivo.java ->compilar
java NombreArchivo ->ejecutar
*/

public class Intro {

    // Metodo Principal
    public static void main(String[] args) {

        System.out.println("Hello, World!"); // Impresion

        //Primitivo - SOLO GUARDAR valor
        int miEntero; //Declarando la variable
        miEntero = 400; //Asignando valor
        double pi = 3.141592; //Declarando y asignando valor
        boolean bool = true; // true o false
        char unCaracter = 'a'; //Un Caracter

        //Objeto ->Metodos que ayudan a manipular
        Integer myInteger = 5;
        Double myDouble = 4.20;
        Character myChar = 'A';
        String myString = "ABC";

        System.out.println(myString);

        String cadena = "Buenas noches a todos mis conpañeros";
        System.out.println("Cantidad de carateres es de:" + cadena.length());

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());


        String x = "Hola";
        String y = "hola";
        System.out.println(x.equals(y)); //Case sensitive 


        // ================= (CONDICIONALES) ========================== //
        double otroDouble =400.00;
        if (myInteger == otroDouble) { // == != > < >= <=
            System.out.println("Numeros iguales");
        } else {
            System.out.println("Numeros distintos");
        }

        // EJEMPLO
        int edadInfante = 4;
        if (edadInfante < 2) {
            System.out.println("el infante es un bebe");
        } else if (edadInfante <= 4) {
            System.out.println("el infante es un toddler");
        } else {
            System.out.println("el infante es un niño");
        }

        // OTRO EJEMPLO
        boolean llueve = false;
        int temperatura = 20;

        if (temperatura >= 18 && !llueve) {
            System.out.println("Es un gran dia para un paseo en el parque");
        }

        // OTRO EJEMPLO
        int edad = 16;
        boolean permisoPadres = true;
        if (edad > 18 || permisoPadres) { //Si una de las 2 condiciones es verdadera da true
            System.out.println("Puedes obtener tu licencia de conducir");
        }


        // ================= (BUCLES) ========================== //

        //BUCLE FOR
        for(int i = 0; i <7; i++) {
            System.out.println("alo?");
        }
                /*
        i = 0
        alo?
        i = 1
        alo?
        i = 2
        alo?
        i = 3
        alo?
        i = 4
        alo?
        i = 5
        alo?
        i = 6
        alo?
        i = 7
        Se detiene el bucle
        */

        //BUCLE WHILE
        int inicio = 0;
        int fin = 10;
        while(inicio > fin) {
            System.out.println("hola?");
            inicio++;
            fin-= 2; //fin = fin - 2
        }
        /*
        inicio = 0
        fin = 10
        hola?
        --------------------
        inicio = 1
        fin = 8
        hola?
        --------------------
        inicio = 2
        fin = 6
        hola?
        --------------------
        inicio = 3
        fin = 4
        hola?
        --------------------
        inicio = 4
        fin = 2
        FINALIZA EL BUCLE
        */

        //BUCLE DO WHILE
        int num1 = 10;
        int num2 = 9;

        do {
            System.out.println("Entro?");
        } while (num1 < num2);


        // ================= (ARRAYS) ========================== //
        int [] miArreglo; // Declaracion
        miArreglo = new int[5]; // Asignacion / Inicializacion 
        miArreglo[0] = 4; // Asignando valor
        miArreglo[1] = 8;
        miArreglo[2] = 8;
        miArreglo[3] = 5;
        miArreglo[4] = 9;

        int[] miArreglo2 = {4,8,8,5,9};
        System.out.println(miArreglo[3]);
        System.out.println(miArreglo2[4]); 

        //OJO: En un array, una vez establecido el tamaño NO se puede cambiar.
        // En caso de requerir algo mas dinamico usar ArrayList

        // Un Array se recorre con un bucle for
        for(int i = 0; i < miArreglo.length; i++) {
            System.out.println(miArreglo[i]);
        }

        // Para obtener la uiltima posicion del array
        System.out.println(miArreglo[miArreglo.length - 1]);

        // ================= (METODOS) ========================== //
        saludo();
        saludo();
        saludo();



    }

            // ================= (METODOS) ========================== //

        /*
        Permisos de la función: public, private, protected, static, abstract
        static -> De clase (Detalle en OOP)
        Tipo de valor de retorno -> String, int, double. No regresa nada: void
        Nombre de la función -> camelCase
        (Argumentos)
        */
        public static void saludo() {
            System.out.println("Hola Mundo!");
        }


}

