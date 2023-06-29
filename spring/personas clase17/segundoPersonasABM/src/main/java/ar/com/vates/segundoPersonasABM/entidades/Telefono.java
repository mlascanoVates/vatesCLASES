package ar.com.vates.segundoPersonasABM.entidades;

public class Telefono {
    private String numero; //es string xq es un numero largo, y a veces necesitamos agregar parentesis
    private String tipo; //movil,fijo descripción


    //Para usar requestBody, constructor sin parámetro
    public Telefono() {
    }

    public Telefono(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
