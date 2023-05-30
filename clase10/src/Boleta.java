import java.util.*;

public class Boleta {
    TreeSet<Integer> boleta;

    public Boleta() {
        boleta= new TreeSet<>();
    }

    public TreeSet<Integer> getBoleta() {
        return boleta;
    }

    public void setBoleta(TreeSet<Integer> boleta) {
        this.boleta = boleta;
    }


    //Duda se agrega int o Integer
    public void addUnNumero(int numero){
        boleta.add(numero);
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
        public boolean comparaBoletas(Boleta nueva) {
            if (this.getBoleta().containsAll(nueva.getBoleta())) {
              System.out.println("Si entra");
           //     System.out.println("con numero"+ nueva.getBoleta());
                return true;
            }
         //   System.out.println("o aqui entra");
            return false;
        }

/*

   @Override
    public String toString() {
        return "Boleta{" +
                "boleta=" + boleta +
                '}';*/
}

