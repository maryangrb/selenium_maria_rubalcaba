public class Developer extends Empleado{

    private String lenguaje;

    public Developer(String unNombre, int unTelefono, float unSueldo,String unLenguaje){
        super (unNombre, unTelefono,unSueldo);
        this.lenguaje = unLenguaje;
    }
    public String getLenguaje(){
        return this.lenguaje;
    }
    public void setLenguaje (String unLenguaje){
        this.lenguaje = unLenguaje;
    }

    public String toString(){
        //llamar al toString de la clase padre
        return super.toString() + ". Su lenguaje es " + this.getLenguaje();
    }

}
