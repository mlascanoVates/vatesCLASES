import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Obrero obrero= new Obrero("Ana", 4000,17);
        Administrativo administrativo=new Administrativo("Romina", 7000,true);
        Vendedor vendedor= new Vendedor("Oscar", 6000,10000);

        System.out.println("Sueldo Obrero: $" + obrero.getSueldo());
        System.out.println("SueldoAdministrativo: $" + administrativo.getSueldo());
        System.out.println("Sueldo Vendedor: $" + vendedor.getSueldo());


        System.out.println("Total a pagar Obrero: $" + obrero.getSueldoDelMes());
        System.out.println("Total a pagar Administrativo: $" + administrativo.getSueldoDelMes());
        System.out.println("Total a pagar Vendedor: $" + vendedor.getSueldoDelMes());
        ArrayList<Empleado> empleados= new ArrayList<>();
        empleados.add(obrero);
        empleados.add(administrativo);
        empleados.add(vendedor);

                


    }
}