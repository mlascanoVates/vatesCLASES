import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> listaDeNumeros= new ArrayList<>();
        Random r= new Random();

        long start=  System.currentTimeMillis();

        for(int i=0; i<100000 ; i++){
            listaDeNumeros.add(r.nextInt(-100000,100000));
        }
        long end= System.currentTimeMillis();
        double duracion=  end - start;

        System.out.println("duracion creacion: "+ duracion);

        start=  System.currentTimeMillis();

        System.out.println("Tamanio:"+ listaDeNumeros.size());
        System.out.println("contiene 35654: " +listaDeNumeros.contains(35654));

        int j=1;
        System.out.println("Primeros 10");
        for (Integer i: listaDeNumeros){
            if(j<=10){
                System.out.println(j +": "+ i);
                j++;
            }
        }



        end= System.currentTimeMillis();
        duracion= end - start;
        System.out.println("duracion: "+ duracion);


        System.out.println("con HashSet");
        HashSet<Integer> mapa= new HashSet<>();

        start=  System.currentTimeMillis();
        for(int i=0; i<100000 ; i++){
            mapa.add(r.nextInt(-100000,100000));
        }
        end= System.currentTimeMillis();
        duracion=  end - start;

        System.out.println("duracion creacion: "+ duracion);

        start=  System.currentTimeMillis();
        System.out.println("tamaño:"+ mapa.size());
        System.out.println("contiene 35654: " + mapa.contains(35654));

        j=1;
        System.out.println("Primeros 10");
        for (Integer i: mapa){
            if(j<=10){
                System.out.println(j +": "+ i);
                j++;
            }
        }

        end= System.currentTimeMillis();
        duracion=  end - start;
        System.out.println("duracion: "+ duracion);


        System.out.println("con TreeSet");
        TreeSet<Integer> arbol= new TreeSet<>();
        start=  System.currentTimeMillis();
        for(int i=0; i<100000 ; i++){
            arbol.add(r.nextInt(-100000,100000));
        }
        end= System.currentTimeMillis();
        duracion=  end - start;

        System.out.println("duracion creacion: "+ duracion);

        start=  System.currentTimeMillis();
        System.out.println("tamaño:"+ arbol.size());
        System.out.println("contiene 35654: " + arbol.contains(35654));

        j=1;

        System.out.println("Primeros 10");
        for (Integer i: arbol){
            if(j<=10){
                System.out.println(j +": "+ i);
                j++;
            }
        }

        end= System.currentTimeMillis();
        duracion=  end - start;
        System.out.println("duracion: "+ duracion);




        //El tamaño del arreglo es menor porque no repite
    }
}