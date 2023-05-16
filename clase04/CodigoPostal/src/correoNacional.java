import java.util.ArrayList;

public class correoNacional {

    ArrayList<Provincia> conjuntoProvincias;

    public correoNacional() {
        this.conjuntoProvincias = new ArrayList<>();
    }

    public ArrayList<Provincia> getConjuntoProvincias() {
        return conjuntoProvincias;
    }

    public void agregarProvincia(Provincia provincia){
        conjuntoProvincias.add(provincia);
    }

    public Provincia obtenerProvincia(int num){
        return conjuntoProvincias.get(num);
    }

    public ArrayList obtenerCodigoPorLocalidad(String localidad){

        for(int i=0; i<conjuntoProvincias.size(); i++){
            Provincia provinciaAux= obtenerProvincia(i);
            for (int j=0; j<provinciaAux.getCodigosDeProvincia().size(); j++){
                if(conjuntoProvincias.get(i).getCodigosDeProvincia()..contains(localidad)){
                    System.out.println(provCatamarca.get(i));
                }
            }
        }
        for(int i=0; i<provCordoba.size(); i++){
            if(provCordoba.get(i).getLocalidad().contains(parteLocalidad2)){
                System.out.println(provCordoba.get(i));
            }

        }

    }
}
