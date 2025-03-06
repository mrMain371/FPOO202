package spartans;

public class Spartanlll  extends Spartan{
    public Spartanlll(String nombre, int salud, String arma, int escudo){
        super(nombre, salud,arma, escudo = 80);
    }
    public void camuflajeActivo(){
        System.out.println(nombre+ "Activo camuflaje para volverse invisible");
    }
}
