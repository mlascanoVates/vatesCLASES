import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //hacer con treset

        Juego juegoNuevo=new Juego();
        Boleta boletaNueva= new Boleta();
        GeneradorNumero g= new GeneradorNumero();

        Boleta ganadora= new Boleta();


        //generador 100 boletas
        for(int i=0; i<50; i++){
            boletaNueva.setBoleta(g.devolver6());
            juegoNuevo.addBoleta(boletaNueva);
            System.out.print("[");
            for(Integer in: boletaNueva.getBoleta()){
                System.out.print( + in+",");
            }
        System.out.println("]");
        }


        //COMPARAR DOS ARREGLOS Y VER SI TIENE MISMOS NUMEROS
        //Si no existe el arreglo, agregar boleta


        //Hacer un juego
      //  HashSet<Integer> sorteo6= new HashSet<>();


     /*   for(int i=0; i<100; i++){
            sorteo6= juegoNuevo.sortearPrimeros6();
            for(Integer juego: sorteo6) {
                System.out.print(juego.intValue() +" ");
            }
            System.out.println();
        }


        while (ganadora==null) {
            ganadora = juegoNuevo.sorteoCompleto();
            if (ganadora == null) {
                System.out.println("no se encontraron coincidencias");
            } else {
                for (Integer b : ganadora.getBoleta()) {
                    System.out.print("GANADOR: " + b.intValue() + " ");
                }
            }
        }*/

        Boleta prueba= new Boleta();
        prueba.setBoleta(g.devolver6());

        System.out.println("GANADORA ES: ");
        for(Integer on: prueba.getBoleta()){
            System.out.print( on+",");
        }


        System.out.println("Fin ganadora");
        int f=0;
        int k=0;
        //comparar y obtener ganador

        for(Boleta bu: juegoNuevo.getGrupoBoletas()){
                if(prueba.sonIguales(bu))
                {
                    System.out.println(k +"GANADOR: " +bu.getBoleta());
                }
                else {System.out.println(f + " Aun no hay ganador");
                }
                f++;
                k++;
        }

    }
}