import javax.swing.*;
import javax.swing.JOptionPane;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private float peso;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public Envio(String codigoEnvio, String destino, float peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static Envio crearEnvio() {
        try {
            String pesoStr = JOptionPane.showInputDialog(null, "Ingresa el peso del envío:");
            if (pesoStr == null || pesoStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Peso no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            float peso = Float.parseFloat(pesoStr);

            String code = JOptionPane.showInputDialog(null, "Ingresa el código de envío:");
            if (code == null || code.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Código de envío no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            String destino = JOptionPane.showInputDialog(null, "Ingresa el destino del envío:");
            if (destino == null || destino.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Destino no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            return new Envio(code, destino, peso);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número válido para el peso.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

