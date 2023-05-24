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
<<<<<<< HEAD
/*
        //cantidad de empleado por cada tipo
        //Cantidad de vendedores que cobran presentismo
        //Empleados que cobren más de 200000
        //Búsqueda por legajo


=======





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

*//*

>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
        //ARCHIVO DE EMPLEADOS

        //TOTAL GENERAL
        System.out.println("Cantidad de empleados: " + lista1.getListaEmpleados().size());
        System.out.println("Total a pagar: " + lista1.totalAPagar());


        //TOTAL DE SUELDOS A PAGAR POR CADA TIPO DE EMPLEADO
        lista1.totalSueldoXtipo();
<<<<<<< HEAD

        //DATOS DEL EMPLEADO QUE COBRA MENOS
        //System.out.println("Cobra menos :" + lista1.cobraMenos());

        //Promedio de sueldo de los obreros

/*

   //   Primer intento al la lista la converti en arreglo
    /*    for(int i=0; i<lista1.getListaEmpleados().size(); i++){
=======
        //cobra menos
        System.out.println(lista1.cobraMenos());

*/
       // System.out.println("Arreglo por nombre" + lista1.comparar());
    //   ArrayList<Empleado> empleadosNuevos= lista1.getListaEmpleados();

        Empleado[] listaOrdenada= new Empleado[lista1.getListaEmpleados().size()]   ;

        //VER METODO Y COMO ESCRIBIRLO MEJOR
        for(int i=0; i<lista1.getListaEmpleados().size(); i++){
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e

            for(Empleado e: lista1.getListaEmpleados()) {
                listaOrdenada[i] = e;
                i++;
            }
        }
<<<<<<< HEAD

=======
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
        Arrays.sort(listaOrdenada);
        System.out.println("Se imprime lista ordenada");
        for (Empleado e: listaOrdenada){
            System.out.println(e);
<<<<<<< HEAD
        }*/

        /*
        //usando COLLECTIONS
        int i=1;
        ArrayList<Empleado> empleadosNuevos= new ArrayList<>();
        empleadosNuevos=lista1.getListaEmpleados();
        Collections.sort(empleadosNuevos,lista1);
        for (Empleado e : empleadosNuevos) {
            System.out.println(i + ": "+ e);
            i++;
        }*/
/*
        int i=1;

        Collections.sort(lista1.getListaEmpleados());
        for (Empleado e : lista1.getListaEmpleados()) {
            System.out.println(i + ": "+ e);
            i++;
        }*/
        int i=1;
        Collections.sort(lista1.getListaEmpleados(),new ComparadorSueldos());
        for (Empleado e : lista1.getListaEmpleados()) {
            System.out.println(i + ": "+ e);
            i++;
        }
=======
        }


>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
    }
}
