public class Administrativo extends Empleado{

    private boolean presentismo;
    private final double incentivo=1.15;

    public Administrativo(int legajo, String nombre, double sueldo) {
        super(legajo, nombre, sueldo);
        this.presentismo=false;

    }
    public Administrativo(int legajo, String nombre, double sueldo, boolean presentismo) {
        super(legajo, nombre, sueldo);
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
        if (presentismo){
            return sueldo *incentivo;
        }
        return sueldo ;
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

