import java.util.Scanner;

public class Automotora {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        //Crear un camión utilizando cada uno de los constructores:
        Camion c1 = new Camion();
        System.out.println(c1);

        //	Mostrar los datos en pantalla de cada camión
       /* System.out.println("La chapa del camión c1 es " + c1.getChapa());
        System.out.println("El color del camión c1 es " + c1.getColor());
        System.out.println("El color del camión c1 es " + c1.getAnnoCompra());*/

        Camion c2 = new Camion(78963);    //creo un camion
        //c2.setChapa(9875);
        System.out.println(c2);
        /*
        System.out.println("La chapa del camión c2 es " + c2.getChapa());
        System.out.println("El color del camión c2 es " + c2.getColor());
        System.out.println("El color del camión c2 es " + c2.getAnnoCompra()); */

        Camion c3 = new Camion("Rojo",5623, 2018);  //creo un camion
        System.out.println(c3);
        /*
        System.out.println("La chapa del camión c3 es " + c3.getChapa());
        System.out.println("El color del camión c3 es " + c3.getColor());
        System.out.println("El color del camión c3 es " + c3.getAnnoCompra()); */

        //Pedir los datos de un camión al usuario
        System.out.println("Ingrese la chapa del camión: ");
        int aChapa = input.nextInt();

        System.out.println("Ingrese el color del camión: ");
        String aColor = input.next();

        System.out.println("Ingrese el año de compra del camión: ");
        int aAnnoCompra = input.nextInt();

        Camion c4 = new Camion(aColor, aChapa,aAnnoCompra);
        System.out.println(c4);

        boolean tocaRevision = c4.leTocaRevision(c4);
         if(tocaRevision == true){
             System.out.println("Le toca revisión al camión");
         }else{
             System.out.println("No le toca revisión al camión");
         }

        boolean sonIguales = c1.tieneMismoColor(c4);
         if (sonIguales == true){
             System.out.println("Tienen el mismo color");
         }else{
             System.out.println("No tienen el mismo color");
         }

    }

}
