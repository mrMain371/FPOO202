package ejercicios;

import java.util.Scanner;

public class ejercicios {
public static void ejercicio1(){
    String  str= "luis";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce tu contrasena  : ");
    String pass = scanner.nextLine().trim();
    if (str.toLowerCase()== pass.toLowerCase()){
        System.out.println("acceso concedido");
    }
    else{
        System.out.println("acceso denegado");
    }

}
    public static void ejercicio2(){
      int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu numero  : ");
      if ((scanner.nextInt()%2)==0) {
          System.out.println(" es par");
      }
      else{
          System.out.println("es impar");
      }
    }
}
