import java.util.ArrayList;

public class EjerciciosListas {
    public static void main (String args []){
        //Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(2);
        listaEnteros.add(-20);
        listaEnteros.add(15);

        imprimirListaEnteros(listaEnteros);

        //Crear un método imprimirListaStrings que reciba una lista de Strings, y los imprima
        ArrayList<String> listaAnimales = new ArrayList<String>();
        listaAnimales.add("Perro");
        listaAnimales.add("Gato");
        listaAnimales.add("Delfin");
        System.out.println(listaAnimales);

        System.out.println("La lista de String esta vacia? " + listaAnimales.isEmpty());
        System.out.println("En la posicion 1 esta: " + listaAnimales.get(1));

        imprimirListaStrings(listaAnimales);

        System.out.println("La cantidad de elementos en la lista de enteros es de: " + cantElemLista(listaEnteros));

      /*  //esto es para que imprima si esta vacia o no
        if(esListaEnterosVacia(listaEnteros) == true){
            System.out.println("La lista de enteros está vacia.");
        }
        else {
            System.out.println("La lista de enteros NO está vacia.");
        }
        //esto es para que imprima la suma:
        System.out.println("La suma de los enteros de la lista es: " + sumaEnteros(listaEnteros));  */

        if (esListaEnterosVacia(listaEnteros) == false){
            int suma = sumaEnteros(listaEnteros);
            System.out.println("La suma de los enteros de la lista es: " + suma);
        }else{
            System.out.println("La lista esta vacia. La suma es 0 ");
        }

        System.out.println("El promedio es: " + promedioEnteros(listaEnteros));

        System.out.println("El minimo numero es: " + obtenerMenor(listaEnteros));
        System.out.println("El mayor numero es: " + obtenerMayor(listaEnteros));


    }
    public static void imprimirListaEnteros (ArrayList<Integer>listaEnteros){
        System.out.println("Voy a imprimir los elementos de la lista: ");
        for (int i = 0; i < listaEnteros.size(); i++){
            System.out.println(listaEnteros.get(i));
        }
    }

    public static void imprimirListaStrings (ArrayList<String>listaAnimales){
        System.out.println("Voy a imprimir los elementos de la lista: ");
        for (int i = 0; i < listaAnimales.size(); i++){
            System.out.println(listaAnimales.get(i));
        }
    }

    //Método que reciba una lista de enteros, y retorne la cantidad de elementos de la misma.
    public static int cantElemLista (ArrayList<Integer>listaEnteros){
        return listaEnteros.size();
    }

    //Método que reciba una lista de enteros, y retorne verdadero si y sólo si la lista está vacía.
    public static boolean esListaEnterosVacia (ArrayList<Integer>listaEnteros){
        if (listaEnteros.isEmpty() == true){
        return true;
        }else{
            return false;
        }
    }

    //Método que reciba una lista de enteros, y retorne la suma.
    public static int sumaEnteros(ArrayList<Integer>listaEnteros){
        int suma = 0;

        for (int i=0; i<listaEnteros.size(); i++){
            suma = suma + listaEnteros.get(i);
        }
        return suma;
    }

    //Método que reciba una lista de enteros, y retorne el promedio de los mismos.
    public static float promedioEnteros(ArrayList<Integer>listaEnteros){
        float promedio = 0;
        return promedio = sumaEnteros(listaEnteros) / listaEnteros.size();
    }

    //Método que reciba una lista de enteros, y retorne el menor.
    public static int obtenerMenor(ArrayList<Integer>listaNumeros){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) < min){
                min = listaNumeros.get(i);
            }
        }
        return min;
    }

    //Método que reciba una lista de enteros, y retorne el mayor
    public  static int obtenerMayor(ArrayList<Integer>listaNumeros){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i)>max){
                max = listaNumeros.get(i);
            }
        }
        return max;
    }



   //Método que reciba una lista de booleanos, y verdadero si y sólo si, todos los elementos de la lista son true.
    // De lo contrario se debe retornar false. Sugerencia: utilizar cortocircuito.



   //Método leerValores(): pide por teclado los números y los almacena en el ArrayList. La lectura acaba cuando se introduce el valor -99.
    // El método devuelve mediante return el ArrayList con los valores introducidos.



}
