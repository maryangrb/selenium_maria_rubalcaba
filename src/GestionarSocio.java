import java.util.ArrayList;
import java.util.Scanner;

public class GestionarSocio {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<Socio> listaSocios = new ArrayList<Socio>();

        //crear un socio
        Socio s1 = new Socio();
        s1.setProximoNumero(1);
        //mostrar datos en la pantalla del socio 1
        System.out.println(s1);
        listaSocios.add(s1); //add el socio 1 a la lista de socios

        //crear otro socio
        Socio s2 = new Socio("Daniel", 2);
        //mostrar datos en la pantalla del socio 2
        System.out.println(s2);
        listaSocios.add(s2); //add el socio 2 a la lista de socios


       //Pedir el ingreso de socios hasta que se ingrese el 0


       //Al finalizar el ingreso, se debe mostrar la lista de socios en pantalla
        System.out.println(listaSocios);

        System.out.println("La lista está vacía?" + listaSocios.isEmpty());

        System.out.println("En la posicion 1 está: " + listaSocios.get(1));

       // imprimirLista(listaSocios);

      /*  int proximoN = 1;
        while ( proximoN!= 0){
            System.out.println("Ingrese el nombre del socio: ");
            String aNombre = input.next();
            System.out.println("Ingrese el proximo numero: ");
            int aProximoNumero = input.nextInt();

            Socio s3 = new Socio(aNombre, aProximoNumero);
            System.out.println(s3);

            listaSocios.add(s3);
        }*/
        //System.out.println("El programa ha finalizado ya que se ingreso el numero 0");

    }
    /*me está dando error con el .size
    public static void imprimirLista(ArrayList<Socio>listaSocios){
        System.out.println("Voy a imprimir al lista de socios: ");
        for (int i = 0; listaSocios.size(); i++){
            System.out.println(listaSocios);
        }
    }*/
}
