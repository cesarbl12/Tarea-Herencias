public class Empleado {
    protected String nombre;
    protected double sueldo;
    static long id;
    static long idActual = 0;
    protected int antiguedad;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
        this.id = idActual++;
    }

    public int calcularDiasDeVacaciones() {
        if (antiguedad < 2) return 12;
        if (antiguedad < 10) return 14;
        if (antiguedad < 15) return 18;
        return 25;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Nombre: " + nombre + " Salario: " + sueldo;
    }
}
