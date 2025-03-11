import javax.swing.*;
import java.util.Random;
import java.util.random.RandomGenerator;

public class GeneradorMatricula {
    private  String nombre, ap,am, carrera;
    private  int ano;

    public GeneradorMatricula(String nombre,String ap,String am,String carrera, int ano ) {
        this.nombre = nombre;
        this.ap = ap;
        this.am = am;
        this.carrera = carrera;
        this.ano = ano;

    }
    public  static  String ano (int a){
        if (a>=2010){
            a= a-2000;
        }
        if(a<2010){
             String b= String.valueOf(a).substring(2,4);
      a =(int)Integer.parseInt(b);
        }
     return String.valueOf(a);
    }
    public  static void generadorMatricula(GeneradorMatricula gen){
        String a,b,c,d,e,f;
        a = gen.carrera.substring(0,3);
          b= "25";
        c = ano(gen.ano);
          d = gen.nombre.substring(0,1);
          e = (gen.ap.substring(0,3)+gen.am.substring(0,3));
          Random  r = new Random();
 int y = r.nextInt();
   if(y<0){
       y = y*-1;
   }
          f = String.valueOf(y).substring(0,3);
        String matricula = a+b+c+d+e+f;
         matricula = matricula.toUpperCase();
        JOptionPane.showMessageDialog(null,"matricula es : "+matricula);
    }
}
