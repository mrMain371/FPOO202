public class Cuenta {
    public String noCuenta;
    public String titular;
    public int edad;
    public double saldo;
    public Cuenta(String noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }
    public static double consultarSaldo(Cuenta cuenta){
      return cuenta.saldo;
    }
    public static void ingresarEfectivo(Cuenta cuenta, double dinero){
        cuenta.saldo += dinero;
    }
    public static  boolean  retirarEfectivo(Cuenta cuenta ,double dinero){
     boolean exito = true;
      if(cuenta.saldo>= dinero)
          cuenta.saldo -= dinero;
      else{
        exito= false;
      }
      return  exito;
    }
    public  static  boolean transferir(Cuenta cuenta1,Cuenta cuenta2 , double monto){
        boolean exito = true;
        if(cuenta1.saldo>= monto) {
            Cuenta.ingresarEfectivo(cuenta2, monto);
            Cuenta.retirarEfectivo(cuenta1, monto);
        }
        else{
            exito= false;
        }
        return  exito;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "edad=" + edad +
                ", noCuenta='" + noCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
