import java.util.Scanner;

public class Fabrica {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int cantProd = input.nextInt();

        System.out.println("Ingrese la cantidad de productos perecederos: ");
        int cantP = input.nextInt();

        System.out.println("Ingrese la cantidad de productos no perecederos: ");
        int cantNP = input.nextInt();

        Producto p1 = new Producto("TV",5000);
        Perecedero c1 = new Perecedero("Jabon", 25, 1);
        NoPerecedero n1 = new NoPerecedero("Pollo", 150,"Cárnicos");

        float calP = p1.calcular(cantProd);
        System.out.println("El cálculo de Productos es: " + calP);

        float calPer = c1.calcular(cantP);
        System.out.println("El cálculo de productos perecederos es: " + calPer);

        float calNP = n1.calcular(cantNP);
        System.out.println("El cálculo de productos no perecederos es " + calNP);

        }
}
