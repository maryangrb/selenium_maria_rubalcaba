import java.util.Scanner;

public class GestionarSocio {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int num = 2;

        //crear un socio
        Socio s1 = new Socio();
        //mostrar datos en la pantalla del socio 1
        System.out.println(s1);

        //crear otro socio
        Socio s2 = new Socio("Daniel", 2,3);
        //mostrar datos en la pantalla del socio 2
        System.out.println(s2);


       //Pedir el ingreso de socios hasta que se ingrese el 0
       /* while (num != 0){
            System.out.println("Ingrese el nombre del socio: ");
            String aNombre = input.next();
            System.out.println("Ingrese el numero: ");
            int aNumero = input.nextInt();
            System.out.println("Ingrese el proximo numero: ");
            int aProximoNumero = input.nextInt();
        }*/
        //System.out.println("El programa ha finalizado ya que se ingreso el numero 0");

    }
}
