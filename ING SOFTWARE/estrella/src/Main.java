public class Main {
    public static void main(String[] args) {
        System.out.println("SE DIBUJA ESTRELLA CON ASTERISCO");
        System.out.println("PRIMERA PARTE TRIÁNGULO");

        for(int i=0; i<=4; i++){
            for (int j=0; j<=25; j++)
            {
                if(j==26/2){
                    System.out.printf("*");
                }
                if(j==(26/2)+1 || j==(26/2)-1  ){
                    System.out.printf("*");
                }
           }
            System.out.println("");

        }
    }
}