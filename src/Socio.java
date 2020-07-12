public class Socio {
    //atributos
    private String nombre;
    //private int numero;
    private int nroSocio; //este es el numero de socio con autoincremento
    private int proximoNumero;
    private static int IDENTIFICADOR = 0;

    //contructor sin parámetros
    public Socio(){
        this.nroSocio = IDENTIFICADOR;
        IDENTIFICADOR ++;
    }

    //contructor con parámetros
    public Socio(String unNombre,  int unProximoNumero){
        this.nombre = unNombre;
        //this.numero = unNumero;
        this.proximoNumero = unProximoNumero;
        this.nroSocio = IDENTIFICADOR;
        IDENTIFICADOR ++;
    }

    //metodos de acceso y modificacion
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    /*public int getNumero() {
        return this.numero;
    }
    public void setNumero(int unNumero) {
        this.numero = unNumero;
    }*/

    public int getProximoNumero() {
        return this.proximoNumero;
    }
    public void setProximoNumero(int unProximoNumero) {
        this.proximoNumero = unProximoNumero;
    }

    public String toString(){
        return "Nro Socio " +this.nroSocio + " El nombre del socio es " + this.getNombre() +
                " y el proximo numero es " + this.getProximoNumero();
    }

    /*como estaba con la otra variable de numero
    public String toString(){
        return "Nro Socio " +this.nroSocio + " El nombre del socio es " + this.getNombre() + " con numero "
                + this.getNumero() + " y el proximo numero es " + this.getProximoNumero();
    }*/

}
