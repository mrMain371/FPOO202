import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        Vehiculo v1 = null;
        Conductor c1 = null;
        Envio envio = null;
        Entrega entrega = null;

        do {
            try {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Menú:\n" +
                                "1. Registrar vehículo\n" +
                                "2. Registrar conductor\n" +
                                "3. Asignar vehículo a conductor\n" +
                                "4. Registrar envío\n" +
                                "5. Registrar entrega\n" +
                                "6. Actualizar estado de entrega\n" +22
                                "7. Mostrar información\n" +
                                "8. Salir\n" +
                                "Seleccione una opción:"));

                switch (opcion) {
                    case 1:
                        String placa = JOptionPane.showInputDialog("Ingrese las placas del vehículo:");
                        float capacidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"));
                        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                        v1 = new Vehiculo(capacidad, modelo, placa);
                        JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
                        break;

                    case 2:
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
                        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                        c1 = new Conductor(identificacion, nombre, licencia);
                        JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
                        break;

                    case 3:
                        if (v1 != null && c1 != null) {
                            Vehiculo.asignarConductor(v1, c1);
                            JOptionPane.showMessageDialog(null, "Se asignó el conductor al vehículo correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Registre primero el vehículo y el conductor.");
                        }
                        break;

                    case 4:
                        envio = Envio.crearEnvio();
                        if (envio != null) {
                            JOptionPane.showMessageDialog(null, "Envío registrado exitosamente.");
                        }
                        break;

                    case 5:
                        if (envio != null) {
                            entrega = new Entrega();
                            JOptionPane.showMessageDialog(null, "Entrega registrada con estado 'pendiente'.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Primero debe registrar un envío.");
                        }
                        break;

                    case 6:
                        if (entrega != null) {
                            Entrega.actualizarEstado(entrega);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay ninguna entrega registrada.");
                        }
                        break;

                    case 7:
                        String info = "Información registrada:\n";
                        info += (v1 != null) ? "Vehículo: " + v1.getModelo() + " (" + v1.getPlaca() + ")\n" : "No hay vehículo registrado.\n";
                        info += (c1 != null) ? "Conductor: " + c1.getNombre() + " (ID: " + c1.getIdentificacion() + ")\n" : "No hay conductor registrado.\n";
                        info += (envio != null) ? "Envío a " + envio.getDestino() + " con código " + envio.getCodigoEnvio() + "\n" : "No hay envíos registrados.\n";
                        info += (entrega != null) ? "Entrega registrada con estado: " + entrega.getEstado() + "\n" : "No hay entregas registradas.\n";

                        JOptionPane.showMessageDialog(null, info);
                        break;

                    case 8:
                        continuar = false;
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (continuar);
    }
}
