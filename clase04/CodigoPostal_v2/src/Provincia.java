import java.util.ArrayList;

public class Provincia {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String localidades;
    private ArrayList<CodigoPostal> codigosDeProvincia;

    public ArrayList<CodigoPostal> getCodigosDeProvincia() {
        return codigosDeProvincia;
    }

    public void agregarCodigoLocalidad(CodigoPostal LocalidadCompleta) {
        this.codigosDeProvincia.add(LocalidadCompleta);
    }
    public void setCodigosDeProvincia(ArrayList<CodigoPostal> codigosDeProvincia) {
        this.codigosDeProvincia = codigosDeProvincia;
    }

    public Provincia(String nombre) {
        this.nombre = nombre;
        codigosDeProvincia=new ArrayList<>();
    }

    public CodigoPostal busquedaPorLocalidad(String localidad){
        CodigoPostal codigoP=null;
        return codigoP;
    }
     public ArrayList<CodigoPostal> busquedaPorCodigo(int codigo){
        ArrayList<CodigoPostal> localidades= new ArrayList<>();

         for(int i=0; i<this.codigosDeProvincia.size(); i++){
            // System.out.println("Entra metodo");
             if(this.codigosDeProvincia.get(i).getCodigo()==codigo){
              //   System.out.println("Entra metodo1");
                 CodigoPostal cod= new CodigoPostal(this.codigosDeProvincia.get(i).getProvincia(), this.codigosDeProvincia.get(i).getCodigo(),  this.codigosDeProvincia.get(i).getLocalidad());
                // System.out.println(this.codigosDeProvincia.get(i));
                 localidades.add(cod);
             }
         }
        return localidades;
    }
}
