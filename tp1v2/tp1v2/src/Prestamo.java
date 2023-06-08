public class Prestamo {

    private String nombreSolicitante;
    private int diasPrestamo;
    private boolean devuelto;

    public Prestamo(String nombreSolicitante, int diasPrestamo, boolean devuelto) {
        this.nombreSolicitante = nombreSolicitante;
        this.diasPrestamo = diasPrestamo;
        this.devuelto = devuelto; //ESTADO DEL PRÉSTAMO
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


    @Override
    public String toString() {
        return "Prestamo: " +
                "Solicitante: " + String.format("%-25s",nombreSolicitante) +
                ", dias: " +  String.format("%3d",diasPrestamo) +
                ", devuelto= " + devuelto+"\n";
    }
}
