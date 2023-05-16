import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.println(obrero);
                    break;
                case 2:
                    boolean presentismo= sc.nextBoolean();
                    Administrativo administrativo=new Administrativo(legajo, nombre, sueldo, presentismo);
                    lista1.addEmpleado(administrativo);
                    System.out.println(administrativo);
                    break;
                case 3:
                    double ventas= sc.nextDouble();
                    Vendedor vendedor= new Vendedor(legajo, nombre, sueldo,ventas);
                    lista1.addEmpleado(vendedor);
                    System.out.println(vendedor);
                    break;
                default:
                    System.out.println("No pertenece a la clase");
            }

        }





/*
        Obrero obrero= new Obrero(455,"Ana", 4000,17);
        Administrativo administrativo=new Administrativo(65764,"Romina", 7000,true);
        Administrativo administrativo2=new Administrativo(66775,"Romina", 700000,true);
        Administrativo administrativo3=new Administrativo(44566,"Romina", 1000000,true);
        Vendedor vendedor= new Vendedor(8976,"Oscar", 6000,10000);
        Vendedor vendedor2= new Vendedor(8866,"Damian", 5400,45000);

        System.out.println("Sueldo Obrero: $" + obrero.getSueldo());
        System.out.println("SueldoAdministrativo: $" + administrativo.getSueldo());
        System.out.println("Sueldo Vendedor: $" + vendedor.getSueldo());
        System.out.println();

        ArrayList<Empleado> empleados= new ArrayList<>();
        empleados.add(obrero);
        empleados.add(administrativo);
        empleados.add(vendedor);


        System.out.printf("%15s %15s \n", "Nombre", "Sueldo");
        for (Empleado e: empleados){
            System.out.printf("%15s %15.2f \n", e.getNombre(), e.getSueldoDelMes());
        }

        double sumar=0;
        for (Empleado e: empleados){
            if(e instanceof Empleado){
                sumar+=e.getSueldoDelMes();
            }
        }

        System.out.printf("Total de los sueldos a pagar es $%12.2f \n", sumar);

        int sumar2=0;
        for (Empleado e: empleados){
            if(e instanceof Administrativo){
               sumar2++;
            }
        }

        System.out.println("Cantidad de empleados que deben cobra presentismo: " + sumar2);

        ListaEmpleados lista= new ListaEmpleados();
        lista.addEmpleado(obrero);
        lista.addEmpleado(administrativo);
        lista.addEmpleado(administrativo2);
        lista.addEmpleado(administrativo3);
        lista.addEmpleado(vendedor);
        lista.addEmpleado(vendedor2);

       for (int i=0; i<3; i++){
            System.out.println("Cantidad por tipo de empleado: " + lista.cantidadEmpleado[i].intValue());
        }

        System.out.println("Cantidad de Administrativos con presentismo: " + lista.getAdmConPresentismo());

        System.out.println("Cantidad de empleados que cobra más de 200000 es: " + lista.cobra200000());

*/

        //ARCHIVO DE EMPLEADOS

        //TOTAL GENERAL
        System.out.println("Cantidad de empleados: " + lista1.getListaEmpleados().size());
        System.out.println("Total a pagar: " + lista1.totalAPagar());


        //TOTAL DE SUELDOS A PAGAR POR CADA TIPO DE EMPLEADO
        lista1.totalSueldoXtipo();


    }

}
