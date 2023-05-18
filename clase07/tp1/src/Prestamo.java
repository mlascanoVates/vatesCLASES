public class Prestamo {

    String nombreSolicitante;
    int diasPrestamo;
    boolean devuelto;

    public Prestamo(String nombreSolicitante, int diasPrestamo) {
        this.nombreSolicitante = nombreSolicitante;
        this.diasPrestamo = diasPrestamo;
        this.devuelto = false;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

}
