import java.util.ArrayList;
import java.util.Scanner;

public class CorreoNacional {

    private ArrayList<Provincia> conjuntoProvincias;
    private int cantidadProvincias;
    public CorreoNacional() {
        this.conjuntoProvincias = new ArrayList<>();
        this.cantidadProvincias=0;
    }

    public int getCantidadProvincias() {
        return cantidadProvincias;
    }

    public void sumarProvincia() {
        this.cantidadProvincias++;
    }


    public ArrayList<Provincia> getConjuntoProvincias() {
        return conjuntoProvincias;
    }

    public void agregarProvincia(Provincia provincia){
        conjuntoProvincias.add(provincia);
        sumarProvincia();
    }

    public Provincia obtenerProvincia(int num){
        return conjuntoProvincias.get(num);
    }


    public ArrayList getPorProvincia(String provincia){
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

    public ArrayList getCodigoYProvincia(int codigo, String provincia){
        ArrayList<CodigoPostal> conjProvincia= new ArrayList<>();
        conjProvincia= getPorProvincia(provincia);
        ArrayList<CodigoPostal> conjCodigos= new ArrayList<>();
        for(int i=0; i<conjProvincia.size(); i++){
            if(conjProvincia.get(i).getCodigo()==codigo){
             //   System.out.println(conjProvincia.get(i));
                conjCodigos.add(conjProvincia.get(i));
            }
        }
        return conjCodigos;
    }

    public Provincia buscarProvincia(String nombre) {

        for (Provincia p: conjuntoProvincias){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return  "\n" +
                "conjuntoProvincias=" + conjuntoProvincias;
    }

    public ArrayList getLocalidadYProvincia(String localidad, String provincia){
        ArrayList<CodigoPostal> conjProvincia= new ArrayList<>();
        conjProvincia= getPorProvincia(provincia);
        ArrayList<CodigoPostal> conjCodigos= new ArrayList<>();
        for(int i=0; i<conjProvincia.size(); i++){
            if(conjProvincia.get(i).getLocalidad().contains(localidad)){
              //  System.out.println(conjProvincia.get(i));
                conjCodigos.add(conjProvincia.get(i));
            }
        }
        return conjCodigos;
    }


    //IMPRIME NO DEVUELVE, CAMBIAR
    //FILTROPOR LOCALIDAD
    public ArrayList getCodigoPorLocalidad(String localidad){
        ArrayList<CodigoPostal> conjuntoCodigos= new ArrayList<>();
        for(int i=0; i<conjuntoProvincias.size(); i++){
            Provincia provinciaAux= obtenerProvincia(i);
            for (int j=0; j<provinciaAux.getCodigosDeProvincia().size(); j++){
                if(conjuntoProvincias.get(i).getCodigosDeProvincia().get(j).getLocalidad().contains(localidad)){
                  //  System.out.println(provinciaAux.getCodigosDeProvincia().get(j));
                    conjuntoCodigos.add(provinciaAux.getCodigosDeProvincia().get(j));
                }
            }
        }
        return conjuntoCodigos;
    }


}
