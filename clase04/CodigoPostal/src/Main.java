import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc= new Scanner(new File("CP.txt"));
        ArrayList<CodigoPostal> codigoPostal = new ArrayList<>();
        System.out.print("Ingrese el nombre de una localidad: ");
        Scanner teclado= new Scanner(System.in);
        String localidadIngresada= teclado.nextLine().toUpperCase();
        sc.useDelimiter("[\\n\\r;]+");

        //LISTA POR CADA PROVINCIA
        ArrayList<CodigoPostal> provCatamarca= new ArrayList<>();
        ArrayList<CodigoPostal> provCordoba= new ArrayList<>();
        ArrayList<CodigoPostal> provChaco= new ArrayList<>();
        int cantCatamarca=0, cantCordoba=0, cantChaco=0;

        //Solo construyo los objetos necesarios
        while(sc.hasNext()){


            String provincia= sc.next();
            int codigo= sc.nextInt();
            String localidad= sc.next();
            CodigoPostal cp= new CodigoPostal(provincia, codigo, localidad);

            if(localidad.contains(localidadIngresada)){
                codigoPostal.add(cp);
            }

            switch (provincia){
                case "K":provCatamarca.add(cp);
                    cantCatamarca++;
                    break;
                case "H": provChaco.add(cp);
                    cantChaco++;
                    break;
                case "X": provCordoba.add(cp);
                    cantCordoba++;
                    break;
                default:
                    System.out.println("no es correcta la provincia indicada");

            }
        }

       for (int i=0; i<codigoPostal.size(); i++){
            System.out.println(codigoPostal.get(i));
        }

            //Crear clase provincia
            //Almacenar nombre de provincia
            //codigo de provincia
            //localidades que contiene la provincia


            System.out.println("Cantidad de códigos de la provincia de Cordoba" +cantCordoba );
            System.out.println("Cantidad de códigos de la provincia de Catamarca" +cantCatamarca );
            System.out.println("Cantidad de códigos de la provincia de Chaco" +cantChaco );



    }
}