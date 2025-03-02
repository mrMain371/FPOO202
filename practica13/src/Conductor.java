public class Conductor {
    private   String nombre, identificacion, licencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public Conductor(String identificacion, String nombre , String licencia) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.licencia = licencia;
    }
    public  Conductor (){}
}
