// c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
// d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
// y se la sumara a saldo actual.
// e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
// la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
// pondrá el saldo actual en 0.
// f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
// usuario no saque más del 20%.
// g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
// h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package Service;

import Models.*;
import java.util.Scanner;
// import java.lang.Math;

public class CuentaService {

    Scanner leerDato = new Scanner(System.in);
    Cuenta dato = new Cuenta();
    public void ingresarDatos(){
        try {

            
            System.out.println("Cuenta Bancaria");
            System.out.println("Ingresar Numero de cuenta");
            dato.setNumeroCuenta(leerDato.nextInt());
            System.out.println("ingresar DNI");
            dato.setDNI(leerDato.nextLong());
            System.out.println("Ingresar Saldo");
            dato.setSaldoActual(leerDato.nextDouble());
            System.out.println("Ingresar Interes");
            dato.setInteres(leerDato.nextDouble());
            // System.out.println("ELnumero de cuentas es"+dato.getNumeroCuenta());
            menu();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void menu(){
        Scanner date=new Scanner(System.in);
        // CuentaBancaria dato=new CuentaBancaria();
        try {
            int num;
            do {
                
                System.out.println("MENU");
                System.out.println("Presiona 1 para ver tus datos");
                System.out.println("Presiona 2 para ver tu saldo ");
                System.out.println("Presiona 3 para ingresar saldo ");
                System.out.println("Presiona 4 para retirar saldo ");
                System.out.println("Presiona 5 para retirar  el 20% de saldo ");
                System.out.println("Presiona 6 para terminar el programa ");
                 num =date.nextInt();
                switch (num) {
                    case 1:
                        consultardatos();
                        break;
                    case 2:
                        verSaldo();
                        break;
                    case 3:
                        ingresarDinero();
                        break;  
                    case 4:
                        retirarDinero();
                        break;   
                    case 5:
                        extraccionRapida();
                        break;   
                    default:
                    if (num==6) {
                        System.out.println("Hasta Pronto");
                    } else {
                        System.out.println("Intente de Nuevo");
                        
                    }
                        break;
                }
            } while (num !=6);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void consultardatos(){
       
        System.out.println("Numero de Cueta: "+dato.getNumeroCuenta());
        System.out.println("DNI: "+dato.getDNI());
        System.out.println("Saldo Actual: "+dato.getSaldoActual());
        System.out.println("Interes: "+dato.getInteres());

        // System.out.println(dato.toString());
    }

    public void verSaldo(){
       
       
        System.out.println("Saldo Actual: "+dato.getSaldoActual());
        // System.out.println(dato.toString());
    }

    public void ingresarDinero(){
        double res,adicion;
        System.out.println("Ingrese la cantidad a agregar a su cuenta");
        adicion=leerDato.nextInt();
         res = dato.getSaldoActual() + adicion;
         dato.setSaldoActual(res);
        System.out.println("Su saldo es: "+dato.getSaldoActual());
    }

    public void retirarDinero(){
        double res,sustracion;
        System.out.println("Ingrese la cantidad a agregar a su cuenta");
        sustracion=leerDato.nextInt();
        if (sustracion > dato.getSaldoActual()&&sustracion>0) {
            res = dato.getSaldoActual() - sustracion;
            dato.setSaldoActual(res);
           System.out.println("Su saldo es: "+dato.getSaldoActual());
            
        } else {
            System.out.println("No Puede Retirar Mas de su Cuenta");
        }
    }

    public void extraccionRapida(){
        double res,sustracion;
        System.out.println("Ingrese la cantidad a retirar de su cuenta que sea menor o igual al  20%");
        sustracion=leerDato.nextInt();
        if (sustracion < (dato.getSaldoActual()*.2) && sustracion>0) {
            res = dato.getSaldoActual() - sustracion;
            dato.setSaldoActual(res);
           System.out.println("Su saldo es: "+dato.getSaldoActual());
            
        } else {
            System.out.println("Solo puede Retirar el 20% o menos de su saldo");
        }
    }
}
