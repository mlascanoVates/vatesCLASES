public class ClienteLocal extends Cliente {
    private int sucursalPreferida;

    public ClienteLocal(String nombre, int codigo, int sucursalPreferida) {
        super(nombre, codigo);
        this.sucursalPreferida = sucursalPreferida;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", sucursalPreferida= " + sucursalPreferida;
    }
}
