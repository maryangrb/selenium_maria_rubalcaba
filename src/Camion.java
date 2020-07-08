public class Camion {
    //atributos
    private int chapa;
    private String color;
    private int annoCompra;


    //contructor sin parámetros
    public Camion(){
        this.chapa = 2785;
        this.color = "Verde";
        this.annoCompra = 1985;
    }

    //contructor con únicamente la chapa como parámetro
    public Camion (int unaChapa){
        this.chapa = unaChapa;
      //  this.color = "Verde";
      //  this.annoCompra = 1990;
    }

    //contructor con la chapa y el color, despues annoCompra
    public Camion (String unColor, int unaChapa, int unAnnoCompra){
        this.chapa = unaChapa;
        this.color = unColor;
        this.annoCompra = unAnnoCompra;
    }

    //metodos de acceso y modificacion
    public int getChapa() {
        return this.chapa;
    }

    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }

    public int getAnnoCompra(){
        return this.annoCompra;
    }

    public void setAnnoCompra(int unAnnoCompra){
        this.annoCompra = unAnnoCompra;
    }

    public String toString(){
        return "Camion de color " + this.getColor() + " con una chapa " +
                this.getChapa() + " con un anno de compra " + this.getAnnoCompra();
    }

    public boolean leTocaRevision(Camion revCamion){
        return this.getAnnoCompra() < 2015;
    }

    //comparar si dos camiones tienen el mismo color:
    public boolean tieneMismoColor(Camion otroCamion){
        return this.getColor().equals(otroCamion.getColor());
    }

}
