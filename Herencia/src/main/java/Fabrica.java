import java.util.Scanner;

public class Fabrica {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int cantProd = input.nextInt();

        Producto p1 = new Producto("TV",5000);
        Perecedero c1 = new Perecedero("Jabon", 25, 30);
        NoPerecedero n1 = new NoPerecedero("Pollo", 150,"Cárnicos");

        //calcular(50);

    }
/*
    private static float calcular(){



    }*/
}
