import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static <List> void main(String[] args) {
        int numero=0, positivos=0, mayor, sumar=0, cantidadIngresada=0;
        double promedio;
        Scanner sc= new Scanner(System.in);
        numero= sc.nextInt();
        mayor=numero;
        cantidadIngresada++;
        sumar += numero;
        if (numero >0)
            positivos++;

        while(numero != -1000)
        {
            numero= sc.nextInt();
            if (numero >0)
                positivos++;
            sumar += numero;
            cantidadIngresada++;

            if(numero>mayor)
                mayor=numero;
        }

        promedio=(double)sumar/cantidadIngresada;
        System.out.println("El promedio de todos los ingresados es: "+ promedio);
        System.out.println("El mayor de todos los ingresados es: "+ mayor);
        System.out.println("Cantidad de positivos: "+ positivos);

    }
}