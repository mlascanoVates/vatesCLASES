import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Municipalidad {

    //ID plan, valores del plan
    private HashMap<String, Plan> planesDePago1;

 //   private ArrayList<Plan> planesDePago;


    //LOS PAGOS DEBEN SER CARGADOS DIRECTAMENTE EN EL PLAN
    //idPago, Pago
  //  private HashMap<Integer, Pago> pagosContribuyentes1;

  //  private ArrayList<Pago> pagosContribuyentes;

    public Municipalidad() {
        planesDePago1= new HashMap<>();
    //    pagosContribuyentes1= new HashMap<>();
    }

    public Collection<Plan> getPlanesDePago() {
        return planesDePago1.values();
    }
/*
    public void setPlanesDePago(ArrayList<Plan> planesDePago) {
        this.planesDePago1 = planesDePago;
    }
*/
    /*
    public Collection<Pago> getPagosContribuyentes() {
        return pagosContribuyentes1.values();
    }*/
/*
    public void setPagosContribuyentes(ArrayList<Pago> pagosContribuyentes) {
        this.pagosContribuyentes = pagosContribuyentes;
    }
*/
    public void addPlan(Plan plan){
        planesDePago1.put(plan.getIdPlan(),plan);
    }
    /*
    public void addPago(Pago pago){
        pagosContribuyentes.add(pago);
    }*/

    //Obtiene Plan a partir de linea de Archivo de texto
    public void obtenerPlan(String linea)
    {
     /* Arrays.stream(linea).map(x->)

        Stream<String> conversion = Arrays.stream(linea);
        ArrayList<String>d;
*/


        //RESOLVER ITERAR CON STREAM
        //VER METODO SPLIRATOR
        String[] result = linea.split(";");
        //no esta mal, pero no se como usarla
   //    Stream<String> convertida = Arrays.stream( linea.split(";"));
    //   convertida.forEach(x-> );

/*

        convertida.map(x->{
            
            String idPlan= result[];
            String nombreContribuyente=result[1] ;
            Double totalDeuda= Double.parseDouble(result[2]);
            int cantidadCuotas= Integer.parseInt(result[3]);
        })*/

        String idPlan= result[0];
        String nombreContribuyente=result[1].toUpperCase() ;
        Double totalDeuda= Double.parseDouble(result[2]);
        int cantidadCuotas= Integer.parseInt(result[3]);
     //   Arrays.stream(result).spliterator();
        planesDePago1.put(idPlan, new Plan(idPlan,nombreContribuyente,totalDeuda,cantidadCuotas));


    }


    public void obtenerPagos(String linea)
    {
        String[] result = linea.split(";");

        int idPago= Integer.parseInt(result[0]);
        Plan plan=getPlan(result[1]);
        int diasMora= Integer.parseInt(result[2]);
        Pago pagoNuevo= new Pago(idPago, plan,diasMora);

        plan.addCuotaPaga(pagoNuevo);
    }


    //Obtener plan con idPlan
    public Plan getPlan(String id){
      /* Boolean plan  = planesDePago
                .stream()
                .anyMatch(x->x.equals(id));*/

    /*    String encontrado1= "encontrado";
        String plan2= planesDePago1.values().stream().filter(x->
                x.getIdPlan().equals(id));
        System.out.println(plan2);
        System.out.println("OBTENGO PLAN");
        System.out.println(planesDePago1.get(plan2));*/
       return planesDePago1.get(id);
    }

    /*
    public Pago getPago(int id){
        return pagosContribuyentes1.get(id);
    }*/

}
