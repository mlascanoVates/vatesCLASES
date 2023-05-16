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



    public ArrayList getProvincia(String provincia){
        ArrayList<CodigoPostal> conjCodigos= new ArrayList<>();
        for(int i=0; i<conjuntoProvincias.size(); i++){
            Provincia provinciaAux= obtenerProvincia(i);
            if(provinciaAux.getNombre().equals(provincia)){
                conjCodigos=provinciaAux.getCodigosDeProvincia();
                break;
            }
        }
        return conjCodigos;
    }


    public ArrayList<CodigoPostal>  getCodigoYProvincia(int codigo, String provincia){
        ArrayList<CodigoPostal> conjProvincia= new ArrayList<>();
        conjProvincia= getProvincia(provincia);
        ArrayList<CodigoPostal> conjCodigos= new ArrayList<>();
        for(int i=0; i<conjProvincia.size(); i++){
            if(conjProvincia.get(i).getCodigo()==codigo){
                System.out.println(conjProvincia.get(i));
                conjCodigos.add(conjProvincia.get(i));
            }
        }
        return conjCodigos;
    }
    public ArrayList getLocalidadYProvincia(String localidad, String provincia){
        ArrayList<CodigoPostal> conjProvincia= new ArrayList<>();
        conjProvincia= getProvincia(provincia);
        ArrayList<CodigoPostal> conjCodigos= new ArrayList<>();
        for(int i=0; i<conjProvincia.size(); i++){
            if(conjProvincia.get(i).getLocalidad().contains(localidad)){
                System.out.println(conjProvincia.get(i));
                conjCodigos.add(conjProvincia.get(i));
            }
        }
        return conjCodigos;
    }


            //FILTROPOR LOCALIDAD
    public ArrayList obtenerCodigoPorLocalidad(String localidad){
        ArrayList<CodigoPostal> conjuntoCodigos= new ArrayList<>();
        for(int i=0; i<conjuntoProvincias.size(); i++){
            Provincia provinciaAux= obtenerProvincia(i);
            for (int j=0; j<provinciaAux.getCodigosDeProvincia().size(); j++){
                if(conjuntoProvincias.get(i).getCodigosDeProvincia().get(j).getLocalidad().contains(localidad)){
                    System.out.println(provinciaAux.getCodigosDeProvincia().get(j));
                    conjuntoCodigos.add(provinciaAux.getCodigosDeProvincia().get(j));
                }
            }
        }
        return conjuntoCodigos;
    }


}
