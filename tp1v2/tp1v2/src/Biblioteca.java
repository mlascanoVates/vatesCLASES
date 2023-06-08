import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Biblioteca {
    private ArrayList<Libro> conjuntoLibros;
    private final String[] estado= {"DISPONIBLE", "PRESTADO", "EXTRAVIADO"};


    public Biblioteca() {
        this.conjuntoLibros = new ArrayList<>();
    }

    public ArrayList<Libro> getGrupoLibros() {
        return conjuntoLibros;
    }

    public void setGrupoLibros(ArrayList<Libro> grupoLibros) {
        this.conjuntoLibros = grupoLibros;
    }


    public void addLibro(Libro l){
        conjuntoLibros.add(l);
    }

    public void addLibroConDatos(String dato){
        //ist<String> datos= dato.split(";");
        Stream.of(dato.split(";")).collect(Collectors.toList());
        //Libro libroNuevo= new Libro(codigo, titulo, autor, precioDeReposicion, estado);
    //    conjuntoLibros.add(libroNuevo);
    }



    public String getEstadoNombre(int i){
        return estado[i];
    }

    public int[] cantidadDeLibrosXestado(){
        int [] sumaPrestamosXestado= new int [3];
        for (Libro e: conjuntoLibros){
            sumaPrestamosXestado[e.getEstado()-1]++;
        }
        return sumaPrestamosXestado;
    }

    public ArrayList<Libro> listaExtraviados(){
        ArrayList<Libro> extraviado=new ArrayList<>();
        for (Libro l: conjuntoLibros){
            if(l.getEstado()==3)    extraviado.add(l);
        }
        return extraviado;
    }

    public double sumatoriaPrecio(ArrayList<Libro> listaLibros){
        double sumatoria=0;
        for (Libro l: listaLibros){
            sumatoria+=l.getPrecioDeReposicion();
        }
        return sumatoria;
    }

    public double promedioPrestamosXlibros(){
        double promedio=0;
        int cantidadPrestamos=0;
        for(Libro l: conjuntoLibros){
            cantidadPrestamos+=l.getPrestamosDelLibro().size();
        }
        if(conjuntoLibros.size()>0) promedio= (double) cantidadPrestamos/conjuntoLibros.size();
        return promedio;
    }

    public Libro buscarLibroPorNombre(String nombre){
        for (Libro l: getGrupoLibros()){
            if(l.getTitulo().equals(nombre)){
                return l;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String imprimirL="";
        for (Libro l: getGrupoLibros()){
            imprimirL +=l.toString();
        }
        return "Biblioteca: " +"\n"+
                "LIBROS: \n" + imprimirL;
    }
}
