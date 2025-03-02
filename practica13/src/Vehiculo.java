import javax.swing.*;

public class Vehiculo {
    private  float capacidad;
    private   String placa, modelo;
    private  Conductor conductor;

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Vehiculo(float capacidad,  String modelo, String placa) {
        this.modelo = modelo;
        this.placa=placa;
        this.capacidad = capacidad;
    }

    public static  void  registrarVehiculo(float capacidad , String modelo, String placa){
      Vehiculo v1 = new Vehiculo(capacidad,modelo,placa);
}
public static  void  asignarConductor( Vehiculo v1, Conductor c1){
     String nombre =JOptionPane.showInputDialog(null, "nombre del conductor a asginar ");
     String  placa = JOptionPane.showInputDialog(null, "placa al vehiculo que se le asignara ");
 if (v1.placa.equals(placa.trim())&& c1.getNombre().equals(nombre)&&(v1.conductor== null)){
     v1.conductor = c1;
    }
}
 public  Vehiculo (){}

}
