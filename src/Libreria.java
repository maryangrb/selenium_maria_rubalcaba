import java.util.Scanner;

public class Libreria {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        //Pedir los datos al usuario
        System.out.println("Ingrese el ISBN del libro: ");
        int aISBN = input.nextInt();
        System.out.println("Ingrese el titulo del libro: ");
        String aTitulo = input.next();
        System.out.println("Ingrese el autor del libro: ");
        String aAutor = input.next();
        System.out.println("Ingrese el numero de paginas del libro: ");
        int aNumPaginas = input.nextInt();

        System.out.println("Ingrese el ISBN del libro: ");
        int bISBN = input.nextInt();
        System.out.println("Ingrese el titulo del libro: ");
        String bTitulo = input.next();
        System.out.println("Ingrese el autor del libro: ");
        String bAutor = input.next();
        System.out.println("Ingrese el numero de paginas del libro: ");
        int bNumPaginas = input.nextInt();

        Libro l1 = new Libro(aISBN, aTitulo, aAutor, aNumPaginas);
        Libro l2 = new Libro(bISBN, bTitulo, bAutor, bNumPaginas);

        System.out.println(l1);
        System.out.println(l2);

    }
}
