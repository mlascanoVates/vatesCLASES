import java.util.ArrayList;

public class Plan {
    private String idPlan, nombreContribuyente;
    private Double totalDeuda; //el TOTAL del Plan o El total de lo que ADEUDA
    private int cantidadCuotas;
    private ArrayList<Pago> cuotasPagas;
    //En el txt ver si corresponde el numero de cantidad de cuotas pagas


    public Plan(String idPlan, String nombreContribuyente, Double totalDeuda, int cantidadCuotas) {
        this.idPlan = idPlan;
        this.nombreContribuyente = nombreContribuyente;
        this.totalDeuda = totalDeuda;
        this.cantidadCuotas = cantidadCuotas;
        cuotasPagas=new ArrayList<>();
    }

    public String getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(String idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombreContribuyente() {
        return nombreContribuyente;
    }

    public void setNombreContribuyente(String nombreContribuyente) {
        this.nombreContribuyente = nombreContribuyente;
    }

    public Double getTotalDeuda() {
        return totalDeuda;
    }

    public void setTotalDeuda(Double totalDeuda) {
        this.totalDeuda = totalDeuda;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public ArrayList<Pago> getCuotasPagas() {
        return cuotasPagas;
    }

    public void setCuotasPagas(ArrayList<Pago> cuotasPagas) {
        this.cuotasPagas = cuotasPagas;
    }

    public void addCuotaPaga(Pago pago){
        cuotasPagas.add(pago);
    }

    //CONSIGNA
    public Double importeCuota(){
        return totalDeuda/cantidadCuotas;
    }

    @Override
    public String toString() {
        return "Plan:" +
                "idPlan:" + idPlan +
                ", nombreContribuyente:"  + String.format("%s",nombreContribuyente ) +
                ", totalDeuda:" + totalDeuda +
                ", cantidadCuotas:" + cantidadCuotas +
                ", cuotasPagas:" + getCuotasPagas();
    }


    //CUOTA CLASE UN SOLO MÉTODO
    //CLASE ABSTRACTA?

    //tamaño arreglo
    public boolean estaPago()
    {
        return  cuotasPagas.size()== cantidadCuotas;
    }

}
