import java.util.ArrayList;
import java.util.List;

public class ConjuntoPersonas {
    private Persona cadaPersona;
   // private Persona personaMayor;

    private double promedio;
    private int sumarEdades=0;
    private List<Persona> listaPersonas;

    public Persona getPersona(int i) {
        return listaPersonas.get(i);
    }

    public void setPersona(Persona persona) {
        this.cadaPersona = cadaPersona;
        listaPersonas.add(this.cadaPersona);
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public List<Persona> getListaPersonas() {
        return this.listaPersonas;
    }


    //agregamos personas a la lista
    public void agregarPersona(Persona persona) {
        this.listaPersonas.add(persona);
    }

    //CONSTRUCTOR

    public ConjuntoPersonas() {
        this.listaPersonas = new ArrayList<>();
    }

    public ConjuntoPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = new ArrayList<>();
        this.listaPersonas =listaPersonas;
    }


    //capaz no es necesario
    //total edades
    public double totalEdades(List<Persona> listaPersonas){
        double sumar=0;
        for(int i=0; i<listaPersonas.size(); i++){
            sumar=  listaPersonas.get(i).getEdad();
        }
        return sumar;
    }




    //Edad promedio de las personas
    public double promedioEdades(){

        double sumar=0;
        for(int i=0; i<this.listaPersonas.size(); i++){
            sumar += this.listaPersonas.get(i).getEdad();
        }

        //envolver por si lista es vacía
        double promedio= sumar/ listaPersonas.size();
        return promedio;
    }


    //cantidad de personas con edad mayor al promedio
    public int cantidadMayorPromedio(){
        int cantidad=0;
        double promedio= promedioEdades();
        for(int i=0; i<this.listaPersonas.size(); i++){
            if(this.listaPersonas.get(i).getEdad()> promedio) cantidad++;
        }
        return cantidad;
    }

    public Persona calcularMayor(){

        Persona personaMayor=null;

        for(int i=0; i<this.listaPersonas.size(); i++){
            if(i==0 || this.listaPersonas.get(i).getEdad()>personaMayor.getEdad()) {
                personaMayor= listaPersonas.get(i);
            }
        }
        return personaMayor;
    }

    public Persona calcularMenor(){

        Persona personaMenor=null;

        for(int i=0; i<this.listaPersonas.size(); i++){
            if(i==0 || this.listaPersonas.get(i).getEdad()<personaMenor.getEdad()) {
                personaMenor= listaPersonas.get(i);
            }
        }
        return personaMenor;
    }



    //Buscar lista de personas que coincidan en apellido
    public List<Persona>  listaPorApellido(String apellido){
        List<Persona>  listaPorApellido = null;
        for(Persona i: this.listaPersonas){
            if(i.getApellido()==apellido) {
                System.out.println("Entra" + i);
                listaPorApellido.add(i); ;
            }

        }
        return listaPorApellido;
    }


    @Override
    public String toString() {
        return "ConjuntoPersonas{" +
                "listaPersonas=" + getListaPersonas() +
                '}';
    }

    public int tamanioConjunto(){
        return this.listaPersonas.size();
    }
}
