import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaSoft {

    public static void main (String args[]){
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        Scanner input = new Scanner(System.in);

        int opcion = 0;
        System.out.println("**** BIENVENIDOS ***");
        while (opcion != 5){
            System.out.println("1- Ingresar Tester");
            System.out.println("2- Ingresar Desarrollador");
            System.out.println("3- Ingresar Manager");
            System.out.println("4- Ver Empleados");
            System.out.println("5- Salir");
            opcion = input.nextInt();

            if (opcion == 1){
                System.out.println("Ingresar el nombre del Tester");
                String nombre = input.next();
                Empleado tester = new Tester(nombre, 1523, 4800, true,false);
                listaEmpleados.add(tester);

            }else if (opcion == 2){
                System.out.println("Ingresar el nombre del Desarrollador");
                String nombreDesa = input.next();
                Empleado dev = new Developer(nombreDesa, 15423, 50000, "Cobol");
                listaEmpleados.add(dev);

            }else if (opcion == 3){
                System.out.println("Ingresar el nombre del Manager");
                String nombreManager = input.next();
                Empleado manager = new Manager(nombreManager, 15423, 50000, "QA");
                listaEmpleados.add(manager);

            }else if(opcion == 4){
                imprimirEmpleados(listaEmpleados);

            }else{
                System.out.println("Saliendo!!!");
            }
            System.out.println("***************");
        }


        System.out.println("Ingrese un nombre ...");
        String nombre = input.next();

        System.out.println("Ingrese 1 si es tester manual, o 0 si no lo es");
        opcion = input.nextInt();

        boolean esTesterManual;
        if (opcion == 1){
            esTesterManual = true;
        }else{
            esTesterManual = false;
        }

        System.out.println("Ingrese 1 si es tester automatizador, o 0 si no lo es");
        int opcionAutomatizador = input.nextInt();

        boolean esTesterAutomatizador;
        if (opcionAutomatizador == 1){
            esTesterAutomatizador = true;
        }else{
            esTesterAutomatizador = false;
        }

       Tester t1 = new Tester(nombre, 554875, 852, esTesterManual, esTesterAutomatizador);
       //System.out.println(t1);

       Tester t2 = new Tester(true, true);
       //System.out.println(t2);

       //empleando Polimorfismo
       Empleado t3 = new Tester(true, false);
       //System.out.println(t3);

       Empleado t4 = new Developer("sofia",658932,9003,"Java");
       //System.out.println(t4);

       listaEmpleados.add(t1);
       listaEmpleados.add(t2);
       listaEmpleados.add(t3);
       listaEmpleados.add(t4);
       imprimirEmpleados(listaEmpleados);
    }

    private static void imprimirEmpleados(ArrayList<Empleado>listaEmpleados){
        System.out.println("*********** LISTA DE EMPLEADOS ************");
        if (listaEmpleados.isEmpty()){
            System.out.println("No hay empleados en el sistema");
        }else{
             for (Empleado e: listaEmpleados) {
                 System.out.println(e);
             }
        }
    }
}
