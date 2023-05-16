public class Administrativo extends Empleado{

    private boolean presentismo;
    private final double incentivo=1.15;

    public Administrativo(String nombre, double sueldo) {
        super(nombre, sueldo);
        this.presentismo=false;

    }
    public Administrativo(String nombre, double sueldo, boolean presentismo) {
        super(nombre, sueldo);
        this.presentismo=presentismo;
    }

    public boolean isPresentismo() {
        return presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    @Override
    public double getSueldoDelMes(){
        double sueldoDelMes=0;
        if (presentismo){
            sueldoDelMes =sueldo *incentivo;
        }
        return sueldoDelMes;
    }


    @Override
    public String toString() {
        return "Administrativo{" +
                super.toString()+ " "+
                ", presentismo= " + presentismo +
                ", incentivo= " + incentivo +
                '}';
    }
}


