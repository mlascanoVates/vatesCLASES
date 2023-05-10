import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //poner el tipo de dato es opcional
        //get se accede en el orden en que se carga
        //<> parámetro de clase, se restrinja el tipo de archivo que se guarde
        //ArrayList lista= new ArrayList();
        List<String> listaDeNombres = new ArrayList<>();

        listaDeNombres.add("Emilia");
        listaDeNombres.add("Florencia  ");
        listaDeNombres.add("Adriana");
        listaDeNombres.add("Laura");
        listaDeNombres.add("Julia");

        //recorre en el orden que se ingresó
        for (String i: listaDeNombres) {
            System.out.println(i);
        }
    }
}