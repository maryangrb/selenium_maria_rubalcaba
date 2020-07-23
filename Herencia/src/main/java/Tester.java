public class Tester extends Empleado{

    //atributos
    private boolean testerManual;
    private boolean testerAutomatizador;

    //constructores
    public Tester(String unNombre, int unTel, float unSueldo,boolean esManual, boolean esAutomatizador){
        super(unNombre, unTel, unSueldo);
        this.testerManual = esManual;
        this.testerAutomatizador = esAutomatizador;
    }

    //setter y getter para cada atributo
    public boolean getTesterManual(){
        return this.testerManual;
    }
    public void setTesterManual(boolean esManual){
        this.testerManual = esManual;
    }

    public boolean getTesterAutomatizador(){
        return this.testerAutomatizador;
    }
    public void setTesterAutomatizador(boolean esAutomatizador){
        this.testerManual = esAutomatizador;
    }

    //toString
    public String toString (){
        String retorno = "";

        if (testerManual == true){
            retorno += " Es tester Manual.";
        }
        if (testerAutomatizador == true){
            retorno += " Es tester Automatizador.";
        }
        return retorno;
    }


}
