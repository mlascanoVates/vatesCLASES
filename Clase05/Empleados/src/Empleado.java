import java.util.ArrayList;

public abstract class Empleado {
    protected double sueldo;
    protected String nombre;

    protected ArrayList<Empleado> listaEmpleados;

    public Empleado(String nombre, double sueldo) {
        this.nombre=nombre;
        this.sueldo = sueldo;
        listaEmpleados= new ArrayList<>();
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setEmpleado(Empleado e) {
        listaEmpleados.add(e);
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //obliga la sobreescritura de los que heredan
    public abstract double getSueldoDelMes();

    public String toString() {
        return "nombre= " + nombre +
                ", sueldo= " + sueldo ;
    }

    public void imprimirTodosLosSueldos(){
        for (Empleado e: listaEmpleados){
            System.out.printf("%15s %15f", e.getNombre(), e.getSueldoDelMes());
        }
    }

    public double sumarSueldos(ArrayList<Empleado> Empleados){
        double sumar=0;
        for (Empleado e: Empleados){
            if(e instanceof Empleado){
                sumar+=e.getSueldoDelMes();
            }
        }
        return sumar;
    }


}
