import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();


        /*
        if(x>=0 && y>=0){
            System.out.println("El punto se encuentra en el cuadrante 1");
        }
        else if(x<0 && y>=0){
            System.out.println("El punto se encuentra en el cuadrante 2");
        }
        else if(x<0 && y<0 ){
            System.out.println("El punto se encuentra en el cuadrante 3");
        }
        else {
            System.out.println("El punto se encuentra en el cuadrante 4");
        }*/


        if(x==0 || y==0){
            if(x==0 && y==0){
                System.out.println("El punto está en el origen");
            }
            else{
                System.out.println("Una de las coordenadas se encuentran en el eje");
            }
        }
        else if(x>0 && y>0){
            System.out.println("El punto se encuentra en el cuadrante 1");
        }
        else if(x<0 && y>0){
            System.out.println("El punto se encuentra en el cuadrante 2");
        }
        else if(x<0 && y<0 ){
            System.out.println("El punto se encuentra en el cuadrante 3");
        }
        else {
            System.out.println("El punto se encuentra en el cuadrante 4");
        }





    }
}