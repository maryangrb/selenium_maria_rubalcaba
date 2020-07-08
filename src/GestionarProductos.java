import java.util.Scanner;

public class GestionarProductos {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        //crear productos
        /*Producto p1 = new Producto();
        System.out.println(p1); */

        //pedir ingresar 3 productos
        System.out.println("Ingrese el nombre del producto 1: ");
        String aNombre = input.next();
        System.out.println("Ingrese el codigo del producto 1: ");
        int aCodigo = input.nextInt();
        System.out.println("Ingrese si es importado o no 1: ");
        boolean aImportado = input.nextBoolean();
        System.out.println("Ingrese el NroLote  del producto 1: ");
        String aNroLote = input.next();
        System.out.println("Ingrese el NroProducto del producto 1: ");
        int aNroProducto = input.nextInt();

        Producto p1 = new Producto (aNombre,aCodigo,aImportado, aNroLote, aNroProducto);

        System.out.println("Ingrese el nombre del producto 2: ");
        String bNombre = input.next();
        System.out.println("Ingrese el codigo del producto 2: ");
        int bCodigo = input.nextInt();
        System.out.println("Ingrese si es importado o no 2: ");
        boolean bImportado = input.nextBoolean();
        System.out.println("Ingrese el NroLote  del producto 2: ");
        String bNroLote = input.next();
        System.out.println("Ingrese el NroProducto del producto 2: ");
        int bNroProducto = input.nextInt();

        Producto p2 = new Producto (bNombre,bCodigo,bImportado, bNroLote, bNroProducto);

        System.out.println("Ingrese el nombre del producto 3: ");
        String cNombre = input.next();
        System.out.println("Ingrese el codigo del producto 3: ");
        int cCodigo = input.nextInt();
        System.out.println("Ingrese si es importado o no 3: ");
        boolean cImportado = input.nextBoolean();
        System.out.println("Ingrese el NroLote  del producto 3: ");
        String cNroLote = input.next();
        System.out.println("Ingrese el NroProducto del producto 3: ");
        int cNroProducto = input.nextInt();

        Producto p3 = new Producto (cNombre,cCodigo,cImportado, cNroLote, cNroProducto);

        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);

        /*
        boolean productoImportado = p1.isImportado(p1);
        if (productoImportado == true){
            System.out.println("Este producto es importado");
        }else{
            System.out.println("Producto nacional");
        } */

       // Producto p2 = new Producto();
       // Producto p3 = new Producto();

    }
}
