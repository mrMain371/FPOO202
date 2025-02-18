public class Spartan {
public  String nombre ,armaPrincipal;
public  int  salud, escudo;

    @Override
    public String toString() {
        return "Spartan{" +
                "nombre='" + nombre + '\'' +
                ", armaPrincipal='" + armaPrincipal + '\'' +
                ", salud=" + salud +
                ", escudo=" + escudo +
                '}';
    }

    public  void  mostrarInf0(){
        System.out.println(toString());

}
    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo + " con " + armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restantes = 10;
        int total = restantes + municiones;
        System.out.println(armaPrincipal + " ahora tiene disponible "+ total + " balas");
    }

    public void correr(boolean status){
        if (status){
            System.out.println(nombre+" esta corriendo");
        }else{
            System.out.println(nombre+ " se detuvo");
        }
    }
    public Spartan(String nombre, String armaPrincipal, int salud, int escudo) {
        this.nombre = nombre;
        this.armaPrincipal = armaPrincipal;
        this.salud = salud;
        this.escudo = escudo;
    }

}

