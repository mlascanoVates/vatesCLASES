import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Municipalidad municipio= new Municipalidad();


        List<String > lectorPlanes= new ArrayList<>();
        lectorPlanes= Files.readAllLines(Paths.get("PlanesDePago.txt")); //devuelve lista
        //Files.lines devuelve String
        lectorPlanes.stream().forEach(x->municipio.obtenerPlan(x));


        //OPCION DECLARATIVA
     //   municipio.getPlanesDePago().stream().forEach(System.out::println);

        lectorPlanes= Files.readAllLines(Paths.get("Pagos.txt"));
        lectorPlanes.stream().forEach(x->municipio.obtenerPagos(x));
       // municipio.getPagosContribuyentes().stream().forEach(System.out::println);


        System.out.println("CONSULTO POR UN SOLO PLAN");
        System.out.println(municipio.getPlan("A0020"));

        System.out.println("CONSULTO POR UN SOLO PAGO");
   //     System.out.println(municipio.getPago(0200));


        municipio.getPlanesDePago().stream().forEach(System.out::println);

        //USAR REDUCE


        //1 - Cantidad de planes pagados en su totalidad
        //Falta en vez de devolver el plan devolver cantidad de PLANES PAGOS
        //Solo numerar el plan
        System.out.println("PLANES PAGOS TOTALES");
    //    municipio.getPlanesDePago().stream().filter(Plan::estaPago).reduce();
        List<Plan> p = municipio.getPlanesDePago().stream().filter(Plan::estaPago).collect(Collectors.toList());
        System.out.println("Cantidad de planes: " + p.size());

        municipio.getPlanesDePago().stream().filter(Plan::estaPago).map(x->x.getIdPlan()).forEach(System.out::println);
        //mapDouble?
        //convertir un valor double en Double

        //2 - Sumatoria de las deudas registradas (El total de deuda del Plan se entiende, CONSULTAR)
        //Reduce

        Double suma = municipio.getPlanesDePago().stream().mapToDouble(x->x.getTotalDeuda()).reduce(0, (a, b) -> a + b);
        System.out.println("SUMATORIA DE DEUDA: "+ suma);

        //3-Listado de todos los pagos efectuados por un contribuyente en particular
        System.out.println("Ingresar Contribuyente por nombre");
        Scanner input= new Scanner(System.in);
        String nombre= input.nextLine().toUpperCase();
        municipio.getPlanesDePago().stream().filter(x->x.getNombreContribuyente().equals(nombre)).forEach(System.out::println);

    }
}