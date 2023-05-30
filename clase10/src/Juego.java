import javax.swing.plaf.PanelUI;
import java.util.*;

public class Juego {
    //Cambiar array dps por treset
    //No me deja agregar boletas con TREESET
    protected HashSet<Boleta> grupoBoletas;

    private Boleta ganadora;
    ArrayList<Boleta> ganadores1;

    public Juego() {
        this.grupoBoletas =new HashSet<>();
        ganadora=new Boleta();
        ganadores1= new ArrayList<>();
    }

    public Boleta getBoletaGanadora() {
        return ganadora;
    }

    public void setBoletaGanadora(Boleta numerosGanadores) {
        this.ganadora = numerosGanadores;
    }

    public void addNumeroGanador(int cantidadAgregar){
        TreeSet<Integer> boletaTemporal= ganadora.getBoleta();
        Random r= new Random();
        int aux=0;
        while (ganadora.getBoleta().size()==boletaTemporal.size()){
            aux= r.nextInt(1,15);
            ganadora.addUnNumero(aux);
        }
    }

    public ArrayList<Boleta> getGanadores1() {
        return ganadores1;
    }

    public void setGanadores1(ArrayList<Boleta> ganadores1) {
        this.ganadores1 = ganadores1;
    }

    //generar al azar numeros enteros sin repetir entre 1 y 46
    //lo devuelvo ordenado de menor a mayor para comparar las boletas
    //se deberia devolver ordenado o no?
    public TreeSet<Integer> sortearPrimeros6(){
        Random r= new Random();
        int aux=0;
        while (ganadora.getBoleta().size()<6){
            aux= r.nextInt(1,15);
            ganadora.addUnNumero(aux);
        }
        return ganadora.getBoleta();
    }


    public boolean verificarGanador(Boleta boletaGanadora){
        //ArrayList<Boleta> ganadores= new ArrayList<>();
        int contar=0;
        for (Boleta b: grupoBoletas) {
            //coincide por lugar o en total
            if(b.getBoleta().containsAll(boletaGanadora.getBoleta())) {
                contar++;
                System.out.println(contar +" GANADOR: " +b.getBoleta());
                ganadores1.add(b);
                return true;
            }
            else this.addNumeroGanador(1);
        }
        return false;
    }



    /*
    //corroborar que no haya boletas repetidas
    public void comparaBoletas(Boleta nueva){
        if(grupoBoletas.size()>1){
        for(Boleta b: this.getGrupoBoletas() ){
            if(!(b.getBoleta().equals(nueva.getBoleta()))){
                System.out.println("Entra a comparaBOLETAS");
                this.addBoleta(nueva);
            }
        }
    }
        this.addBoleta(nueva);
    }
*/

    //encontrar la ganadora
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


    public HashSet<Boleta> getGrupoBoletas() {
        return grupoBoletas;
    }


    public void addBoleta(Boleta b){
        grupoBoletas.add(b);
    }
}
