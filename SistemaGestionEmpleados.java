import java.util.Scanner;

public class SistemaGestionEmpleados {


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
