public class ClienteOnline extends Cliente {
    String email, domicilio;


    public ClienteOnline(String nombre, int codigo, String email, String domicilio) {
        super(nombre, codigo);
        this.email = email;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", email= " + email +
                ", domicilio= " + domicilio;
    }

}
