import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Municipalidad municipio= new Municipalidad();

       // Pago pagoNuevo= new Pago();
   //     Plan planNuevo= new Plan();

        List<String > lectorPlanes= new ArrayList<>();
        lectorPlanes= Files.readAllLines(Paths.get("PlanesDePago.txt"));

        //SOLUCIONAR COMMO AGREGAR LAS LISTAS DE STRING
        lectorPlanes.stream().forEach(x->municipio.obtenerPlan(x));


        //OPCION DESCRIPTIVA
        for(Plan p: municipio.getPlanesDePago()){
            System.out.println(p);
        }

        System.out.println();

        //OPCION DECLARATIVA
        municipio.getPlanesDePago().stream().forEach(System.out::println);

    }
}