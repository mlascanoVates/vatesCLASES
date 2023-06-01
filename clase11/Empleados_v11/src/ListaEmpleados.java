import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados  {

    protected List<Empleado> listaEmpleados;
    protected double sueldoMenor;
    private int sueldoTotalObrero, sueldoTotalAdm, sueldoTotalVendedor;

    private int admConPresentismo;

    public int getAdmConPresentismo() {
        return admConPresentismo;
    }

    public void setAdmConPresentismo(int admConPresentismo) {
        this.admConPresentismo = admConPresentismo;
    }

    protected Integer[] cantidadEmpleado= {0,0,0}; //Obrero, Administrativo, Vendedor
    protected int administrativo, obrero, vendedor;
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }


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




    //METODO1
    public double totalAPagar(){
        double sumar=0;

        for(Empleado e: listaEmpleados){
                sumar+=e.getSueldoDelMes();

        }
        return sumar;
    }


    //6 imprime total a pagar    por tipo de Empleado
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

    public double totalSueldoAmd(){
        double sumar=0;
        for (Empleado e: listaEmpleados)
            if(e instanceof Administrativo){
                sumar +=e.getSueldoDelMes();
                }
        return sumar;
    }
    public double totalSueldoObrero(){
        double sumar=0;
        for (Empleado e: listaEmpleados)
            if(e instanceof Obrero){
                sumar +=e.getSueldoDelMes();
            }
        return sumar;
    }
    public double totalSueldoVendedor(){
        double sumar=0;
        for (Empleado e: listaEmpleados)
            if(e instanceof Vendedor){
                sumar +=e.getSueldoDelMes();
            }
        return sumar;
    }




    //3 cantidad de empleados con presentismo
    public void sumarAdmPresentismo(Empleado e){
        if(((Administrativo) e).isPresentismo()){
            admConPresentismo++;
        }
    }


    //4 empleados que cobran más de 200000
    public int cobra200000(){
        int cant=0;
        for(Empleado e:listaEmpleados){
            if(e.getSueldoDelMes()>=200000){
                cant++;
            }
        }
        return cant;
    }

    //5 BÚSQUEDA POR LEGAJO
    public Empleado getBusquedaXlegajo(int legajo){
        Empleado emp =null;
        for(Empleado e: listaEmpleados){
            if(e instanceof Empleado){
                if(e.getLegajo()==legajo){
                    emp=e;
                    return emp;
                }
            }
        }
        return emp;
    }


    //segunda CANTIDAD DE EMPLEZADO POR CADA TIPO
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


    //7 empleado que menos cobra
    public Empleado cobraMenos(){
        int entra=0;
        Empleado emp=null;
        for(Empleado e: listaEmpleados){
            if(e instanceof Empleado){
                if(entra==0 || e.getSueldoDelMes()<sueldoMenor){
                    sueldoMenor= e.getSueldoDelMes();
                    emp =e;
                    entra++;
                }
            }
        }
        return emp;
    }

    public double promedioDeSueldos(){
        double promedio=0;
        if(listaEmpleados.size()>0){
            promedio= totalAPagar()/listaEmpleados.size();
        }
        return promedio;
    }

    public double promedioSueldoObreros(){
        double promedio=0;
        if(listaEmpleados.size()>0){
            promedio= totalAPagar()/listaEmpleados.size();
        }
        return promedio;
    }

}
