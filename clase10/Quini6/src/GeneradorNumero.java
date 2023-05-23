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
        for(int i=0; seisNumeros.size()!=4 ; i++){
            aux= r.nextInt(1,7);
            seisNumeros.add(aux);
          //  System.out.println(aux);
        }
        return seisNumeros;
        }
}




