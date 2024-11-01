public class Jefe extends Empleado {
    private float bono;

    public Jefe(String nombre, double sueldo, float bono, float bono2) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    @Override
    public int calcularDiasDeVacaciones() {
        return 31;
    }

    @Override
    public String toString() {
        return super.toString() + " Bono: " + bono;
    }
}
