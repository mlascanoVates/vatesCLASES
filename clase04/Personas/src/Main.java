import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        ConjuntoPersonas conjunto=new ConjuntoPersonas();
        Scanner sc= new Scanner(new File("personas2.txt"));
        sc.useDelimiter("[\\n\\r;]+");

     // conjunto.crearConjunto(sc);

        while(sc.hasNext()){

            int documento= sc.nextInt();
            String nombre= sc.next();
            String apellido= sc.next();
            int edad= sc.nextInt();

            Persona Persona= new Persona(documento, nombre, apellido, edad);
            conjunto.agregarPersona(Persona);
        }

        System.out.println("Persona mayor: " + conjunto.calcularMayor());
        System.out.println("Persona menor: " +conjunto.calcularMenor());

        //Cantidad de personas con edad mayor al promedio
        System.out.println("Cantidad de personas con edad mayor al promedio: " + conjunto.cantidadMayorPromedio());

        //Promedio de las edades
        System.out.println("Promedio de edades: " +conjunto.promedioEdades());

        //Todos los datos de las personas cuyo apellido coincida con uno ingresado por teclado
        System.out.println("Ingrese un apellido, se buscará la lista de personas que tengan el mismo");
        Scanner sc1= new Scanner(System.in);
        String datoIngresado= sc1.nextLine();
        ConjuntoPersonas conjunto1 = new ConjuntoPersonas(conjunto.listaPorApellido(datoIngresado));


        for(int i=0; i<conjunto1.tamanioConjunto(); i++){
            System.out.println(conjunto1.getPersona(i));
        }



    }
}