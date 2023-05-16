public abstract class Empleado {
    protected double sueldo;
    protected String nombre;

    public Empleado(String nombre, double sueldo) {
        this.nombre=nombre;
        this.sueldo = sueldo;
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
                "sueldo= " + sueldo ;
    }
}
