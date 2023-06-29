package ar.com.vates.segundoPersonasABM.entidades;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    int documento;
    String nombre;
    String apellido;
    int edad;

    private List<Telefono> listTelefonos;

    public Persona(){
        listTelefonos= new ArrayList<>();
    }

    public Persona(int documento, String nombre, String apellido, int edad) {
        this(); //Para llamar al constructor sin parámetros 
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%8d %-15s %-15s %3d", documento, nombre, apellido, edad);
        /*return "Persona{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';*/
    }


}
