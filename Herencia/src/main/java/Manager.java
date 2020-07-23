public class Manager extends Empleado{

    private String area;

    public Manager(String unArea){
        this.area = unArea;
    }

    public String getArea(){
        return this.area;
    }

    public void setArea(String unArea) {
        this.area = unArea;
    }

    public String toString(){
        return "Su area es " + this.getArea();
    }
}
