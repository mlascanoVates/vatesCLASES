import java.util.ArrayList;

public class ConjuntoDeEnteros {
    private ArrayList<Integer> numeros;

    public ConjuntoDeEnteros(){
        numeros=new ArrayList<>();
    }


    public void agregar(Integer nuevo) {
        numeros.add(nuevo);
    }
}

