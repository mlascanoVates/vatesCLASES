import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Boleta {
    TreeSet<Integer> boleta= new TreeSet<>();

    public Boleta() {
        boleta= new TreeSet<>();
    }

    public TreeSet<Integer> getBoleta() {
        return boleta;
    }

    public void setBoleta(TreeSet<Integer> boleta) {
        this.boleta = boleta;
    }

    //PONER LOS NUMEROS DE LA BOLETA DE MENOR A MAYOR, para comparar
    //UN HASHSET NO SE PUEDE ORDER
    public void ordenarBoleta(){

    }

    //recorrer Boleta
    public boolean sonIguales(Boleta a){
        int acierto=0;
        //    if(this.getBoleta().containsAll(a.getBoleta())){
      //      return true;
      //  }

        for (Integer i :a.getBoleta()){
            for (Integer in: this.getBoleta()){
                if(i.equals(in))
                {
                    acierto++;
                    System.out.println("Acierto" + acierto);
                }
            }
        }

        System.out.println("QUEDA " + this.getBoleta().containsAll(a.getBoleta()));
        if(this.getBoleta().containsAll(a.getBoleta())){
            System.out.println("ENTRA");
                    /*
                    System.out.println("VALOR B:" +b.intValue());
                    System.out.println("VALOR G:" +g.intValue());
                    acierto++;
                    System.out.println("acierto: " + acierto);*/


            return true;
                }

        return false;
     }


    @Override
    public String toString() {
        return "Boleta{" +
                "boleta=" + boleta +
                '}';
    }
}
