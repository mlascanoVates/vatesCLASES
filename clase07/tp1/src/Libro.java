import java.util.ArrayList;

public class Libro {

    private String titulo,autor;
    private int codigo;
    private int estado; //Disponible, Prestado, Extraviado
    private double precioDeReposicion;
    private ArrayList<Prestamo> prestamosDelLibro;


    public Libro(int codigo, String titulo, String autor, double precioDeReposicion, int estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor=autor;
        this.estado= estado;
        this.precioDeReposicion = precioDeReposicion;
        prestamosDelLibro= new ArrayList<>();
    }

    public int getEstado()
    {
        return estado;
    }

    public void addPrestamo(Prestamo p){
        prestamosDelLibro.add(p);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioDeReposicion() {
        return precioDeReposicion;
    }

    public void setPrecioDeReposicion(double precioDeReposicion) {
        this.precioDeReposicion = precioDeReposicion;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList<Prestamo> getPrestamosDelLibro() {
        return prestamosDelLibro;
    }

    public void setPrestamosDelLibro(ArrayList<Prestamo> prestamosDelLibro) {
        this.prestamosDelLibro = prestamosDelLibro;
    }


    //Devuelve nombre de todos los solicitantes del libro
    public ArrayList getListaSolicitantes(){
        ArrayList<String> listaSolicitantes= new ArrayList<>();
        for (Prestamo p: prestamosDelLibro){
            listaSolicitantes.add(p.getNombreSolicitante());
        }
      return listaSolicitantes;
    }


    @Override
    public String toString() {
        return "Libro: " +
                "titulo= " +  String.format("%-35s",titulo) +
                ", autor= " + String.format("%-25s",autor) +
                ", codigo= " +  String.format("%05d",codigo) +
                ", precioDeReposicion= $" + String.format("%8.2f",precioDeReposicion) +
                ", estado= " +  getEstado() +"\n";
    }
}
