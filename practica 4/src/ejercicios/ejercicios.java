package ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicios {
public static void ejercicio1(){
    String  str= "luis";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce tu contrasena  : ");
    String pass = scanner.nextLine().trim();
    if (str.toLowerCase().equals(pass.toLowerCase()) ){
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
    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 4) {
            System.out.println("Entrada gratuita.");
        } else if (edad >= 4 && edad <= 18) {
            System.out.println("El precio de la entrada es $110.");
        } else {
            System.out.println("El precio de la entrada es $190.");
        }
    }
    public static void ejercicio4(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu frase : ");
        String frase = scanner.nextLine().trim().toLowerCase().replace(" ", "");
        boolean palindromo = true;
        int j = frase.length()-1;
        for (int i = 0; i<frase.length();i++ , j--){
            char a = frase.charAt(i);
            char b = frase.charAt(j);
            if (a!=b) {
                System.out.println("no es palindromo");
                palindromo = false;
                break;
            }
        }
        if (palindromo)
            System.out.println("es palindromo");

    }
    public static void ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu num : ");
        int num1 =Integer.parseInt(scanner.nextLine()) ;
        System.out.print("Introduce tu num 2: ");
        int num2=Integer.parseInt(scanner.nextLine()) ;
        System.out.println("que operacion deseas, ingresa el simbolo");
        String  a =  scanner.nextLine().trim();
        char c = a.charAt(0);
        switch (c){
            case '+':
                System.out.println(num1+num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("desconozco este operador ");
                break;
        }
    }
}
