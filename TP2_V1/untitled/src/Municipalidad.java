import java.util.ArrayList;
import java.util.Arrays;

public class Municipalidad {
    private ArrayList<Plan> planesDePago;
    private ArrayList<Pago> pagosContribuyentes;

    public Municipalidad() {
        planesDePago= new ArrayList<>();
        pagosContribuyentes= new ArrayList<>();
    }

    public ArrayList<Plan> getPlanesDePago() {
        return planesDePago;
    }

    public void setPlanesDePago(ArrayList<Plan> planesDePago) {
        this.planesDePago = planesDePago;
    }

    public ArrayList<Pago> getPagosContribuyentes() {
        return pagosContribuyentes;
    }

    public void setPagosContribuyentes(ArrayList<Pago> pagosContribuyentes) {
        this.pagosContribuyentes = pagosContribuyentes;
    }

    public void addPlan(Plan plan){
        planesDePago.add(plan);
    }
    public void addPago(Pago pago){
        pagosContribuyentes.add(pago);
    }

    //Obtiene Plan a partir de linea de Archivo de texto
    public void obtenerPlan(String linea)
    {

        //RESOLVER ITERAR CON STREAM
        //VER METODO SPLIRATOR
        String[] result = linea.split(";");
        String idPlan= result[0];
        String nombreContribuyente=result[1] ;
        Double totalDeuda= Double.parseDouble(result[2]);
        int cantidadCuotas= Integer.parseInt(result[3]);
        Arrays.stream(result).spliterator();
        planesDePago.add(new Plan(idPlan,nombreContribuyente,totalDeuda,cantidadCuotas));
    }

}
