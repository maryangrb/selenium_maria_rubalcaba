public class Socio {
    //atributos
    private String nombre;
    private int numero;
    private int proximoNumero;
    private static int IDENTIFICADOR = 1;

    //contructor sin parámetros
    public Socio(){
        IDENTIFICADOR ++;
    }

    //contructor con parámetros
    public Socio(String unNombre, int unNumero, int unProximoNumero){
        this.nombre = unNombre;
        this.numero = unNumero;
        this.proximoNumero = unProximoNumero;
        IDENTIFICADOR ++;
    }

    //metodos de acceso y modificacion
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int unNumero) {
        this.numero = unNumero;
    }

    public int getProximoNumero() {
        return this.proximoNumero;
    }
    public void setProximoNumero(int unProximoNumero) {
        this.proximoNumero = unProximoNumero;
    }

    public String toString(){
        return "El nombre del socio es " + this.getNombre() + " con numero "
                + this.getNumero() + " y el proximo numero es " + this.getProximoNumero();
    }



}
