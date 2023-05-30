import java.util.ArrayList;
import java.util.Arrays;

public class Primo {

//   private int max;
    private ArrayList<Integer> listaPrimos;

    public Primo() {

        listaPrimos=new ArrayList<>();
    //    listaPrimos();
    }

    public ArrayList<Integer> getListaPrimos() {
        return listaPrimos;
    }

    public void setListaPrimos(ArrayList<Integer> listaPrimos) {
        this.listaPrimos = listaPrimos;
    }

    public void listaPrimos(int max){
        ArrayList<Integer> listaEntera=new ArrayList<>();
        for (int i=2; i<=max; i++){
            listaEntera.add(i);
        }
        for(Integer i: listaEntera){
            boolean primero=true;
            if(i==2) {
                primero=true;
                listaPrimos.add(i);
            }
            else {
            for(Integer l: listaPrimos){
                if(i%l==0) {
                  //  listaEntera.remove(i);
                    primero=false;
                }
            }
            if(primero==true){
                listaPrimos.add(i);
               // listaEntera.remove(i);
            }
            }
        }
    }

    public boolean esPrim(int max){
        ArrayList<Integer> listaEntera=new ArrayList<>();
        boolean esPrimo=false;
        for (int i=2; i<=max; i++){
            listaEntera.add(i);
        }

        for(Integer i: listaEntera){
            boolean primero=true;
            if(i==2) {
                if(max==2) return true;
               // return true;
                listaPrimos.add(i);
            }
            else {
                for(Integer l: listaPrimos){
                    if(i%l==0) {
                        if(i==max) return false;
                        primero=false;
                    }
                }
                if(primero==true){
                    listaPrimos.add(i);
                }
            }
        }
        return true;
    }


    public boolean esPrimo(int n){
        if(n==1) return false;
        else if(n/2==0){
            return false;
        }
        return false;
    }
}

