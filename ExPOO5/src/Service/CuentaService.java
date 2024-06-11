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
import java.lang.Math;

public class CuentaService {


    public Cuenta crearCuenta(){
        Scanner crear = new Scanner(System.in);
        Cuenta obCuenta = new Cuenta(); 
        try {
           
            
            System.out.println("Crear Cuenta ");
            System.out.println("Ingrese el numero de cuenta: ");
            obCuenta.setNumeroCuenta(crear.nextInt());
        
            System.out.println("Ingrese el numero de IDN: ");
            obCuenta.setDNI(crear.nextInt());
            System.out.println("Ingrese la cantidad de dinero en su cuenta : ");
            obCuenta.setSaldoActual(crear.nextDouble());
            
            System.out.println(" Cuenta : "+obCuenta.getNumeroCuenta()+", DNI : "+obCuenta.getDNI()+", Saldo : "+obCuenta.getSaldoActual());
            System.out.println(obCuenta.toString());
        
    } catch (Exception e) {
        System.out.println("ERROR DE TEXTO"+e);
        System.out.println("INGRESO SOLAMENTE NUMEROS ENTEROS POSITVOS");
    }
    return obCuenta;
    }



    public Cuenta miCuenta() {
        int op;
        int evaluar;
        Scanner crear = new Scanner(System.in);
        Cuenta obCuenta= new Cuenta();
        System.out.println("Presiona 1 para Ingresar dinero en tu cuenta");
        System.out.println("Presiona 2 para Retira  dinero de tu cuenta");
        System.out.println("Presiona 3 para ver su informacion");
        System.out.println("Presiona 4 para extraccion rapida de dinero");
        System.out.println("Presiona 5 para Terminar el programa");
        op = crear.nextInt();
        switch (op) {
         
            case 1:
             ingresarDinero(obCuenta);
            break;   
            case 2:
            retirarDinero(obCuenta);
            break;  
            case 3:
            consultarDatos(obCuenta);
            break;
            case 4:
            extraccionRapida(obCuenta);
            break;

            default:
                if (op == 5) {
                    System.out.println("adios");
                } else {
                    System.out.println("Seleccina algo del menu");
                }
                break;
        }

      

        return obCuenta;
    }



    public void ingresarDinero(Cuenta obCuenta) {
        Scanner dinero = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad a agregar a su cuenta");
        double dineroAumentado=dinero.nextDouble();
        double res = obCuenta.getSaldoActual() + dineroAumentado;
        System.out.println("Su saldo es: "+res);
          obCuenta.setSaldoActual(res);
        // return dineroAumentado;
    }




    public double retirarDinero(Cuenta obCuenta) {
        Scanner dinero = new Scanner(System.in);
        System.out.println("Retira la candidad deseada");
        System.out.println("Saldo actual" + obCuenta.getSaldoActual());
        double retirarDinero = dinero.nextDouble();
        if (retirarDinero > obCuenta.getSaldoActual()) {
            System.out.println("accion no valida favor de intentar de nuevo o seleccionar otra opcion");

        } else {

            retirarDinero = obCuenta.getSaldoActual() - retirarDinero;
            
            System.out.println("Saldo actual: " + retirarDinero);
        }
        return retirarDinero;
    }



    public double extraccionRapida(Cuenta obCuenta) {
        double r;
        Scanner p=new Scanner(System.in);

        System.out.println("Extraccion rapida");
        System.out.println("Ingrese  la cantdad menor al 20% a retirar");
        r=p.nextDouble();
        if (r<(obCuenta.getNumeroCuenta()*0.2)) {
            System.out.println("");
            System.out.println("Saldo  actual: "+r);
        } else {
            System.out.println("NO PUEDES ESXTRAER MAS DEL 20% ");
        }
        return r;

    }



    public void consultarSaldo(Cuenta obCuenta) {
        System.out.println("Consulta de saldo");
        System.out.println("tu saldo actual es de : " + obCuenta.getSaldoActual());

    }



    public void consultarDatos(Cuenta ibCuenta) {
        System.out.println("Consulta de datos");
        System.out.println("Numero de cuenta : " + ibCuenta.getNumeroCuenta());
        System.out.println("Numero de DNI : " + ibCuenta.getDNI());
        System.out.println("Saldo Actual : " + ibCuenta.getSaldoActual());

    }
}
