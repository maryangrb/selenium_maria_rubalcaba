public class Empleado {
    //nombre, telefono, sueldo...
    private String nombre;
    private int telefono;
    private float sueldo;

    public Empleado(){

    }

    public Empleado(String unNombre, int unTelefono, float unSueldo){
        this.nombre = unNombre;
        this.telefono = unTelefono;
        this.sueldo = unSueldo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int unTelefono){
        this.telefono = unTelefono;
    }

    public float getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(float unSueldo){
        this.sueldo = unSueldo;
    }

    public String toString (){
        return "Nombre del empleado: " + this.getNombre() + ". Telefono " + this.getTelefono() + ". Sueldo de: " + this.getSueldo();
    }
}
