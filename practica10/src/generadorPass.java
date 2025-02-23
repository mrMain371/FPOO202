public class generadorPass {
    public String pass;
    public int longitud;
    public boolean mayuscula;
    public boolean caracteres;
    public boolean segura;
    public static int min = 97;
    public static int max = 122;

    public static String GenerarPass(int longitud, boolean mayuscula, boolean caracteres) {
        String s = "";
        if (!mayuscula && !caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = min + (int) (Math.random() * ((max - min) + 1));
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        if (mayuscula && !caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = min + (int) (Math.random() * ((max - min) + 1));
                int temp = (Math.random() <= 0.5) ? 1 : 2;
                if (temp == 1)
                    a = a - 32;
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        if (mayuscula && caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = 65 + (int) (Math.random() * ((125 - 65) + 1));
                int temp = (Math.random() <= 0.5) ? 1 : 2;
                if (temp == 1)
                    a = a - 32;
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        if (!mayuscula && caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = 65 + (int) (Math.random() * ((125 - 65) + 1));
                int temp = (Math.random() <= 0.5) ? 1 : 2;
                if (temp == 1)
                    a = a - 32;
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        return  s;
    }
    public static String GenerarPass( boolean mayuscula, boolean caracteres) {
     int  longitud =8;
       String s = "";
        if (!mayuscula && !caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = min + (int) (Math.random() * ((max - min) + 1));
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        if (mayuscula && !caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = min + (int) (Math.random() * ((max - min) + 1));
                int temp = (Math.random() <= 0.5) ? 1 : 2;
                if (temp == 1)
                    a = a - 32;
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        if (mayuscula && caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = 65 + (int) (Math.random() * ((125 - 65) + 1));
                int temp = (Math.random() <= 0.5) ? 1 : 2;
                if (temp == 1)
                    a = a - 32;
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        if (!mayuscula && caracteres) {
            for (int i = 0; i < longitud; i++) {
                int a = 65 + (int) (Math.random() * ((125 - 65) + 1));
                int temp = (Math.random() <= 0.5) ? 1 : 2;
                if (temp == 1)
                    a = a - 32;
                char b = (char) a;
                s = s + String.valueOf(b);
            }
        }
        return  s;
    }
    public static  boolean segura(String s ){
        boolean resultado = false;
        boolean  numero = false;
        if (s.length()<=14)
            numero = true;

        for (int i = 0; i < s.length(); i++) {
          char x = s.charAt(i);
          if (Character.isUpperCase(x))
              resultado = true;
        }
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (!Character.isAlphabetic(x))
                resultado = true;
        }
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (!Character.isAlphabetic(x))
                resultado = true;
        }


        return (resultado&&numero);
    }
}
