import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    static int cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
    public static void main(String[] args) throws FileNotFoundException {

        File archivo= new File("numeros.txt");
        Scanner sc= new Scanner(archivo);

        int sumar=0,cantidad=0, variable, menor =0, pares=0, ultimoNumero, i=0;
        int cero=0,uno=0,dos=0,tres=0,cuatro=0,cinco=0,seis=0,siete=0,ocho=0,nueve=0;
        double promedio=0;


        while (sc.hasNext()){
            variable=sc.nextInt();

            //usar if en vez de while
            if (cantidad==0)    menor=variable;
            sumar+= variable;
            cantidad++;
            if(variable<menor) menor=variable;
            if(variable%2==0) pares++;

            ultimoNumero= variable%10;
            termina(ultimoNumero);


        }


        promedio= (double)sumar/cantidad;

        System.out.println("La suma de todos los números es: "+ sumar);
        System.out.println("El promedio de todos los números es: "+ promedio);
        System.out.println("El menor número es: "+ menor);
        System.out.println("Número de pares: " + pares);

        System.out.println("Cantidad de números que terminan en 0 es:" + cero);
        System.out.println("Cantidad de números que terminan en 1 es:" + uno);
        System.out.println("Cantidad de números que terminan en 2 es:" + dos);
        System.out.println("Cantidad de números que terminan en 3 es:" + tres);
        System.out.println("Cantidad de números que terminan en 4 es:" + cuatro);
        System.out.println("Cantidad de números que terminan en 5 es:" + cinco);
        System.out.println("Cantidad de números que terminan en 6 es:" + seis);
        System.out.println("Cantidad de números que terminan en 7 es:" + siete);
        System.out.println("Cantidad de números que terminan en 8 es:" + ocho);
        System.out.println("Cantidad de números que terminan en 9 es:" + nueve);

    }

   private static void termina(int ultimoNumero) {

        if(ultimoNumero==0)      cero++;
        else if(ultimoNumero==1) uno++;
        else if(ultimoNumero==2) dos++;
        else if(ultimoNumero==3) tres++;
        else if(ultimoNumero==4) cuatro++;
        else if(ultimoNumero==5) cinco++;
        else if(ultimoNumero==6) seis++;
        else if(ultimoNumero==7) siete++;
        else if(ultimoNumero==8) ocho++;
        else                     nueve++;

    }


/*
    private static void termina2(int ultimoNumero) {

        if (ultimoNumero >= 8) {
            if (ultimoNumero == 9) nueve++;
            else ocho++;
        } else if (ultimoNumero >= 6) {
            if (ultimoNumero == 7) siete++;
            else seis++;
        } else if (ultimoNumero >= 4) {
            if (ultimoNumero == 5) cinco++;
            else cuatro++;
        } else if (ultimoNumero >= 2) {
            if (ultimoNumero == 3) tres++;
            else dos++;
        } else if (ultimoNumero == 1) uno++;
        else cero++;
        }*/
}

