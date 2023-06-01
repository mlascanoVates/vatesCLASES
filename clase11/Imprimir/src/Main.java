import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {



    public static void main(String[] args) {


        Map<String, String > mapa= new HashMap<>();
        mapa.put("A", "Buenos días");
        mapa.put("B", "Buenas tardes");
        mapa.put("C", "Buenas noches");

        Consumer<String> imprimir= (String a) ->  System.out.println(mapa.get(a));

        System.out.println("Escriba una opción: " + "\n"+
                "A: Buenos días" +   "\n"+
                "B: Buenas tardes" +  "\n"+
                "C: Buenas noches");


        Scanner sc= new Scanner(System.in);
        String eleccion= sc.nextLine().toUpperCase();
        imprimir.accept(eleccion);


        // BiConsumer<Map<String,String>, String> consumidor= (Map<String,String >a,String b) -> System.out.println(a.get(b));


       //COMO HACER UNA CLASE APARTE  E IMPORTAR EL MAPA

     //  Scanner sc= new Scanner(System.in);
     //  String linea= sc.nextLine().toUpperCase();
      // consumidor.accept(mapa,linea);
       //FUNCION 2

/*
       Set<String> claves= mapa.keySet();
       claves.forEach(cadaClave-> System.out.println(mapa.get(cadaClave)));
*/

    }

}