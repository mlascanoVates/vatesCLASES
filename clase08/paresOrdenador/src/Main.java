public class Main {
    public static void main(String[] args) {

        Par<Integer> a= new Par<>(45,466);


        System.out.println(a);
        a.intercambiar();
        System.out.println(a);
        a.parTraspuesto();
        System.out.println(a);
    }
}