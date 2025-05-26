/**
 * Clase que gestiona un conjunto de empleados.
 * Permite dar de alta empleados, aumentar su salario y mostrar el listado.
 */
public class Empleados {
    /**
     * Array que almacena los empleados.
     */
    public Empleado[] lista;

    /**
     * Constructor de la clase Empleados.
     * @param cantidad Número de empleados a gestionar
     */
    public Empleados(int cantidad) {
        this.lista = new Empleado[cantidad];
    }

    /**
     * Da de alta un empleado en la posición indicada.
     * @param indice Índice en el array
     * @param nombre Nombre del empleado
     * @param puesto Puesto del empleado
     * @param salario Salario del empleado
     */
    public void darDeAltaEmpleado(int indice, String nombre, String puesto, double salario) {
        if (indice >= 0 && indice < lista.length) {
            lista[indice] = new Empleado(nombre, puesto, salario);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por pantalla el listado de empleados.
     */
    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}

