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
        //cantidad de empleado por cada tipo
        //Cantidad de vendedores que cobran presentismo
        //Empleados que cobren más de 200000
        //Búsqueda por legajo


        //ARCHIVO DE EMPLEADOS

        //TOTAL GENERAL
        System.out.println("Cantidad de empleados: " + lista1.getListaEmpleados().size());
        System.out.println("Total a pagar: " + lista1.totalAPagar());


        //TOTAL DE SUELDOS A PAGAR POR CADA TIPO DE EMPLEADO
        lista1.totalSueldoXtipo();

        //DATOS DEL EMPLEADO QUE COBRA MENOS
        System.out.println("Cobra menos :" + lista1.cobraMenos());

        //Promedio de sueldo de los obreros


        //Busqueda por legajo
        System.out.println("Búsqueda por legajo: "+ lista1.getBusquedaXlegajo(5567));

        //Promedio
        //55674 saldo sin descuentos o con presentismos
        System.out.println("Promedio: "+ lista1.promedioDeSueldos());*/
        

    }

}
