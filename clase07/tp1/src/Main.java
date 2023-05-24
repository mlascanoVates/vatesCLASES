<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sLi= new Scanner(new File("listadoLibros.csv"));
        sLi.useDelimiter("[\\n\\r;]+");
        Biblioteca biblioteca1= new Biblioteca();

        while(sLi.hasNext()){
            int codigoLi= sLi.nextInt();
            String nombreLi= sLi.next();
            String autorLi= sLi.next();
            double precio= sLi.nextDouble();
            int estado=sLi.nextInt();

            Libro libroNuevo= new Libro(codigoLi,nombreLi,autorLi,precio,estado);
            biblioteca1.addLibro(libroNuevo);
        }

        Scanner sPre= new Scanner(new File("listadoPrestamo.csv"));
        sPre.useDelimiter("[\\n\\r;]+");

        while(sPre.hasNext()){
            int codigoLibro=sPre.nextInt();
            String nombreCliente= sPre.next();
            int dias= sPre.nextInt();
            boolean devuelto= sPre.nextBoolean(); //consigna
            Prestamo nuevoPrestamo= new Prestamo(nombreCliente,dias,devuelto);

            for(Libro l: biblioteca1.getGrupoLibros()){
                if(l.getCodigo()==codigoLibro)  biblioteca1.addPrestamo(l, nuevoPrestamo);
            }
        }

        System.out.println("OPCIONES:" +"\n"+
                "1. Cantidad de libros en cada estado (tres totales)"+ "\n"+
                "2. Sumatoria del precio de reposición de todos los libros extraviados"+"\n"+
                "3. Nombre de todos los solicitantes de un libro en particular identificado por su título"+"\n"+
                "4. Promedio de veces que fueron prestados los libros de la biblioteca"+"\n"+
                "0. Salir");

        Scanner sc = new Scanner(System.in);
        int eleccion = sc.nextInt();


        while(eleccion!=0) {
            String muestro = switch (eleccion) {
                case 1  -> {
                            int[] cantidad = biblioteca1.cantidadDeLibrosXestado();
                            String concat1 = "";
                            for (int i = 0; i < cantidad.length; i++) {
                                concat1 = concat1 + String.format("%-10s : %3d\n", biblioteca1.getEstadoNombre(i), cantidad[i]);
                            }
                            yield concat1;
                            }
                case 2  -> "Precio total libros extraviados: $" + String.format("%.2f", biblioteca1.sumatoriaPrecio(biblioteca1.listaExtraviados()));
                case 3  -> {
                            Scanner sc1 = new Scanner(System.in);
                            System.out.printf("Introduce nombre de libro: ");
                            String nombreLibro = sc1.nextLine();
                            Libro libro1 = biblioteca1.buscarLibroPorNombre(nombreLibro);
                            ArrayList<String> solicitantes = libro1.getListaSolicitantes();
                            if(solicitantes.isEmpty()) yield "El libro no tiene prestamos";
                            String concat2 = "";
                            for (int i = 0; i < solicitantes.size(); i++) {
                                concat2 = concat2 + solicitantes.get(i) +"\n" ;
                            }
                            yield concat2;
                            }
                case 4  -> "Promedio es: " + String.format("%.2f", biblioteca1.promedioPrestamosXlibros());
                default -> "Selección incorrecta";
                };
            System.out.println(muestro);
            eleccion = sc.nextInt();
        }
    }

=======
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
}