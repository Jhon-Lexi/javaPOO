/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

import java.net.Socket;
import java.util.Scanner;
import Service.*;
import Models.*;

public class App {
    public static void main(String[] args) throws Exception {

            
            try {
                int op;
                do {
                    Scanner crear = new Scanner(System.in);
                    CuentaService datos = new CuentaService();
                    Cuenta obCuenta = new Cuenta();
                    CuentaService nuevo = new CuentaService();
                    System.out.println("Cuenta Bancaria");
                    System.out.println("Presiona la tecla indicada para interactuar con el menu");
                    System.out.println("Presiona 1 para empezar a Proporcinar su cuenta");
                    // System.out.println("Presiona 2 para empezar a Crear su cuenta");
                    System.out.println("Presiona 3 para cerrar programa");
                    op = crear.nextInt();
                    switch (op) {
                        case 1:
                        datos.ingresarDatos();
                        case 2:
                            // nuevo.crearCuenta();
    
                            break;
    
                        default:
                            if (op == 3) {
                                System.out.println("adios");
                            } else {
                                System.out.println("Seleccina algo del menu");
                            }
                            break;
                    }
                } while (op != 3);
            } catch (Exception e) {
                System.out.println("Error de texto intente nuevamente");
                // TODO: handle exception
            }
        

    }
}
