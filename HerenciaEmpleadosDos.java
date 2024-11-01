import java.util.Scanner;

public class HerenciaEmpleadosDos {
    public static void main(String[] args) {
        int opc;
        Scanner input = new Scanner(System.in);
        ControlEmpleados ce = new ControlEmpleados();

        do {
            System.out.println("1. Registrar empleado.");
            System.out.println("2. Mostrar todos los empleados.");
            System.out.println("3. Mostrar días de vacaciones.");
            System.out.println("4. Mostrar empleados ordenados por nombre.");
            System.out.println("5. Mostrar empleados ordenados por sueldo.");
            System.out.println("6. Salir.");
            System.out.print("Selecciona una opción: ");
            opc = input.nextInt();
            input.nextLine(); // Limpiar el buffer

            switch (opc) {
                case 1:
                    System.out.println("Seleccione el tipo de empleado a registrar:");
                    System.out.println("1. Jefe");
                    System.out.println("2. Auxiliar");
                    int tipoEmpleado = input.nextInt();
                    input.nextLine(); // Limpiar el buffer

                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Sueldo: ");
                    double sueldo = input.nextDouble();
                    System.out.print("Años de antigüedad: ");
                    int antiguedad = input.nextInt();

                    if (tipoEmpleado == 1) {
                        System.out.print("Bono: ");
                        float bono = input.nextFloat();
                        Jefe jefe = new Jefe(nombre, sueldo, antiguedad, bono);
                        ce.agregarEmpleado(jefe);
                    } else if (tipoEmpleado == 2) {
                        input.nextLine(); // Limpiar buffer
                        System.out.print("Area: ");
                        String area = input.nextLine();
                        System.out.print("Asistencias: ");
                        int asistencias = input.nextInt();
                        Auxiliar auxiliar = new Auxiliar(nombre, sueldo, antiguedad, area, asistencias);
                        ce.agregarEmpleado(auxiliar);
                    }
                    break;
                case 2:
                    System.out.println(ce.mostrarTodosLosEmpleados());
                    break;
                case 3:
                    System.out.println(ce.mostrarDiasDeVacaciones());
                    break;
                case 4:
                    System.out.println(ce.mostrarEmpleadosOrdenadosPorNombre());
                    break;
                case 5:
                    System.out.println(ce.mostrarEmpleadosOrdenadosPorSueldo());
                    break;
                case 6:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opc != 6);

        input.close();
    }
}
