public class Tester extends Empleado{

    //atributos
    private boolean testerManual;
    private boolean testerAutomatizador;

    //constructores
    public Tester(boolean esTesterManual, boolean esTesterAutomatizador){
        this.testerManual = esTesterManual;
        this.testerAutomatizador = esTesterAutomatizador;
    }

    public Tester(String unNombre, int unTel, float unSueldo,boolean esManual, boolean esAutomatizador){
        //super es una palabra reservada, llama a los metodos publicos de la clase padre
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
        if (esAutomatizador == true){
            this.testerManual = true;
        }
        this.testerAutomatizador = esAutomatizador;
    }

    //toString
    public String toString (){
        String retorno = "";
        retorno += "Nombre del empleado: " + this.getNombre();
        retorno += ". Sueldo del empleado: " + this.getSueldo();
        retorno += ". Telefono del empleado: " + this.getTelefono();

        if (testerManual == true){
            retorno += " Es tester Manual.";
        }else{
            retorno += " No es tester Manual.";
        }
        if (testerAutomatizador == true){
            retorno += " Es tester Automatizador.";
        }else{
            retorno += " No es tester Automatizador.";
        }
        return retorno;
    }


}
