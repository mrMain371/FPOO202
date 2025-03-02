import javax.swing.*;

import javax.swing.JOptionPane;

public class Entrega {
    private String estado;

    public Entrega() {
        this.estado = "pendiente";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String nuevoEstado) {
        if (nuevoEstado.equalsIgnoreCase("transito") || nuevoEstado.equalsIgnoreCase("entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Estado no válido. Usa 'transito' o 'entregado'.");
        }
    }

    public static void actualizarEstado(Entrega entrega) {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (transito/entregado):");

        if (nuevoEstado != null && (nuevoEstado.equalsIgnoreCase("transito") || nuevoEstado.equalsIgnoreCase("entregado"))) {
            entrega.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + entrega.estado);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Estado no válido. Debe ser 'transito' o 'entregado'.");
        }
    }
}
