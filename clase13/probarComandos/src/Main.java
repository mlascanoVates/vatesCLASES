import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r= new Random();
        ArrayList<Integer> numeros= new ArrayList<>();

        for(int i=0; i<50; i++){
         numeros.add(r.nextInt(-100,100));
        }

        numeros.stream()
                .peek((x)->{
                    System.out.print("---- ");
                    System.out.print(x);
                    System.out.println(" ----");
                })
                .skip(45)
                .peek((y)->{
                    System.out.print("---- ");
                    System.out.print(y);
                    System.out.print(" ----");
                }).forEach(System.out::println);

        Random random1 = new Random();
        System.out.println("Lista random");
        random1.ints(50, -200, 100).sorted().forEach(System.out::println);
    }
}