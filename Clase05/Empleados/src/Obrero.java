public class Obrero extends Empleado {
    int diasTrabajados;
    double porcentajeTrabajado;

    public Obrero(String nombre, double sueldo) {
        super(nombre, sueldo);
        porcentajeTrabajado=20;
        setPorcentajeTrabajado(diasTrabajados);
    }

    public Obrero(String nombre, double sueldo, int diasTrabajados) {
        super(nombre, sueldo);
        this.diasTrabajados=diasTrabajados;
        setPorcentajeTrabajado(diasTrabajados);
    }
    public int getDiasTrabajados() {
        return diasTrabajados;
    }
    public void setDiasTrabajados(int diasTrabajados) {
        this.porcentajeTrabajado = diasTrabajados;
    }

    public double getPorcentajeTrabajado() {
        return porcentajeTrabajado;
    }

    public void setPorcentajeTrabajado(int diasTrabajados) {
        porcentajeTrabajado = (double)(diasTrabajados*100/20)/100;
    }

    @Override
    public double getSueldoDelMes(){
        return super.sueldo*getPorcentajeTrabajado();
    }

   @Override
    public String toString() {
        return "Obrero{" +
                super.toString()+ " "+
                ", diasTrabajados= " + diasTrabajados +
                ", porcentajeTrabajado= " + porcentajeTrabajado +
                ", sueldo= " + sueldo +
                '}';
    }


}
