
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ingresar números hasta que cargue un 0
        //Informar cantidad de pares e impares

        int numero=1, pares=0, impares=0;
        Scanner sc= new Scanner(System.in);

        while(numero!=0){
            numero= sc.nextInt();

            if(numero%2==0)
                pares++;
            else
                impares++;
        }

        System.out.println("La cantidad de pares es: " + pares);
        System.out.println("La cantidad de impares es: " + impares);
    }
}