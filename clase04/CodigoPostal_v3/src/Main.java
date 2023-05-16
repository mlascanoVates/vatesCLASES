import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc= new Scanner(new File("CP.txt"));
        sc.useDelimiter("[\\n\\r;]+");

        //LISTA POR CADA PROVINCIA
        Provincia cba=new Provincia("X");
        Provincia cata=new Provincia("K");
        Provincia cha=new Provincia("H");
        CorreoNacional correoNacional= new CorreoNacional();

        correoNacional.agregarProvincia(cba);
        correoNacional.agregarProvincia(cata);
        correoNacional.agregarProvincia(cha);



        //Solo construyo los objetos necesarios
        while(sc.hasNext()){
            String provincia= sc.next();
            int codigo= sc.nextInt();
            String localidad= sc.next();
            CodigoPostal cp= new CodigoPostal(provincia, codigo, localidad);

            Provincia p= correoNacional.buscarProvincia(cp.getProvincia());
            p.agregarCodigoPostal(cp);
            p.sumarUnCodigo();
        }


        //CÓDIGOS POR CADA PROVINCIA
        System.out.println("Cantidad de códigos de la provincia de Cordoba "+ cba.getNombre() +" es: " + cba.getCantidadCodigos() );
        System.out.println("Cantidad de códigos de la provincia de Catamarca "+ cata.getNombre() +" es: " + cata.getCantidadCodigos() );
        System.out.println("Cantidad de códigos de la provincia de Chaco "+ cha.getNombre() +" es: " + cha.getCantidadCodigos() );



        System.out.println("BUSQUEDA: Localidades ingresando parte del nombre y la letra de la provincia");
        System.out.print("Escriba provincia K,H o X: ");
        Scanner teclado2= new Scanner(System.in);
        String provinciaIngresada= teclado2.nextLine().toUpperCase();
        System.out.print("Escriba localidad o parte: ");
        Scanner teclado3= new Scanner(System.in);
        String parteLocalidad= teclado3.nextLine().toUpperCase();

        //MÉTODO BUSQUEDA LOCALIDAD + PROVINCIA
        ArrayList<CodigoPostal> localidadProvincia=correoNacional.getLocalidadYProvincia(parteLocalidad,provinciaIngresada);
        System.out.println(localidadProvincia);


        System.out.println("BUSQUEDA: Localidades ingresando numero del codigo y la letra de la provincia");
        System.out.print("Escriba provincia K,H o X: ");
        Scanner teclado4= new Scanner(System.in);
        String provinciaIngresada2= teclado4.nextLine().toUpperCase();
        System.out.print("Escriba codigo: ");
        Scanner teclado5= new Scanner(System.in);
        int codigoIngresado = teclado5.nextInt();
        System.out.println(codigoIngresado);

        //MÉTODO BUSQUEDA CODIGO + PROVINCIA
        ArrayList<CodigoPostal> codigoProvincia= correoNacional.getCodigoYProvincia(codigoIngresado,provinciaIngresada2);
        System.out.println(codigoProvincia);

        System.out.print("BUSQUEDA: por localidad en todas las provincias. Ingrese localidad o parte del nombre: ");
        Scanner teclado6= new Scanner(System.in);
        String parteLocalidad2= teclado6.nextLine().toUpperCase();


        //MÉTODO BUSQUEDA LOCALIDAD
        ArrayList<CodigoPostal> correoPorLocalidad= correoNacional.getCodigoPorLocalidad(parteLocalidad2);
        System.out.println(correoPorLocalidad);

        }

    }
