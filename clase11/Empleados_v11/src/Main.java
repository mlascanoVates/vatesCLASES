import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc= new Scanner(new File("empleados.csv"));
        sc.useDelimiter("[\\n\\r;]+");
        ListaEmpleados lista1= new ListaEmpleados();

        while(sc.hasNext()){
            int tipoEmpleado= sc.nextInt();
            int legajo= sc.nextInt();
            String nombre= sc.next();
            double sueldo= sc.nextDouble();

            switch (tipoEmpleado)
            {
                case 1:
                    int diasTrabajados= sc.nextInt();
                    Obrero obrero= new Obrero(legajo, nombre, sueldo, diasTrabajados);
                    lista1.addEmpleado(obrero);
                    break;
                case 2:
                    boolean presentismo= sc.nextBoolean();
                    Administrativo administrativo=new Administrativo(legajo, nombre, sueldo, presentismo);
                    lista1.addEmpleado(administrativo);
                    break;
                case 3:
                    double ventas= sc.nextDouble();
                    Vendedor vendedor= new Vendedor(legajo, nombre, sueldo,ventas);
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
                "4. PROMEDIO DE SUELDO"+"\n"+
                "5. PROMEDIO DE SUELDO DE LOS OBREROS -revisar"+"\n"+
                "6. BUSQUEDA POR LEGAJO"+"\n"+
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
                case 4: System.out.println("Promedio: "+ lista1.promedioDeSueldos());
                        break;
                case 6: System.out.println("Ingrese legajo: ");
                        Scanner sc2 = new Scanner(System.in);
                        int busqueda = sc2.nextInt();
                        System.out.println("Búsqueda por legajo: "+ lista1.getBusquedaXlegajo(busqueda));
                        break;
                default: System.out.println("Selección incorrecta");
            }
            eleccion = sc1.nextInt();
        }


        int i=1;

        System.out.println("Comparar Empleados, elegir criterio:" +"\n"+
                "1. Comparar por sueldo "+ "\n"+
                "2. Comparar por sueldo descendente "+ "\n"+
                "3. Comparar por nombre "+ "\n"+
                "0. Salir");

        Map<Integer, Comparator<Empleado>> comparacion= new HashMap<>();
        comparacion.put(1,(o1, o2) -> ((int)(o1.getSueldoDelMes()- o2.getSueldoDelMes())));
        comparacion.put(2,(o3, o4) -> (-(int)(o3.getSueldoDelMes()- o4.getSueldoDelMes())));
        comparacion.put(3,(o5, o6) -> (o5.getNombre().compareTo(o6.getNombre())));

        Scanner sc2 = new Scanner(System.in);
        eleccion = sc2.nextInt();
        lista1.getListaEmpleados().sort(comparacion.get(eleccion));
        lista1.getListaEmpleados().forEach((n)-> System.out.println(n));
/*
        while(eleccion!=0) {
            switch (eleccion) {
                case 1:  lista1.getListaEmpleados().sort((o1, o2) -> ((int)(o1.getSueldoDelMes()- o2.getSueldoDelMes())));
                    lista1.getListaEmpleados().forEach((n)-> System.out.println(n));
                break;
                case 2:   lista1.getListaEmpleados().sort((o3, o4) -> (o3.getNombre().compareTo(o4.getNombre())));
                    lista1.getListaEmpleados().forEach((n)-> System.out.println(n));
                    break;
                default: System.out.println("Selección incorrecta");
            }
            eleccion = sc1.nextInt();
        }

*/


    }

}
