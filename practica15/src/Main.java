import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        ArrayList<Empleado> empleados = new ArrayList<>();

        String[] opciones = {"Agregar Empleado", "Listar Empleados", "Salir"};

        while (continuar) {
            int opcionMenu = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Sistema de Control",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcionMenu) {
                case 0:
                    agregarEmpleado(empleados);
                    break;

                case 1:
                    listarEmpleados(empleados);
                    break;

                case 2:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
            }
        }
    }

    public static void agregarEmpleado(ArrayList<Empleado> empleados) {
        String[] tipos = {"Empleado", "Conductor", "Administrativo"};
        int tipoEmpleado = JOptionPane.showOptionDialog(
                null,
                "Seleccione el tipo de empleado a agregar",
                "Sistema de Control",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                tipos,
                tipos[0]
        );

        switch (tipoEmpleado) {
            case 0:
                Empleado empleado = new Empleado("", 0, 0.0);
                empleado.registrarEmpleado();
                empleados.add(empleado);
                break;

            case 1:
                Conductor conductor = new Conductor("", 0, 0.0, "");
                conductor.registrarEmpleado();
                empleados.add(conductor);
                break;

            case 2:
                Administrativo administrativo = new Administrativo("", 0, 0.0, "");
                administrativo.registrarEmpleado();
                empleados.add(administrativo);
                break;
        }
    }

    public static void listarEmpleados(ArrayList<Empleado> empleados) {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            return;
        }

        String[] categorias = {"Todos", "Empleados", "Conductores", "Administrativos"};
        int tipoLista = JOptionPane.showOptionDialog(
                null,
                "Seleccione qué tipo de empleados desea listar",
                "Listar Empleados",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                categorias,
                categorias[0]
        );

        StringBuilder empleadosLista = new StringBuilder("Lista de empleados:\n\n");
        StringBuilder conductoresLista = new StringBuilder("Lista de conductores:\n\n");
        StringBuilder administrativosLista = new StringBuilder("Lista de administrativos:\n\n");

        for (Empleado emp : empleados) {
            if (emp instanceof Conductor) {
                conductoresLista.append(emp.toString()).append("\n");
            } else if (emp instanceof Administrativo) {
                administrativosLista.append(emp.toString()).append("\n");
            } else {
                empleadosLista.append(emp.toString()).append("\n");
            }
        }

        switch (tipoLista) {
            case 0:
                JOptionPane.showMessageDialog(null, empleadosLista.toString() + "\n" +
                        conductoresLista.toString() + "\n" + administrativosLista.toString());
                break;
            case 1:
                JOptionPane.showMessageDialog(null, empleadosLista.toString());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, conductoresLista.toString());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, administrativosLista.toString());
                break;
        }
    }
}
