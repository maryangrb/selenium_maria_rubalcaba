public class Libro {
    //atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    //contructor sin parámetros
    public Libro(){
        this.titulo = "Sin titulo";

    }

    //contructor con parámetros
    public Libro(int unISBN, String unTitulo, String unAutor, int unNumPaginas){
        this.ISBN = unISBN;
        this.titulo = unTitulo;
        this.autor = unAutor;
        this. numPaginas = unNumPaginas;
    }

    //metodos de acceso y modificacion
    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int unISBN) {
        this.ISBN = unISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String unTitulo) {
        this.titulo = unTitulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String unAutor) {
        this.autor = unAutor;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int unNumPaginas) {
        this.numPaginas = unNumPaginas;
    }

    public String toString(){
        String autDesc;
        autDesc= ((this.autor.equals("null"))?"Desconocido":this.autor); //no funciona

        return "El libro con ISBN " + this.getISBN() +
                " creado por el autor " + autDesc +
                " tiene " + this.getNumPaginas()  + " páginas." ;
    }

}
