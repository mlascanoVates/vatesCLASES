import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //hacer con treset

        Juego juegoNuevo=new Juego();
        GeneradorNumero g= new GeneradorNumero();

        Boleta ganadora= new Boleta();


        //PUNTO 1 generador 100 boletas
        for(int i=0; i<1000; i++){
            Boleta boletaNueva= new Boleta();
            boletaNueva.setBoleta(g.devolver6());
            if(juegoNuevo.getGrupoBoletas().size()>0){
                boolean aux=false;
                for(Boleta b: juegoNuevo.getGrupoBoletas()){
                    aux= b.comparaBoletas(boletaNueva);
                    if (aux) break;
                }
                if(!aux){
                    juegoNuevo.addBoleta(boletaNueva);
                    System.out.println("se generan las boletas"+boletaNueva.getBoleta());
                }
                else {}
            }
            else if (juegoNuevo.getGrupoBoletas().isEmpty()){ juegoNuevo.addBoleta(boletaNueva);
                System.out.println("Primer boleta 1"+boletaNueva.getBoleta());
                }
        }

        System.out.println("Tamaño de juego: "+ juegoNuevo.getGrupoBoletas().size());


        //Prueba: boleta ganadora
        Boleta boletaGanadora= new Boleta();
        juegoNuevo.setBoletaGanadora(boletaGanadora);
        juegoNuevo.sortearPrimeros6();
       //  juegoNuevo.verificarGanador(juegoNuevo.getBoletaGanadora());
        int i=0;
        System.out.println("empty "+ juegoNuevo.ganadores1.isEmpty());
        while (juegoNuevo.ganadores1.isEmpty()){
            System.out.println("sorteada: " + juegoNuevo.getBoletaGanadora().getBoleta());
        boolean auxiliar= juegoNuevo.verificarGanador(juegoNuevo.getBoletaGanadora());
            System.out.println("Auxi" + auxiliar);
        if (auxiliar){
            System.out.println("empty "+ juegoNuevo.ganadores1.isEmpty());
            for (Boleta bb: juegoNuevo.ganadores1){
                i++;
                System.out.println(i+ ": "+ bb.getBoleta());
            }
        }
        }


    }
}