import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        ConjuntoPersonas conjunto=new ConjuntoPersonas();
        Scanner sc= new Scanner(new File("personas2.txt"));
        sc.useDelimiter("[\\n\\r;]+");

        // conjunto.crearConjunto de Personas
        conjunto= conjunto.crearConjunto(sc);
/*
        //CALCULAR MAYOR Y MENOR PERSONA
        System.out.println("Persona mayor: " + conjunto.calcularMayor());
        System.out.println("Persona menor: " + conjunto.calcularMenor());

        //Cantidad de personas con edad mayor al promedio
        System.out.println("Cantidad de personas con edad mayor al promedio: " + conjunto.cantidadMayorPromedio());

        //Promedio de las edades
        System.out.println("Promedio de edades: " +conjunto.promedioEdades());

        //Todos los datos de las personas cuyo apellido coincida con uno ingresado por teclado
        System.out.println("Ingrese un apellido, se devolverá una lista de personas que contengan el mismo: ");
        Scanner sc1= new Scanner(System.in);
        String datoIngresado= sc1.nextLine().toUpperCase();
        ArrayList<Persona> apellidosQueCoinciden=conjunto.listaPorApellido(datoIngresado);
        System.out.println(apellidosQueCoinciden);

*/

        /*

        Persona[] conjuntoNuevo= new Persona[conjunto.getListaPersonas().size()]   ;

        //VER METODO Y COMO ESCRIBIRLO MEJOR
        for(int i=0; i<conjunto.getListaPersonas().size(); i++){
            for(Persona e: conjunto.getListaPersonas()) {
                conjuntoNuevo[i] = e;
                i++;
            }
        }

       Arrays.sort(conjuntoNuevo);

        System.out.println("Se imprime lista ordenada");
        for (Persona e: conjuntoNuevo){
            System.out.println(e);
        }*/



        Collections.sort(conjunto.getListaPersonas(),new ConjuntoPersonas());
        int i=1;
        System.out.println("Se imprime lista ordenada por Apellido y Nombre");
        for (Persona p: conjunto.getListaPersonas()){
            System.out.println(i + ": "+ p);
            i++;
        }



        }



    }
}