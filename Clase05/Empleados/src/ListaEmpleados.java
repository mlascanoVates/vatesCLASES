import java.util.ArrayList;

public class ListaEmpleados {

    protected ArrayList<Empleado> listaEmpleados;

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

        if(e instanceof Empleado){

            listaEmpleados.add(e);
            if(e instanceof Obrero){
                cantidadEmpleado[0]++;
            }
            else if(e instanceof Administrativo){
                cantidadEmpleado[1]++;
                sumarAdmPresentismo(e);
            }
            else if(e instanceof Vendedor){
                cantidadEmpleado[2]++;
            }
        }
    }

    public void sumarAdmPresentismo(Empleado e){
        if(((Administrativo) e).isPresentismo()){
           admConPresentismo++;
        }
    }

    public double totalAPagar(ArrayList<Empleado> Empleados){
        double sumar=0;
        for (Empleado e: Empleados){
            if(e instanceof Empleado){
                sumar+=e.getSueldoDelMes();
            }
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
