import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  String nombre , ap,am,carrera;
  int ano;
  nombre = JOptionPane.showInputDialog(null, "dime tu nombre ");
        ap = JOptionPane.showInputDialog(null, "dime tu apellido apellido paterno ");
       am= JOptionPane.showInputDialog(null, "dime tu apellido materno ");
        carrera = JOptionPane.showInputDialog(null, "dime tu carrera ");
        ano  = (int)Integer.parseInt(JOptionPane.showInputDialog(null, "dime tu  ano de nacimiento ")) ;
  GeneradorMatricula  gen = new GeneradorMatricula(nombre,ap,am,carrera,ano);
  GeneradorMatricula.generadorMatricula(gen);
    }
}