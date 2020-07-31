public class NoPerecedero extends Producto {
    //atributos
    private String tipo;

    //constructores
    public NoPerecedero (String unNombre, float unPrecio, String unTipo){
        super(unNombre,unPrecio);
        this.tipo = unTipo;
    }

    //setter y getter para cada atributo
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String unTipo){
        this.tipo = unTipo;
    }

    //toString
    public String toString (){
        String retorno = "";
        retorno += "Nombre del producto" + this.getNombre();
        retorno += ". Precio del producto" + this.getPrecio();
        retorno += ". Tipo de producto" + this.getTipo();

        return retorno;
    }


}
