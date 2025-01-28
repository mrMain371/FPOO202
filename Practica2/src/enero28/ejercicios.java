package enero28;

import java.util.Scanner;

public class ejercicios {
    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas: ");
        double horas = scanner.nextDouble();
        System.out.print("Introduce el coste por hora: ");
        double coste = scanner.nextDouble();
        double paga = horas * coste;
        System.out.println("La paga correspondiente es: " + paga);

    }
    public static void ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre  : ");
        String nombre = scanner.nextLine().trim();
        System.out.print("Introduce tu apellido paterno  : ");
        String ap = scanner.nextLine().trim();
        System.out.print("Introduce tu apellido materno  : ");
        String am = scanner.nextLine().trim();
        String  nombreC = nombre+" "+ ap+" "+am;
        System.out.println(nombreC.toLowerCase());
        System.out.println(nombreC.toUpperCase());
        System.out.println(nombre.substring(0,1).toUpperCase()+nombre.substring(1 )+ " "+ap.substring(0,1 ).toUpperCase()+ap.substring(1)+" "+am.substring(0,1 ).toUpperCase()+am.substring(1));


    }
    public static  void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un entero X: ");
        int X = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= X; i++) {
            suma += i;
        }
        System.out.println("La suma de 1 a " + X + " es: " + suma);

    }
    public static void ejercicio4 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "tu nombre por favor");
        String nombre = scanner.nextLine().trim();
        System.out.println(nombre.toUpperCase());
        System.out.println( "tu nombre tiene  "+nombre.replace(" ","").length() + " caracteres");
    }
    public static void ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de payasos vendidos: ");
        int pay = scanner.nextInt();
        System.out.print("Número de muñecas vendidas: ");
        int mun = scanner.nextInt();
        int pesoTotal = pay * 112 + mun * 75;
        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos");
    }
    public static void ejercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "tu frase por favor");
        String nombre = scanner.nextLine().trim();
        String reverso =  new StringBuilder(nombre).reverse().toString();
        System.out.println(reverso);
    }

}
