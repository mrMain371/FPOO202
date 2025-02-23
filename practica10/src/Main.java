import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int  a= 0;
        String s ="";
        boolean  mayuscula = false;
        boolean  caracteres = false;
        generadorPass gen  =  new generadorPass();
       while (true ){
           String inputLongitud = JOptionPane.showInputDialog(null, "Bienvenido a tu generador de contraseñas, ingresa la longitud:");
           if (inputLongitud == null || inputLongitud.trim().isEmpty()) {
               s  =  gen.GenerarPass(mayuscula,caracteres);
           }

           try {
               a = Integer.parseInt(inputLongitud.trim());
               if (a <= 0) {
                   throw new NumberFormatException();
               }
           } catch (NumberFormatException e) {
               int opcionMayuscula = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Selección", JOptionPane.YES_NO_OPTION);
               mayuscula = (opcionMayuscula == JOptionPane.YES_OPTION);
               int opcionCaracteres = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Selección", JOptionPane.YES_NO_OPTION);
               caracteres = (opcionCaracteres == JOptionPane.YES_OPTION);
               s  =  gen.GenerarPass(mayuscula,caracteres);
               boolean esSegura = gen.segura(s);
               JOptionPane.showMessageDialog(null, "Contraseña generada: " + s + "\nEs segura: " + esSegura);
               continue;
           }
             int opcionMayuscula = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Selección", JOptionPane.YES_NO_OPTION);
            mayuscula = (opcionMayuscula == JOptionPane.YES_OPTION);
           int opcionCaracteres = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Selección", JOptionPane.YES_NO_OPTION);
            caracteres = (opcionCaracteres == JOptionPane.YES_OPTION);
           if(a<=0) {
              s  =  gen.GenerarPass(mayuscula,caracteres);
           }
           else{
                s =  gen.GenerarPass(a,mayuscula,caracteres);
           }
           boolean esSegura = gen.segura(s);
           JOptionPane.showMessageDialog(null, "Contraseña generada: " + s + "\nEs segura: " + esSegura);


       }
    }
}