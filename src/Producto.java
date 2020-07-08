public class Producto {
    //atributos
    private String nombre;
    private int codigo;
    private boolean importado;
    private String nroLote;
    private int nroProducto;
    private static int IDENTIFICADOR = 0;

    //contructor sin parametros
    public Producto(){
        this.nombre = "Desconocido";
        this.codigo = 0;
        this.importado = false;
        this.nroLote = "Desconocido";
        IDENTIFICADOR++;
    }

    //contructor con parametros
    public Producto(String unNombre, int unCodigo){
        this.nombre = unNombre;
        this.codigo = unCodigo;
        IDENTIFICADOR++;
    }

    //contructor con parametros
    public Producto(String unNombre, int unCodigo, boolean unImportado, String unNroLote, int unNroProducto){
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.importado = unImportado;
        this.nroLote = unNroLote;
        this.nroProducto = unNroProducto;
        IDENTIFICADOR++;
    }

    //metodos de acceso y modificacion
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int unCodigo) {
        this.codigo = unCodigo;
    }

    public boolean getImportado() {
        return this.importado;
    }
    public void setImportado(boolean unImportado) {
        this.importado = unImportado;
    }

    public String getNroLote() {
        return this.nroLote;
    }
    public void setNroLote(String unNroLote) {
        this.nroLote = unNroLote;
    }

    public int getNroProducto() {
        return this.nroProducto;
    }
    public void setNroProducto(int unNroProducto) {
        this.nroProducto = unNroProducto;
    }

    //el toString
    public String toString(){
        String tipoProd;
       /* de esta forma funciona too:
        if (this.importado == true){
           tipoProd="Este producto es importado";
        }else{
            tipoProd="Producto nacional";

        }
        */

        tipoProd= ((this.importado==true)?"Este producto es importado":"Producto nacional");

        return "Producto de nombre " + this.getNombre() + ", con un codigo " + this.getCodigo()
                + ", con un lote " + this.getNroLote() + ", con un numero de producto " +
                this.getNroProducto() + ". "+tipoProd;
    }

    public boolean isImportado(Producto impProducto) {
        return importado;
    }
}
