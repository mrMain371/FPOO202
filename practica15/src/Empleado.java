import javax.swing.*;

public class Empleado {
    private  String  nombre;
    int id;
    double salario;

    public Empleado(String nombre,int id , double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    public void registrarEmpleado() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");

        boolean idValido = false;
        while (!idValido) {
            try {
                this.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
                idValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el ID.");
            }
        }

        boolean salarioValido = false;
        while (!salarioValido) {
            try {
                this.salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));
                salarioValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el salario.");
            }
        }

        JOptionPane.showMessageDialog(null,
                "Empleado registrado:\n" +
                        "Nombre: " + nombre + "\n" +
                        "ID: " + id + "\n" +
                        "Salario: $" + salario);
    }
 public  void mostrarInfo(){
     System.out.println(toString());
 }
    @Override
    public String toString() {
        return "empleado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                '}';
    }
}
