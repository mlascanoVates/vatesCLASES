import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class GeneradorNumero {


    public GeneradorNumero() {
    }


    //no repetir numeros en el arreglo
    public TreeSet<Integer> devolver6(){
        TreeSet<Integer> seisNumeros= new TreeSet<>();
        Random r= new Random();
        int aux=0;
        while(seisNumeros.size()<6){
            aux= r.nextInt(1,15);
            seisNumeros.add(aux);
        }
        return seisNumeros;
        }
}




