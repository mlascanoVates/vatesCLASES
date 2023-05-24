import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    private ArrayList<Libro> conjuntoLibros;
    private ArrayList<Prestamo> listadoPrestamos;
    private final String[] estado= {"DISPONIBLE", "PRESTADO", "EXTRAVIADO"};


    public Biblioteca() {
        this.conjuntoLibros = new ArrayList<>();
        this.listadoPrestamos = new ArrayList<>();
    }

    public ArrayList<Libro> getGrupoLibros() {
        return conjuntoLibros;
    }

    public void setGrupoLibros(ArrayList<Libro> grupoLibros) {
        this.conjuntoLibros = grupoLibros;
    }

    public ArrayList<Prestamo> getGrupoPrestamos() {
        return listadoPrestamos;
    }

    public void setGrupoPrestamos(ArrayList<Prestamo> grupoPrestamos) {
        this.listadoPrestamos = grupoPrestamos;
    }

    public void addLibro(Libro l){
        conjuntoLibros.add(l);
    }
    public void addPrestamo(Libro l,Prestamo p){
        listadoPrestamos.add(p);
        l.addPrestamo(p);
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
        if(conjuntoLibros.size()>0) promedio= (double) listadoPrestamos.size()/conjuntoLibros.size();
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
        return "Biblioteca: " +"\n"+
                "LIBROS: \n" + conjuntoLibros +"\n"+
                ", PRESTAMOS: \n" + listadoPrestamos;
    }
}
