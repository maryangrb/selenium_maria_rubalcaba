public class Profesor extends Persona{
    //atributos
    private String materia;
    private float salario;

    //constructores
    public Profesor (String unNombre, int unCI, int unEdad, String unMateria, float unSalario){
        super(unNombre, unCI, unEdad);
        this.materia = unMateria;
        this.salario = unSalario;
    }

    //setter y getter para cada atributo
    public String getMateria(){
        return this.materia;
    }
    public void setMateria(String unMateria){
        this.materia = unMateria;
    }

    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float unSalario){
        this.salario = unSalario;
    }

    //toString
    public String toString (){
        String retorno = "";
        retorno += "Nombre de la persona: " + this.getNombre();
        retorno += ". CI de la persona: " + this.getCi();
        retorno += ". Edad de la persona: " + this.getEdad();
        retorno += ". Materia del profesor: " + this.getMateria();
        retorno += ". Salario del profesor: " + this.getSalario();

        return retorno;
    }


}
