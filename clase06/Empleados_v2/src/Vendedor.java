public class Vendedor extends Empleado {

    private double totalVentas;

    public Vendedor(int legajo, String nombre, double sueldo) {
        super(legajo, nombre, sueldo);
        totalVentas=0;
    }

    public Vendedor(int legajo, String nombre, double sueldo, double totalVentas) {
        super(legajo, nombre,sueldo);
        this.totalVentas=totalVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public double getSueldoDelMes(){
        if(totalVentas>0) return super.sueldo+totalVentas*0.01;
        else return super.sueldo;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString()+
                ", totalVentas= " + totalVentas +
                '}';
    }
}

