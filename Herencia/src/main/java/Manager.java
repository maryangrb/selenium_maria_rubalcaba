public class Manager extends Empleado{

    private String area;

    public Manager(String unNombre, int unTelef, float unSueldo,String unArea){
        super(unNombre, unTelef, unSueldo);
        this.area = unArea;
    }

    public String getArea(){
        return this.area;
    }

    public void setArea(String unArea) {
        this.area = unArea;
    }

    public String toString(){
        //llamar al toString de la clase padre
        return super.toString() + ". Su area es " + this.getArea();
    }
}
