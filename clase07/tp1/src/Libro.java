import java.util.ArrayList;

public class Libro {

        String titulo;
        int codigo;
        double precioDeReposicion;
        Integer[] estado= {1,2,3};
        ArrayList<Prestamo> prestamosDelLibro;

    public Libro(String titulo, int codigo, double precioDeReposicion) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.precioDeReposicion = precioDeReposicion;
        prestamosDelLibro= new ArrayList<>();
    }




}
