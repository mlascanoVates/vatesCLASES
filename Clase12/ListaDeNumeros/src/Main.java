import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumerica= new ArrayList<>();
        Random r= new Random();
        for(int i=0; i<1000; i++){
            int n= r.nextInt(-1000,1000);
            if(n/7==0 && n>7) System.out.println(n);
            listaNumerica.add(n);
        }


       // ArrayList<Integer> listaNumerica= Arrays.asList(()
/*
        int min= listaNumerica.stream().min(Integer::compare).get();
        int max= listaNumerica.stream().max(Integer::compare).get();
        System.out.println("minimo: " + min);
        System.out.println("máximo: " + max);

        ArrayList<Integer> impares= new ArrayList<>();
        Stream<Integer> imp = listaNumerica.stream().filter((n)->(n%2!=0));
        System.out.println("Imprimir impares: ");
        imp.forEach(System.out::println);

        System.out.println("Imprimir impares: ");
        listaNumerica.stream().filter((n)->(n%2!=0)).forEach(System.out::println);

        System.out.println("El cuadrado de los que están entre 10 y 100");
        listaNumerica.stream().filter((n)->(n>10 && n<100)).map((n)->(n*n)).forEach(System.out::println);


        System.out.println("Todos los múltiplos de 7 ordenados en forma descendiente");
        listaNumerica.stream().filter((n)->(n%7==0 && n>7)).forEach(System.out::println);

        System.out.println("El promedio de los impares negativos");
        listaNumerica.stream().filter((n)->(n%2!=0 && n<0)).forEach(System.out::println);
*/
        System.out.println("La desviación estandar de todos");

        System.out.println("Existe o no algún múltiplo de 127");
        listaNumerica.stream()orElse
/*

        System.out.println("Terminan en 2 o 3");
        // listaNumerica.stream().mapToDouble((n)->((double)n/10)).filter((n)->(n%10==2)).forEach(System.out::println);
        listaNumerica.stream()
                .filter((n) -> (n % 10 == 2 || n % 10 == -2 || n % 10 == 3 || n % 10 == -3))
                .forEach(System.out::println);




        //USAR ORELSE
        //ver de usar OPTIONAL

        */
    }
}