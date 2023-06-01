import java.util.ArrayList;

public abstract class Empleado {
    protected double sueldo;
    protected String nombre;


    protected int legajo;


    public Empleado( int legajo, String nombre, double sueldo) {
        this.legajo=legajo;
        this.nombre=nombre;
        this.sueldo = sueldo;

    }


    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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


/*
    public void imprimirTodosLosSueldos(){
        for (Empleado e: listaEmpleados){
            System.out.printf("%15s %15f", e.getNombre(), e.getSueldoDelMes());
        }
    }
*/
    public double sumarSueldos(ArrayList<Empleado> Empleados){
        double sumar=0;
        for (Empleado e: Empleados){
            if(e instanceof Empleado){
                sumar+=e.getSueldoDelMes();
            }
        }
        return sumar;
    }

    public String toString() {
        return "nombre= " + String.format("%30s", nombre) +
                ", sueldo= " + String.format("%15.2f", getSueldoDelMes()) ;
    }
/*
    @Override
    public int compareTo(Empleado o){

    return (int)(this.getSueldoDelMes()- o.getSueldoDelMes());
    }
*/

}
