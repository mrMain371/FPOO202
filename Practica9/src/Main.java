import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("12345", "Juan Pérez", 30, 5000);
        Cuenta cuenta2 = new Cuenta("67890", "María López", 25, 3000);

        while (true) {
            String a;
            a = JOptionPane.showInputDialog("bienvenido a la caja bienestar  seleccione que operacion  desea realizar con su cuenta " +
                    "1: consultar saldo   " +
                    "2: ingresar enfectivo    " +
                    "3 : retirar efectivo    " +
                    "4: transferir de su cuenta a otra cuenta ");
            int opcion = Integer.parseInt(a);
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, String.valueOf(Cuenta.consultarSaldo(cuenta1)));
                   break;
                case 2:
                    String s, p;
                    Double dinero = Double.parseDouble(s = JOptionPane.showInputDialog("cuanto dinero va a ingresar:"));
                    if (dinero > 0) {
                        Cuenta.ingresarEfectivo(cuenta1, dinero);
                        JOptionPane.showMessageDialog(null, "la operacion se realizo ");
                    }
                    break;
                case 3:
                    Double dinero1 = Double.parseDouble(p = JOptionPane.showInputDialog("cuanto dinero va a retirar:"));
                    if (dinero1 > 0) {
                        boolean exito = Cuenta.retirarEfectivo(cuenta1, dinero1);
                        if (exito) {
                            JOptionPane.showMessageDialog(null, "la operacion se realizo ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "la operacion NO se realizo ");
                        }
                    }
                    break;
                case 4:
                    Double dinero2 = Double.parseDouble(p = JOptionPane.showInputDialog("cuanto dinero va a transferir:"));
                    if (dinero2 > 0) {
                        boolean exito = Cuenta.transferir(cuenta1, cuenta2, dinero2);
                        if (exito) {
                            JOptionPane.showMessageDialog(null, "la operacion se realizo ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "la operacion NO se realizo ");
                        }
                        break;
                    }

            }

        }
    }
}
