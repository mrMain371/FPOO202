import javax.swing.*;

public class Administrativo extends  Empleado{
    String  departamento;

    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("departamento =" + departamento);
    }
    @Override
    public void registrarEmpleado() {
        super.registrarEmpleado();
        this.departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");

        JOptionPane.showMessageDialog(null,
                "Administrativo registrado:\n" );
    }
}
