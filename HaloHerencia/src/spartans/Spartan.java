package spartans;

import soldado.Soldado;

public class Spartan  extends Soldado {
    private  int escudo;
    Spartan (String nombre,  int salud, String arma, int escudo){
    super(nombre, salud, arma);
        nombre= super.nombre;
      salud = super.salud;
      arma = super.arma;
      escudo =  this.escudo;
    }

    @Override
    public void recibirDano(int dano) {
     if (escudo>0) {
         escudo=escudo-dano;
         if(escudo<=0){
             System.out.println("el escudo fue destruido , recarga uno ");
             super.recibirDano(escudo*-1);
             escudo= 0;
         }
         System.out.println(nombre + "Recibio dano  en el escudo: " + escudo);
     }else{
         super.recibirDano(dano);
     }


    }
    public  void recargarEscudo(int recarga) {
    escudo= 100;
        System.out.println(nombre + "ha recargado su escudo al maximo ");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("escudo: " + escudo);

    }
}
