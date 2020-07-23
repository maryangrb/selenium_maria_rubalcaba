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
        return materia;
    }
    public void setMateria(String unMateria){
        this.materia = unMateria;
    }

    public float getSalario(){
        return salario;
    }
    public void setSalario(float unSalario){
        this.salario = unSalario;
    }

    //toString
}
