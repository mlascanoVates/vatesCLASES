import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Juego {
    ArrayList<Boleta> grupoBoletas;

    public Juego() {
        this.grupoBoletas =new ArrayList<>();
    }

    //generar al azar numeros enteros sin repetir entre 1 y 46
    public TreeSet<Integer> sortearPrimeros6(){
        TreeSet<Integer> sorteoNumeros= new TreeSet<>();
        Random r= new Random();
        int aux=0;
        while (sorteoNumeros.size()<4){
            aux= r.nextInt(1,7);
            sorteoNumeros.add(aux);
        }
        return sorteoNumeros;
    }

    public Boleta navegarBoletas(TreeSet<Integer> numerosGanadores) {
        Boleta boletaGanadora = null; //Si no hay boleta ganadora retornar NULL
        for (Boleta b: grupoBoletas) {
            //coincide por lugar o en total
            if(b.equals(numerosGanadores))
            {boletaGanadora=b;
                for (Integer bo: boletaGanadora.getBoleta()){
                    System.out.println(bo);
                }
            }
        }
        return boletaGanadora;
    }

    public Boleta sorteoCompleto(){
        TreeSet<Integer> boletaGanadora = sortearPrimeros6();
        Boleta ganadora= null;
        ganadora=navegarBoletas(boletaGanadora);

        return ganadora;
    }


    public ArrayList<Boleta> getGrupoBoletas() {
        return grupoBoletas;
    }

    public void setGrupoBoletas(ArrayList<Boleta> grupoBoletas) {
        this.grupoBoletas = grupoBoletas;
    }

    public void addBoleta(Boleta b){
        grupoBoletas.add(b);
    }
}
