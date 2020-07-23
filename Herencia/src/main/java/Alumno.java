public class Alumno extends  Persona{
    //atributos
    private int nroEstudiante;
    private String grupo;
    private boolean tienePrevia;

    //constructores
    public Alumno (String unNombre, int unCI, int unEdad, int unNroEstudiante, String unGrupo, boolean noTienePrevia){
        super(unNombre, unCI, unEdad);
        this.nroEstudiante = unNroEstudiante;
        this.grupo = "1A";
        this.tienePrevia  = noTienePrevia;
    }

    //setter y getter para cada atributo
    public int getNroEstudiante(){
        return this.nroEstudiante;
    }
    public void setNroEstudiante(int unNroEstudiante){
        this.nroEstudiante = unNroEstudiante;
    }

    public String getGrupo(){
        return this.grupo;
    }
    public void setGrupo(String unGrupo){
        this.grupo = unGrupo;
    }

    public boolean getTienePrevia(){
        return tienePrevia;
    }
    public void setTienePrevia(boolean noTienePrevia){
        this.tienePrevia = noTienePrevia;
    }

    //toString
    public String toString (){
        String retorno = "";
        retorno += "Nombre de la persona: " + this.getNombre();
        retorno += ". CI de la persona: " + this.getCi();
        retorno += ". Edad de la persona: " + this.getEdad();
        retorno += ". Grupo del alumno: " + this.getGrupo();

        if(tienePrevia == false){
            retorno += ". No tiene previa.";
        }else{
            retorno += ". Tiene previa.";
        }
        return retorno;
    }


}
