import java.util.ArrayList;

public abstract class Empleado implements Comparable {
    protected double sueldo;
    protected String nombre;
    protected int legajo;

    protected ArrayList<Empleado> listaEmpleados;

    public Empleado( int legajo, String nombre, double sueldo) {
        this.legajo=legajo;
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
<<<<<<< HEAD
                ", sueldo= " + getSueldoDelMes() ;
=======
                ", sueldo= " + sueldo ;
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
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

<<<<<<< HEAD
    //METODO ARRAY SORT

=======
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
    @Override
    public int compareTo(Object o) {
        Empleado emp = (Empleado)o;
        return this.nombre.compareTo(emp.nombre);
    }


}
