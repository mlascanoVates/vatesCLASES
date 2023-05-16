import org.w3c.dom.ls.LSOutput;

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



}