import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        this.listaPersonas =listaPersonas;
    }


    //Edad promedio de las personas
    public double promedioEdades(){
        double promedio=-1;
        double sumar=0;
        for(int i=0; i<this.listaPersonas.size(); i++){
            sumar += this.listaPersonas.get(i).getEdad();
        }

        if(listaPersonas.size()!=0){
            promedio= sumar/ listaPersonas.size();
            return promedio;
        }
        else System.out.println("No se pudo calcular promedio de edades, lista vacía");
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

    //PERSONA MAYOR EDAD
    public Persona calcularMayor(){
        Persona personaMayor=null;

        for(int i=0; i<this.listaPersonas.size(); i++){
            if(i==0 || this.listaPersonas.get(i).getEdad()>personaMayor.getEdad()) {
                personaMayor= listaPersonas.get(i);
            }
        }
        return personaMayor;
    }


    //PERSONA MENOR EDAD
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
    public ArrayList<Persona>  listaPorApellido(String apellido){
        ArrayList<Persona>  listaPorApellido = new ArrayList<>();
        for(Persona i: this.listaPersonas){
            if(i.getApellido().equals(apellido)) {
               listaPorApellido.add(i);
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

    public ConjuntoPersonas crearConjunto(Scanner sc){

        ConjuntoPersonas conjunto=new ConjuntoPersonas();
        while(sc.hasNext()){
            int documento= sc.nextInt();
            String nombre= sc.next();
            String apellido= sc.next();
            int edad= sc.nextInt();

            Persona Persona= new Persona(documento, nombre, apellido, edad);
            conjunto.agregarPersona(Persona);
        }
        return conjunto;
    }

}
