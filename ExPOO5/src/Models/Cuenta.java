// Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
// numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
// Las operaciones asociadas a dicha clase son:
// a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
// b) Agregar los métodos getters y setters correspondientes
package Models;

public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;
    private double interes;
    
    // public int cuentasBancarias[]={123456789,987654321};
    // public int contrasenaBancaria[]={9010010,9432156};
    // public int saldoFijo[]={400,155};

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long dNI) {
        DNI = dNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long DNI, double saldoActual) {

    }

    // public void setDNI(long DNI) {
    //     this.DNI = DNI;
    // }

    // public long getDNI() {
    //     return DNI;
    // }

    // public void setSaldoActual(double saldoActual) {
    //     this.saldoActual = saldoActual;
    // }

    // public double getSaldoActual() {
    //     return saldoActual;
    // }

    // public void setNumeroCuenta(int numeroCuenta) {
    //     this.numeroCuenta = numeroCuenta;
    // }

    // public int getNumeroCuenta() {
    //     return numeroCuenta;
    // }

    @Override
    public String toString() {
        
        return "Numero de cuenta: " + getNumeroCuenta() + ", DNI: " + getDNI() + ", Saldo:" + getSaldoActual()+", Interes: "+getInteres();
    }
}
