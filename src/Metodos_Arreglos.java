import java.util.Random;

public class Metodos_Arreglos {
    public static void main (String args[]){

        //Definir un arreglo de Double de 16 posiciones. Imprimir todos los valores del mismo.
        Double[] longitud = new Double[16];
        longitud [12]= 5.4;

        for (int i=0; i<longitud.length; i++){
            System.out.println(longitud[i]);
        }

        //Definir un arreglo de Booleanos con 9 posiciones. Imprimir todos los valores del arreglo.

        Boolean[] esHombre = new Boolean[9];

        for (int i=0; i<esHombre.length; i++){
            System.out.println(esHombre[i]);
        }

        //Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        //Obtener la suma de todos ellos y el promedio.
        Integer[] numeros = new Integer[100];
        int suma = 0;
        Random r = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(6)+1;
            suma = suma + numeros[i];
        }
        System.out.println("La suma es " + suma);

        float promedio = suma / 100;
        System.out.println("El promedio es " + promedio);

        //8-Llenar un array con números aleatorios. Imprimir todos los números en pantalla
        Integer[] nroAleatorios = new Integer[50];
        //Random r = new Random(); //ya está definida arriba

        for (int i = 0; i < nroAleatorios.length; i++) {
            nroAleatorios[i] = r.nextInt(6)+1;
        }
        System.out.println("Los numeros aleatorios son: " + nroAleatorios);

        //9.Crear un array de booleanos con 10 posiciones llamado asientosLibres y colocar todos sus elementos en true.
        Boolean[] asientosLibres = new Boolean[10];
        for (int i = 0; i<asientosLibres.length; i++){
            asientosLibres[i] = true;
        }

    }
    /* 10.Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
       Mostrar la cantidad de números positivos, negativos y ceros: Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”
     */

    public static void clasificarNros (Integer[] numeros){
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        for (int i=0; i< numeros.length; i++){
            if(numeros[i]>0){
                positivos++;
            }else if (numeros[i]<0){
                negativos++;
            }else{
                ceros++;
            }
        }
        System.out.println("Se  ingresaron " + positivos + "numeros mayores a 0");
        System.out.println("Se  ingresaron " + negativos + "numeros menores a 0");
        System.out.println("Se  ingresaron " + ceros + "numeros iguales  a 0");
    }

    //11.Crear un método que reciba un arreglo, y retorne la cantidad de elementos de la misma.
    public static int cantElementos (Integer[] arregloEnteros){
        return arregloEnteros.length;
    }

    //12.Crear un método llamado crearArregloBooleano que retorne un arreglo de 10 posiciones de tipo booleanos donde todas sus posiciones tengan valor false.
    public static Boolean[] crearArregloBooleano(){
        Boolean[]arregloBooleano = new Boolean[10];
        for (int i = 0; i < 10; i++){
            arregloBooleano[i] = false;
        }
        return arregloBooleano;
    }

    //13.Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos de un array de enteros el cual es recibido por parámetro
    public static void imprimirArregloEnteros(Integer[]arregloEnteros){
        for (int i = 0; i < arregloEnteros.length; i++){
            System.out.println("Posicion " + i + " es: " + arregloEnteros[i]);
        }
    }

    //14.Crear un método llamado imprimirArreglo que imprima en pantalla todos los elementos de un array de booleanos el cual es recibido por parámetro.
    public static void imprimirArregloBooleano(Boolean[]arreglosBooleanos){
        for (int i = 0; i < arreglosBooleanos.length; i++){
            System.out.println("Posicion " + i + " es: " + arreglosBooleanos[i]);
        }
    }

    //15.Crear un método que muestre en pantalla todos los elementos de un array de float.
    public static void imprimirArregloFloat(Float[]arregloFloat){
        for (int i = 0; i < arregloFloat.length; i++){
            System.out.println("Posicion " + i + " es: " + arregloFloat[i]);
        }
    }
    /*
    16.	Crear un método que reciba una arreglo de floats, y retorne el promedio de los mismos.
    17.	Crear un método que reciba un arreglo, y retorne la suma.
     */
    public static float calcularPromedio (float[]arreglosFloat){
        float suma = 0;
        for (int i = 0; i < arreglosFloat.length; i++){
            suma = suma + arreglosFloat[i];
        }
        return suma / arreglosFloat.length;
    }

    //18.Crear un método que reciba un arreglo de enteros, y retorne el menor.
    public static int obtenerMenor (Integer[]arreglosEnteros){
        int min = arreglosEnteros[0];
        for (int i = 0; i< arreglosEnteros.length; i++){
            if (arreglosEnteros[i] < min){
                min = arreglosEnteros[i];
            }
        }
        return min;
    }

    //19.Crear un método que reciba un arreglo de enteros, y retorne el mayor.
    public static int obtenerMayor (Integer[]arreglosEnteros){
        int max = arreglosEnteros[0];
        for (int i = 0; i< arreglosEnteros.length; i++){
            if (arreglosEnteros[i] > max){
                max = arreglosEnteros[i];
            }
        }
        return max;
    }


    //20.Crear un método llamado hayVacantes que reciba un arreglo de booleanos y retorne verdadero si alguna de sus posiciones esta en true, de lo contrario, deberá retornar false.
    public static boolean hayVacantes (boolean[] arreglosBoolean){
        for (int i = 0; i < arreglosBoolean.length; i++){
            if (arreglosBoolean[i] == true) {
                return true;
            }
        }
        return false;
    }

    //21.Crear un método reciba un arreglo de enteros por parámetro y que solicite el ingreso de un valor. Debe retornar true si y sólo si el valor ingresado por el usuario se encuentra en el arreglo.


    //22.Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los elementos son verdaderos.


}
