public class Producto {
    //atributos
    private String nombre;
    private float precio;

    //constructores
    public Producto (){

    }

    public Producto(String unNombre, float unPrecio){
        this.nombre = unNombre;
        this.precio = unPrecio;
    }

    //setter y getter para cada atributo
    public String getNombre(){
        return  this.nombre;
    }
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public float getPrecio(){
        return  this.precio;
    }
    public void setPrecio(float unPrecio){
        this.precio = unPrecio;
    }


    //toString
    public String toString (){
        return "Nombre del producto: " + this.getNombre() + ". Precio del producto: " + this.getPrecio();
    }

   /* public static float calcular(){
        int cantProd = 0;

       // float calcProd = cantProd * this.getPrecio();
        return ;


    }*/

}

