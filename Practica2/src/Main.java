//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//zona de importacion
// clase principal
public class Main {
    //metodo main
    public static void main(String[] args) {

String cadena= "luis"+ "cesar"+ "garduno "+ "valle";
//imprimimos
        System.out.println(cadena);
        //contamos
        System.out.println(cadena.length());
        //cortamos segun el indice
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));

        //variables
        String cadena1 = "333",cadena2,cadena3;
        //convertir cadena a int
        int entero1 = Integer.parseInt(cadena1);
        System.out.println(entero1);
        //convertir double a int
        double decimal =7.7;
       int entero3=(int)decimal;
        System.out.println(entero3);
cadena2= String.valueof(decimal);
        System.out.println(cadena2);
        //5. Boolean, operadores logico y de comparacion

        //Los operadores logicos siempre devuelven un resultado booleano
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        int x= 3;
        System.out.println(x< 5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x< 5 && x>10));
        System.out.println(!(x<5 || x>10));
    }
}