public class Persona {
    //atributos
    private String nombre;
    private int ci;
    private int edad; //puede no conocerse

    //constructores
    public Persona(){

    }

    public Persona(String unNombre, int unCI, int unEdad){
        this.nombre = unNombre;
        this.ci = unCI;
    }

    //setter y getter para cada atributo
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getCi() {
        return ci;
    }
    public void setCedula (int unCI) {
        this.ci = unCI;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad (int unEdad) {
        this.edad = unEdad;
    }

    //toString
    public String toString(){
        return "Tiene un nombre " + this.getNombre() + ", con un CI " + this.getCi() + " y una edad " + this.getEdad();
    }


}
