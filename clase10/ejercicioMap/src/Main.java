import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //mapa de string a float
        HashMap<String,Float> temperaturas=new HashMap<>(0);

        temperaturas.put("Lunes", 23f);
        temperaturas.put("Martes", 33f);
        temperaturas.put("Jueves", 16f);

        System.out.println(temperaturas.containsKey("Lunes"));

        for (String nom: temperaturas.keySet()) {
            System.out.println(nom);
        }
    }
}