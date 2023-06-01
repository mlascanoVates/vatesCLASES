import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("empleados.csv"));
        sc.useDelimiter("[\\n\\r;]+");
        ListaEmpleados lista1 = new ListaEmpleados();

        while (sc.hasNext()) {
            int tipoEmpleado = sc.nextInt();
            int legajo = sc.nextInt();
            String nombre = sc.next();
            double sueldo = sc.nextDouble();

            switch (tipoEmpleado) {
                case 1:
                    int diasTrabajados = sc.nextInt();
                    Obrero obrero = new Obrero(legajo, nombre, sueldo, diasTrabajados);
                    lista1.addEmpleado(obrero);
                    break;
                case 2:
                    boolean presentismo = sc.nextBoolean();
                    Administrativo administrativo = new Administrativo(legajo, nombre, sueldo, presentismo);
                    lista1.addEmpleado(administrativo);
                    break;
                case 3:
                    double ventas = sc.nextDouble();
                    Vendedor vendedor = new Vendedor(legajo, nombre, sueldo, ventas);
                    lista1.addEmpleado(vendedor);
                    break;
                default:
                    System.out.println("No pertenece a la clase");
            }

        }

        System.out.println("OPCIONES:" +"\n"+
                "1. TOTAL A PAGAR GENERAL"+ "\n"+
                "2. TOTAL DE SUELDOS A PAGAR POR CADA TIPO DE EMPLEADO"+ "\n"+
                "3. DATOS DEL EMPLEADO QUE COBRA MENOS"+"\n"+
                "4. PROMEDIO DE SUELDO DE LOS OBREROS"+"\n"+
                "5. Promedio de veces que fueron prestados los libros de la biblioteca"+"\n"+
                "0. Salir");

        Scanner sc1 = new Scanner(System.in);
        int eleccion = sc1.nextInt();


        while(eleccion!=0) {
          //  int muestro = eleccion;
            switch (eleccion) {
                case 1: System.out.println("Cantidad de empleados: " + lista1.getListaEmpleados().size());
                        System.out.println("Total a pagar: " + lista1.totalAPagar());
                        break;
                case 2:  lista1.totalSueldoXtipo();
                         break;
                case 3:  System.out.println("Cobra menos :" + lista1.cobraMenos());
                         break;
                case 4: break;
                default: System.out.println("Selección incorrecta");
            }
            eleccion = sc1.nextInt();
        }




   //   Primer intento al la lista la converti en arreglo
 //      for(int i=0; i<lista1.getListaEmpleados().size(); i++){




        // System.out.println("Arreglo por nombre" + lista1.comparar());
        //   ArrayList<Empleado> empleadosNuevos= lista1.getListaEmpleados();
/*
        Empleado[] listaOrdenada = new Empleado[lista1.getListaEmpleados().size()];

        //VER METODO Y COMO ESCRIBIRLO MEJOR
        for (int i = 0; i < lista1.getListaEmpleados().size(); i++) {
            for (Empleado e : lista1.getListaEmpleados()) {
                listaOrdenada[i] = e;
                i++;
            }
        }

        Arrays.sort(listaOrdenada);
        System.out.println("Se imprime lista ordenada");*/
    /*    for (Empleado e : listaOrdenada) {
            System.out.println(e);
        }*/


        //usando COLLECTIONS

        int i=1;
     /*   ArrayList<Empleado> empleadosNuevos= new ArrayList<>();
        empleadosNuevos=lista1.getListaEmpleados();
        Collections.sort(empleadosNuevos,lista1);
        for (Empleado e : empleadosNuevos) {
            System.out.println(i + ": "+ e);
            i++;
        }*/

/*
        Collections.sort(lista1.getListaEmpleados());
        for (Empleado e : lista1.getListaEmpleados()) {
            System.out.println(i + ": "+ e);
            i++;
        }*/
        i=1;
        Collections.sort(lista1.getListaEmpleados(), new ComparadorSueldos());
        for (Empleado e : lista1.getListaEmpleados()) {
            System.out.println(i + ": " + e);
            i++;
        }

    }
}

