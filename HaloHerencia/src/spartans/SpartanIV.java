package spartans;

public class SpartanIV extends Spartan {
    public SpartanIV(String nombre, int salud, String arma, int escudo){
        super(nombre, salud,arma, escudo = 150);
    }

    public void usarpropulsores() {
        System.out.println(nombre + "esta usando propulsores ");
    }
}
