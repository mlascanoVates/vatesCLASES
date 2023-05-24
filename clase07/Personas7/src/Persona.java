import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Persona {

    private int documento, edad;

    private String nombre, apellido;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona() {

    }

    public Persona(int documento, String nombre, String apellido, int edad) {
        this.documento = documento;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return  "\n" +
                "nombre:" + nombre  +
                ", apellido:" + apellido+
                ", documento:" + documento +
                ", edad:" + edad ;
    }

/*
    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        int a= this.getApellido().compareTo(p.getApellido());
        if(a==0)
        {return this.getNombre().compareTo(p.getNombre());}
        return this.getApellido().compareTo(p.getApellido());
    }*/
    /*
    public int compare(Persona p1, Persona p2)
    {
        return p1.getNombre().compareTo(p2.getNombre());
    }*//*
    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }*/
}