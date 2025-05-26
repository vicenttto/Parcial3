import java.util.Scanner;

/**
 * Clase principal que gestiona el sistema de empleados.
 * Permite dar de alta empleados, aumentar su salario y mostrar el listado.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal que ejecuta la aplicación de gestión de empleados.
     * @param args Argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.darDeAltaEmpleado(0, "Juan", "Desarrollador", 50000);
        empleados.darDeAltaEmpleado(1, "María", "Diseñadora", 45000);
        empleados.darDeAltaEmpleado(2, "Pedro", "Gerente", 60000);


        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INTRODUCE_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();

        scanner.close();
       
    }
}
