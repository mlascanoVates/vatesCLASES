import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("Escriba una opción: " + "\n"+
                "A: Buenos días" +   "\n"+
                "B: Buenas tardes+" +  "\n"+
                "C: Buenas noches");

       Map<String, String > mapa= new HashMap<>();
       mapa.put("A", "Buenos días");
       mapa.put("B", "Buenas tardes");
       mapa.put("C", "Buenas noches");

       Consumer<String> consumidor= new Consumer<String>() {
           @Override
           public void accept(String a) {
               System.out.println(mapa.get(a));
           }
       };

       //COMO HACER UNA CLASE APARTE  E IMPORTAR EL MAPA

       Scanner sc= new Scanner(System.in);
       String linea= sc.nextLine().toUpperCase();
       consumidor.accept(linea);

       //FUNCION 2

/*
       Set<String> claves= mapa.keySet();
       claves.forEach(cadaClave-> System.out.println(mapa.get(cadaClave)));
*/

    }

}