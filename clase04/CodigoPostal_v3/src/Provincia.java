import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private int cantidadCodigos;

    private ArrayList<CodigoPostal> codigosDeProvincia;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.cantidadCodigos=0;
        codigosDeProvincia=new ArrayList<>();
    }

    public int getCantidadCodigos() {
        return cantidadCodigos;
    }

    public void sumarUnCodigo(){
        cantidadCodigos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<CodigoPostal> getCodigosDeProvincia() {
        return codigosDeProvincia;
    }

    public void agregarCodigoPostal(CodigoPostal cp) {
        this.codigosDeProvincia.add(cp);
    }
    public void setCodigosDeProvincia(ArrayList<CodigoPostal> codigosDeProvincia) {
        this.codigosDeProvincia = codigosDeProvincia;
    }


    @Override
    public String toString() {
        return  "\n" +
                "nombre='" + nombre +
                ", cantidadCodigos=" + cantidadCodigos +
                ", codigosDeProvincia=" + codigosDeProvincia +
                ", localidades='" + localidades ;
    }
}
