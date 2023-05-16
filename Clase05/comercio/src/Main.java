public class Main {
    public static void main(String[] args) {

        Cliente cliente1= new Cliente("Angles", 34);
        ClienteLocal clienteLocal1= new ClienteLocal("Daniela", 536, 6);
        ClienteOnline clienteOnline1= new ClienteOnline("Lautaro", 267,"lauLopez@mail.com", "Ayacucho 45");

        System.out.println("Cliente es: " + cliente1);
        System.out.println("Cliente de Local es: " + clienteLocal1);
        System.out.println("Cliente Online es: "+ clienteOnline1);

    }
}