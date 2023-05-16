import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dias=15, diasBajoCero=0, totalDias=0, contarCalidos=0;
        double promedio=0, promedioDiasCalidos=0, sumarTemperaturas=0;
        double temperatura=0, diasCalidos=0;
        boolean mas40=false;
        Scanner sc=new Scanner(System.in);

        while (totalDias<dias){
            temperatura= sc.nextFloat();

            if(temperatura<0)
                diasBajoCero++;

            if(temperatura>20){
                diasCalidos+=temperatura;
                contarCalidos++;
            }

            if (temperatura>40)
                mas40=true;

            sumarTemperaturas += temperatura;


            totalDias++;
        }

        promedio= sumarTemperaturas/dias;
        //cuidado division por 0
        promedioDiasCalidos=   diasCalidos/contarCalidos;



        System.out.println("Cantidad de días con temperatura bajo cero: " + diasBajoCero);
        System.out.println("Promedio de temperaturas: " + promedio);
        System.out.println("Promedio de temperaturas cálidas: " + promedioDiasCalidos);
        System.out.println("Algún día con temperatura mayor a 40: " + mas40);



    }
}