public class Empleados {
     public Empleado[] lista;

    public Empleados(int cantidad) {
        this.lista = new Empleado[cantidad];
    }

    public void darDeAltaEmpleado(int indice, String nombre, String puesto, double salario) {
        if (indice >= 0 && indice < lista.length) {
            lista[indice] = new Empleado(nombre, puesto, salario);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}

