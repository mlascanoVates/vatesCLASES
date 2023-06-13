public class Pago {
    private int idPago;
    private Plan plan;
    private int diasMora;

    public Pago(int idPago, Plan plan, int diasMora) {
        this.idPago = idPago;
        this.plan = plan;
        this.diasMora = diasMora;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Plan getIdPlan() {
        return plan;
    }

    public void setIdPlan(String idPlan) {
        this.plan = plan;
    }

    public int getDiasMora() {
        return diasMora;
    }

    public void setDiasMora(int diasMora) {
        this.diasMora = diasMora;
    }

    /***********************************Metodos**************************************/

    public double interesesAdicionales(){
        return  0.005 * plan.importeCuota()*diasMora;
    }





}
