import javax.swing.*;

public class Conductor  extends Empleado{
    String licencia;

    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("licencia  =" + licencia);
    }
    @Override
    public void registrarEmpleado() {
        super.registrarEmpleado();
        this.licencia = JOptionPane.showInputDialog("Ingrese el número de licencia del conductor:");

        JOptionPane.showMessageDialog(null,
                "Conductor registrado:\n" );
    }
}
