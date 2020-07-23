public class Developer extends Empleado{

    private String lenguaje;

    public Developer(String unLenguaje){
        this.lenguaje = unLenguaje;
    }
    public String getLenguaje(){
        return this.lenguaje;
    }
    public void setLenguaje (String unLenguaje){
        this.lenguaje = unLenguaje;
    }

    public String toString(){
        return "Su lenguaje es " + this.getLenguaje();
    }

}
