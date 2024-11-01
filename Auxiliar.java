public class Auxiliar extends Empleado {
    private String area;
    private float bonoPorAsistencia;
    private int asistencias;

    public Auxiliar(String nombre, double sueldo, int antiguedad, String area, int asistencias) {
        super(nombre, sueldo);
        this.area = area;
        this.asistencias = asistencias;
    }

    public float calcularBonoPorAsistencia() {
        switch (asistencias) {
            case 20:
                bonoPorAsistencia += 500;
                break;
            case 25:
                bonoPorAsistencia += 750;
                break;
            case 30:
                bonoPorAsistencia += 1000;
                break;
        }
        return bonoPorAsistencia;
    }

    @Override
    public String toString() {
        return super.toString() + " Área: " + area + " Bono por asistencia: " + calcularBonoPorAsistencia();
    }
}
