import java.util.Comparator;

public class ComparadorSueldos implements Comparator<Empleado> {


    @Override
    public int compare(Empleado o1, Empleado o2) {
        return (int)(o1.getSueldoDelMes()- o2.getSueldoDelMes());
    }
}
