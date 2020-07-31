import java.util.ArrayList;
import java.util.Scanner;

public class Escuela {

    public static void main(String args[]) {
       // ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();

        Scanner input = new Scanner(System.in);

        int opcion = 0;
        System.out.println("**** BIENVENIDOS ***");
        while (opcion != 5) {
            System.out.println("1- Agregar profesor");
            System.out.println("2- Agregar alumno");
            System.out.println("3- Ver alumnos");
            System.out.println("4- Ver profesores");
            System.out.println("5- Salir");
            opcion = input.nextInt();

            if(opcion == 1){
                System.out.println("Ingresar el nombre del profesor");
                String nombre = input.next();
                System.out.println("Ingresar el ci del profesor");
                int ci = input.nextInt();
                System.out.println("Ingresar la edad del profesor");
                int edad = input.nextInt();
                System.out.println("Ingresar la materia del profesor");
                String materia = input.next();
                System.out.println("Ingresar el salario del profesor");
                float salario = input.nextFloat();
                Profesor profesor = new Profesor(nombre, ci,edad,materia,salario);
                listaProfesores.add(profesor);

            }else if (opcion == 2){
                System.out.println("Ingresar el nombre del alumno");
                String nombre = input.next();
                System.out.println("Ingresar el ci del alumno");
                int ci = input.nextInt();
                System.out.println("Ingresar la edad del alumno");
                int edad = input.nextInt();
                System.out.println("Ingresar el nro de estudiante del alumno");
                int nroEst = input.nextInt();
                //System.out.println("Ingresar el grupo del alumno"); //es 1A por defecto
                //String grupo = input.next();

                Alumno alumno = new Alumno(nombre,ci,edad,nroEst, "1A",false);
                listaAlumnos.add(alumno);


            }else if (opcion == 3){
                imprimirAlumnos(listaAlumnos);

            }else if (opcion == 4){
                imprimirProfesores(listaProfesores);

            }else{
                System.out.println("Saliendo!!!");
            }
            System.out.println("***************");
        }

       // imprimirPersonas(listaPersonas);
        imprimirProfesores(listaProfesores);
        imprimirAlumnos(listaAlumnos);

    }

    private static void imprimirPersonas(ArrayList<Persona>listaPersonas){
        System.out.println("*********** LISTA DE PERSONAS ************");
        if (listaPersonas.isEmpty()){
            System.out.println("No hay personas en el sistema");
        }else{
            for (Persona p: listaPersonas){
                System.out.println(p);
            }
        }
    }
    private static void imprimirProfesores(ArrayList<Profesor>listaProfesores){
        System.out.println("*********** LISTA DE PROFESORES ************");
        if (listaProfesores.isEmpty()){
            System.out.println("No hay profesores en el sistema");
        }else{
            for (Profesor f: listaProfesores){
                System.out.println(f);
            }
        }
    }

    private static void imprimirAlumnos(ArrayList<Alumno>listaAlumnos){
        System.out.println("*********** LISTA DE ALUMNOS ************");
        if (listaAlumnos.isEmpty()){
            System.out.println("No hay alumnos en el sistema");
        }else{
            for (Alumno a: listaAlumnos){
                System.out.println(a);
            }
        }
    }
}
