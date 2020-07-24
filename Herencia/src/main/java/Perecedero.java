public class Perecedero extends Producto {
    //atributos
    private int diasACaducar;

    //constructores
    public Perecedero(String unNombre, float unPrecio, int unDiasACaducar) {
        super(unNombre, unPrecio);
        this.diasACaducar = unDiasACaducar;
    }

    //setter y getter para cada atributo
    public int getDiasACaducar() {
        return this.diasACaducar;
    }

    public void setDiasACaducar(int unDiasACaducar) {
        this.diasACaducar = unDiasACaducar;
    }

    //toString
    public String toString() {
        String retorno = "";
        retorno += "Nombre del producto" + this.getNombre();
        retorno += ". Precio del producto" + this.getPrecio();
        retorno += ". Dias a caducar del producto" + this.getDiasACaducar();

        return retorno;
    }


    public float calcular(int cant) {
        float result=0;
        if (this.diasACaducar == 1) {
            result = (this.getPrecio() / 4) * cant;
        } else if (this.diasACaducar == 2) {
            result = (this.getPrecio() / 3) * cant;
        } else if (this.diasACaducar == 3) {
            result = (this.getPrecio() / 2) * cant;
        }
            return result;
        }

    }

