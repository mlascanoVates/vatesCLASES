public class CodigoPostal {

    String provincia, localidad;
    int codigo;

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public CodigoPostal(String provincia, int codigo, String localidad) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "CodigoPostal: " +
                "provincia:" + provincia +
                ", localidad:" + localidad +
                ", codigo:" + codigo ;
    }
}
