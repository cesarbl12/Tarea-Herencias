import java.util.ArrayList;

public class ControlEmpleados {
    private ArrayList<Empleado> misEmpleados;

    public ControlEmpleados() {
        misEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado em) {
        misEmpleados.add(em);
    }

    public String mostrarTodosLosEmpleados() {
        StringBuilder cadena = new StringBuilder();
        misEmpleados.forEach(e -> cadena.append(e.toString()).append("\n"));
        return cadena.toString();
    }

    public String mostrarDiasDeVacaciones() {
        StringBuilder cadena = new StringBuilder();
        misEmpleados.forEach(e -> cadena.append(e.getNombre())
                .append(" tiene ")
                .append(e.calcularDiasDeVacaciones())
                .append(" días de vacaciones.\n"));
        return cadena.toString();
    }

    public String mostrarEmpleadosOrdenadosPorNombre() {
        misEmpleados.sort((e1, e2) -> e1.getNombre().compareToIgnoreCase(e2.getNombre()));
        return mostrarTodosLosEmpleados();
    }

    public String mostrarEmpleadosOrdenadosPorSueldo() {
        misEmpleados.sort((e1, e2) -> Double.compare(e2.getSueldo(), e1.getSueldo()));
        return mostrarTodosLosEmpleados();
    }
}
