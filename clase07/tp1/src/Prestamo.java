public class Prestamo {

<<<<<<< HEAD
    private String nombreSolicitante;
    private int diasPrestamo;
    private boolean devuelto;

    public Prestamo(String nombreSolicitante, int diasPrestamo, boolean devuelto) {
        this.nombreSolicitante = nombreSolicitante;
        this.diasPrestamo = diasPrestamo;
        this.devuelto = devuelto; //ESTADO DEL PRÉSTAMO
=======
    String nombreSolicitante;
    int diasPrestamo;
    boolean devuelto;

    public Prestamo(String nombreSolicitante, int diasPrestamo) {
        this.nombreSolicitante = nombreSolicitante;
        this.diasPrestamo = diasPrestamo;
        this.devuelto = false;
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
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

<<<<<<< HEAD

    @Override
    public String toString() {
        return "Préstamo: " +
                "Solicitante: " + String.format("%-25s",nombreSolicitante) +
                ", dias: " +  String.format("%3d",diasPrestamo) +
                ", devuelto= " + devuelto + "\n";
    }
=======
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
}
