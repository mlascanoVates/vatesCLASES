import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Obrero obrero= new Obrero("Ana", 4000,17);
        Administrativo administrativo=new Administrativo("Romina", 7000,true);
        Administrativo administrativo2=new Administrativo("Romina", 700000,true);
        Administrativo administrativo3=new Administrativo("Romina", 1000000,true);
        Vendedor vendedor= new Vendedor("Oscar", 6000,10000);
        Vendedor vendedor2= new Vendedor("Damian", 5400,45000);

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




    }

}
