

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListaEmpleados implements Comparator<Empleado> {



    protected ArrayList<Empleado> listaEmpleados;
    protected double sueldoMenor;
    int sueldoTotalObrero, sueldoTotalAdm, sueldoTotalVendedor;

    private int admConPresentismo;

    public int getAdmConPresentismo() {
        return admConPresentismo;
    }

    public void setAdmConPresentismo(int admConPresentismo) {
        this.admConPresentismo = admConPresentismo;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }


    protected Integer[] cantidadEmpleado= {0,0,0}; //Obrero, Administrativo, Vendedor
    protected int administrativo, obrero, vendedor;

    public ListaEmpleados() {
        listaEmpleados=new ArrayList<>();
        admConPresentismo=0;
        sueldoMenor=0;
    }

    public void addEmpleado(Empleado e){
        listaEmpleados.add(e);
            if(e instanceof Obrero){
                cantidadEmpleado[0]++;
             //   sumarSueldoObrero(e.getSueldoDelMes());
            }
            else if(e instanceof Administrativo){
                cantidadEmpleado[1]++;
                sumarAdmPresentismo(e);
             //   sumarSueldoAdm(e.getSueldoDelMes());
            }
            else if(e instanceof Vendedor){
                cantidadEmpleado[2]++;
              //  sumarSueldoVendedor(e.getSueldoDelMes());
            }
        }






    public double sumarSueldoObrero(double sueldo){
        return sueldoTotalObrero+=sueldo;
    }
    public double sumarSueldoAdm(double sueldo){
        return sueldoTotalAdm+=sueldo;
    }
    public double sumarSueldoVendedor(double sueldo){
        return sueldoTotalVendedor+=sueldo;
    }

    //imprime Sueldo por tipo de Empleado
    public void totalSueldoXtipo(){

     for (Empleado e: listaEmpleados)
        if(e instanceof Empleado){
            if(e instanceof Obrero){
                sumarSueldoObrero(e.getSueldoDelMes());
            }
            else if(e instanceof Administrativo){
                sumarSueldoAdm(e.getSueldoDelMes());
            }
            else if(e instanceof Vendedor){
                sumarSueldoVendedor(e.getSueldoDelMes());
            }
        }
        System.out.println("Total sueldo Obrero: " + sueldoTotalObrero);
        System.out.println("Total sueldo Administrativo: " + sueldoTotalAdm);
        System.out.println("Total sueldo Vendedor: " + sueldoTotalVendedor);

    }



    public void sumarAdmPresentismo(Empleado e){
        if(((Administrativo) e).isPresentismo()){
           admConPresentismo++;
        }
    }

    public double totalAPagar(){
        double sumar=0;

        for(Empleado e: listaEmpleados){
                sumar+=e.getSueldoDelMes();

        }
        return sumar;
    }


    public int cobra200000(){
        int cant=0;
        for(Empleado e:listaEmpleados){
            if(e.getSueldoDelMes()>=200000){
                cant++;
            }
        }
        return cant;
    }

    /*

    public Integer[] sumarXtipoEmpleados(ArrayList<Empleado> empleados){
        Integer[] i= new Integer[3];
        for (Empleado e: empleados){
            switch (e.getNombre())
            {
                case "Obrero":
                    obrero++;
                    cantidadEmpleado[0]+=1;
                    System.out.println( "Entro a swith"+ cantidadEmpleado[0].byteValue());
                case "Administrativo":
                    administrativo++;
                    cantidadEmpleado[1]+=1;
                case "Vendedor":
                    vendedor++;
                    cantidadEmpleado[2]+=1;
            }
        }
        return i;
    }
*/

    public Empleado cobraMenos(){
        Empleado emp=null;
        //ver que no sale
        for(Empleado e: listaEmpleados){
            if(e.getSueldoDelMes()<sueldoMenor){
                sueldoMenor= e.getSueldoDelMes();
                if(e instanceof Empleado){
                    emp =e;
                }
            }
        }
        return emp;
    }



    public int compare(Empleado e1, Empleado e2)
    {
        return e1.getNombre().compareTo(e2.getNombre());
    }


/*
    public ArrayList<Empleado> getArregloXnombre(){
        Empleado emp=null;
        ArrayList<Empleado> arregloNombre=null;
        int valor=0;
        for(Empleado e: listaEmpleados){
            if(emp==null){
                emp=e;
            }
            valor= e.getNombre().compareTo(emp.getNombre());
            if(valor<0){
                System.out.println(valor);
                emp=e;
                if(!arregloNombre.contains(emp)||arregloNombre==null)
                arregloNombre.add(emp);
            }
        }
        return arregloNombre;
    }


    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.compareTo(o2);
    }*/
/*
    public void comparar(){

        for(Empleado e: listaEmpleados){
            System.out.println(e);

        }
    }
*/

}
