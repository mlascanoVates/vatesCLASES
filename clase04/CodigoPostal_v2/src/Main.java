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
        Provincia nuevaProvinciaCordoba=new Provincia("X");
        Provincia cba=new Provincia("X");
        Provincia cata=new Provincia("K");
        Provincia cha=new Provincia("H");
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
                case "K"://provCatamarca.add(cp);
                    cantCatamarca++;
                    cata.agregarCodigoLocalidad(cp);
                    break;
                case "H": //provChaco.add(cp);
                    cantChaco++;
                    cha.agregarCodigoLocalidad(cp);
                    break;
                case "X": //provCordoba.add(cp);
                    cba.agregarCodigoLocalidad(cp);
                    cantCordoba++;
                    break;
                default:
                    System.out.println("no es correcta la provincia indicada");

            }
        }

       for (int i=0; i<codigoPostal.size(); i++){
            System.out.println(codigoPostal.get(i));
        }

        correoNacional total= new correoNacional();
        total.agregarProvincia(cba);
        total.agregarProvincia(cata);
        total.agregarProvincia(cha);

            //Crear clase provincia
            //Almacenar nombre de provincia
            //codigo de provincia?
            //localidades que contiene la provincia

            //CÓDIGOS POR CADA PROVINCIA
            System.out.println("Cantidad de códigos de la provincia de Cordoba" +cantCordoba );
            System.out.println("Cantidad de códigos de la provincia de Catamarca" +cantCatamarca );
            System.out.println("Cantidad de códigos de la provincia de Chaco" +cantChaco );


        //Localidades ingresando parte del nombre y la letra de la provincia
        //devuelve lista de localidades, con el codigo, y provincia
        //getlocalidadesNomyProv
        //getlocalidades(string parteNombre, string provincia);
        //getlocalidadporcodigo retornar CODIGOPOSTAL
        //getlocalidadporprovincia retornar CODIGOPOSTAL
        //getporlocalidadtodoslos datos retornar CODIGOPOSTAL



        System.out.print("Escriba provincia K,H o X: ");
        Scanner teclado2= new Scanner(System.in);
        String provinciaIngresada= teclado2.nextLine().toUpperCase();
        System.out.print("Escriba localidad o parte: ");
        Scanner teclado3= new Scanner(System.in);
        String parteLocalidad= teclado3.nextLine().toUpperCase();
        String catamarca="K";

        /*
        if(provinciaIngresada.equals(catamarca)){
            for(int i=0; i<provCatamarca.size(); i++){
                if(provCatamarca.get(i).getLocalidad().contains(parteLocalidad)){
                    System.out.println(provCatamarca.get(i));
                }
            }
        }
*/

        //EXITOSO
        System.out.println("INTENTO LOCALIDAD Y PROVINCIA");
        total.getLocalidadYProvincia(parteLocalidad,provinciaIngresada);




        //Localidades ingresando el número del código y la letra de la provincia
        System.out.print("Escriba provincia K,H o X: ");
        Scanner teclado4= new Scanner(System.in);
        String provinciaIngresada2= teclado4.nextLine().toUpperCase();
        System.out.print("Escriba codigo: ");
        Scanner teclado5= new Scanner(System.in);
        int codigoIngresado = teclado5.nextInt();
        System.out.println(codigoIngresado);
        String cordoba="X";

   /*   //YA NO HACE FALTA
        if(provinciaIngresada2.equals(cordoba)){
            //VER ERROR
            for(int i=0; i<provCordoba.size(); i++){
                if(provCordoba.get(i).getCodigo()==codigoIngresado){
                    System.out.println(provCordoba.get(i));
                }
            }
        }

        */
        //PROBADO, SALIO BIEN!!! resta mejorar el print toString , O NO HACE FALTA
        System.out.println("ALTERNATIVA CODIGO Y PROVINCIA");




        total.getCodigoYProvincia(codigoIngresado,provinciaIngresada2);



        //Localidades ingresando parte del nombre pero buscando en las tres provincias

        System.out.print("Búqueda en todas las provincias. Ingrese localidad o parte del nombre: ");
        Scanner teclado6= new Scanner(System.in);
        String parteLocalidad2= teclado6.nextLine().toUpperCase();

  /*
        //OPCION 1, SE PUEDE ELIMINAR, ALTERNATIVA QUEDA
        //AGRUPACION DE PROVINCIAS, REGISTRONACIONAL
        //TENGA UN ARREGLO DE LAS PROVINCIAS
        //UN FOR QUE RECORRA TODAS LAS PROVINCIAS
        //metodo agregar provincia
        //VER HERENCIA!
        //override metodo add?
        for(int i=0; i<provCatamarca.size(); i++){
            if(provCatamarca.get(i).getLocalidad().contains(parteLocalidad2)){
                System.out.println(provCatamarca.get(i));
            }
         }
        for(int i=0; i<provChaco.size(); i++){
            if(provChaco.get(i).getLocalidad().contains(parteLocalidad2)){
                System.out.println(provChaco.get(i));
            }

        }
        for(int i=0; i<provCordoba.size(); i++){
            if(provCordoba.get(i).getLocalidad().contains(parteLocalidad2)){
                System.out.println(provCordoba.get(i));
            }

        }
*/

        //PROBADO, SALIÓ BIEN!!!!
        System.out.println("ALTERNATIVA");

        total.obtenerCodigoPorLocalidad(parteLocalidad2);


        //BUSQUEDA POR CODIGO

        System.out.print("Escriba codigo: ");
        Scanner teclado7= new Scanner(System.in);
        int codigoIngresado2 = teclado7.nextInt();
        ArrayList<CodigoPostal> resultado=null;
        //Se prueba con prov cordoba


        //ESCRIBIR MEJOR EL TOSTRING
        //FALTA RECORRE CON TODAS LAS PROVINCIAS, SOLO SE HIZO CON CORDOBA
        resultado= nuevaProvinciaCordoba.busquedaPorCodigo(codigoIngresado2);
        System.out.println(resultado);
            //VER ERROR

        /*
            for(int i=0; i<provCordoba.size(); i++){
                if(provCordoba.get(i).getCodigo()==codigoIngresado2){
                    System.out.println(provCordoba.get(i));
                }
            }*/
        }

    }
