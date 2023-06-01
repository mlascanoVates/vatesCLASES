public class Obrero extends Empleado {
    int diasTrabajados;
    int legajo;

    double porcentajeTrabajado;


    public Obrero(int legajo,String nombre, double sueldo) {
        super(legajo, nombre, sueldo);
        porcentajeTrabajado=20;
        setPorcentajeTrabajado(diasTrabajados);
    }

    public Obrero (int legajo,String nombre,double sueldo, int diasTrabajados){
        super(legajo,nombre, sueldo);
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
