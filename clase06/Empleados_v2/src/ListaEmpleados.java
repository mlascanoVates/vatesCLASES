import java.util.ArrayList;

public class ListaEmpleados {

    protected ArrayList<Empleado> listaEmpleados;
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
/*
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }*/

    protected Integer[] cantidadEmpleado= {0,0,0}; //Obrero, Administrativo, Vendedor
    protected int administrativo, obrero, vendedor;

    public ListaEmpleados() {
        listaEmpleados=new ArrayList<>();
        admConPresentismo=0;
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
        //ver esta opcion
        // sumar+=e.getSueldoDelMes, solo sin el for
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


}
