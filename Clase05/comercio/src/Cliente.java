public class Cliente {
    protected String nombre;
    protected int codigo;


    public Cliente(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", codigo=" + codigo;
    }
}
