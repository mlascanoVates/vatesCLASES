import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1, numero2, numero3;

        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese 3 números: ");
        numero1= sc.nextInt();
        numero2= sc.nextInt();
        numero3= sc.nextInt();

        int mayor = (numero1>numero2)? numero1: numero2;
        int mayor2= (mayor>numero3)? mayor:numero3;

        //agrupado en una sentencia
        int mayor3= ((numero1>numero2)? numero1: numero2)> (numero3)?  ((numero1>numero2)? numero1: numero2): numero3;


        System.out.println("El mayor es " + mayor2);
        System.out.println("El mayor es " + mayor3);
    }
    }
