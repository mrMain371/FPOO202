package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void ejercicio2(){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("dime un numero entre   200 y 400");
        int a = scanner.nextInt();
        if(a < 200 || a > 400) {
            System.out.println("numero invalido vuelve a correr el programa");
        }
        else {
            for (int i = a; i <=400 ; i++) {
            if(i%2==0)
                System.out.println(i);
            }
        }
    }
}
