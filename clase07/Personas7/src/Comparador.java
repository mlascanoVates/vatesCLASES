import java.util.Comparator;

public class Comparador implements Comparator<Persona> {

    // override the compare() method
    public int compare(Persona o,Persona u) {
        int a= o.getApellido().compareTo(u.getApellido());
        if(a==0)
        {return o.getNombre().compareTo(u.getNombre());}
        return o.getApellido().compareTo(u.getApellido());
    }
}

