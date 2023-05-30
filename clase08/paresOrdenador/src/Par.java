import java.util.Comparator;

public class Par<T extends Comparable> {
    //Permite almacenar par de objetos del mimso tipo
    //T

    private T c1,c2;

    public Par(T c1, T c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public T getC1() {
        return c1;
    }

    public void setC1(T c1) {
        this.c1 = c1;
    }

    public T getC2() {
        return c2;
    }

    public void setC2(T c2) {
        this.c2 = c2;
    }

    public void intercambiar(){
        T aux= c2;
        c2= this.c1;
        c1=aux;
    }
    public Par<T> parTraspuesto(){
        return new Par<>(c2,c1);
    }

    public boolean sonIguales(){
        return c1.equals(c2);
    }


    public boolean ascendente(){
        return c1.compareTo(c2)<0;
    }
    public boolean descendente(){
        return c1.compareTo(c2)>0;
    }

    @Override
    public int compareTo(Object o) {
        return this.compareTo(o);
    }

    @Override
    public String toString() {
        return "Par(" +
                 c1 +
                "," +
                c2 +
                ')';
    }


}
