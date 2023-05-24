import org.w3c.dom.ls.LSOutput;
<<<<<<< HEAD
import java.util.Comparator;
=======

>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

<<<<<<< HEAD
public class ConjuntoPersonas implements Comparator<Persona>  {

=======
public class ConjuntoPersonas {
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e
    private Persona cadaPersona;
   // private Persona personaMayor;

    private double promedio;
    private int sumarEdades=0;
    private ArrayList<Persona> listaPersonas;

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

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }


    //agregamos personas a la lista
    public void agregarPersona(Persona persona) {
        this.listaPersonas.add(persona);
    }

    //CONSTRUCTOR

    public ConjuntoPersonas() {
        this.listaPersonas = new ArrayList<>();
    }

    public ConjuntoPersonas(ArrayList<Persona> listaPersonas) {
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

<<<<<<< HEAD
=======
     @Override
    public String toString() {

        return "ConjuntoPersonas{" +
                "listaPersonas=" + getListaPersonas() +
                '}';
    }
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e

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
<<<<<<< HEAD
/*
    public int compare(Persona p1, Persona p2)
    {
        return p1.getNombre().compareTo(p2.getNombre());
    }*/

/*
     @Override
    public int compareTo(ConjuntoPersonas o) {
        return this.getListaPersonas().compareTo(o.getListaPersonas());
    }*/

    @Override
    public String toString() {

        return "ConjuntoPersonas{" +
                "listaPersonas=" + getListaPersonas() +
                '}';
    }
    public int compare(Persona o,Persona u) {
        int a= o.getApellido().compareTo(u.getApellido());
        if(a==0)
        {return o.getNombre().compareTo(u.getNombre());}
        return o.getApellido().compareTo(u.getApellido());
    }
=======


    //agregar un método que devuelva un arraylist de personas ordenadas por apellido y nombre
    public ArrayList<Persona> getOrdenadasXApellidoYnombre(){
        ArrayList<Persona> nuevaLista=null;

        return nuevaLista;
    }
/*
    public void ordenar(){
        Arrays.sort(this.getListaPersonas());
        int i=0;
        for (Persona p: this.getListaPersonas())
            System.out.println(i);
            i++;
    }*/

/*
    public int compareTo(Integer anotherInteger) {
        return compare(this.value, anotherInteger.value);
    }*/
    /*
    public int comparar(){
        Arrays.sort(getListaPersonas());
    }*/
>>>>>>> a6a9103b9daa421acfe10629e826b63dd0e64e4e

}
