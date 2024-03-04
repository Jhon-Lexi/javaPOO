/*
  Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
import Models.*;
import Service.OperacionesService;

import java.security.Provider.Service;
import java.util.Scanner;
import Service.*;
public class App {
    public static void main(String[] args) throws Exception {
      String j;
      Scanner ip=new Scanner(System.in);
      System.out.println("Presiona cualquier tecla para iniciar");
      
      j=ip.nextLine();
     
      
      menu();
     

    }
    static public void menu(){
      int op;
      
      Scanner leerDato=new Scanner(System.in);
      try {
        
        do {
          
          System.out.println("Programa para solucionar problemas matematicos");
          System.out.println("Selecciona una opcio del menu");
          System.out.println("Presiona la tecla 1 para realizar una suma");
          System.out.println("Presiona la tecla 2 para realizar una resta");
          System.out.println("Presiona la tecla 3 para realizar una division");
          System.out.println("Presiona la tecla 4 para realizar una multiplicacion");
          System.out.println("Presiona la tecla 5 para Salir");
          op=leerDato.nextInt();
          switch (op){
            case 1:
            OperacionesService lee=new OperacionesService();
            Operacion dato=lee.crearOperacion();
            System.out.println(dato);
            lee.Sumar(dato,dato);
            break;
            case 2:
            OperacionesService lee1=new OperacionesService();
            Operacion dato1=lee1.crearOperacion();
            lee1.Rest(dato1, dato1);
            break;
            case 3:
            OperacionesService lee2=new OperacionesService();
            Operacion dato2=lee2.crearOperacion();
            lee2.Division(dato2,dato2);
            break;
            case 4:
            OperacionesService lee3=new OperacionesService();
            Operacion dato3=lee3.crearOperacion();
              lee3.Multiplicar(dato3, dato3);
              break;
          
            default:
            if (op==5) {
              System.out.println("Hasta Pronto");
            } else {
              System.out.println("Selecciona algo del menu");
            }
              break;
          }
        } while (op!=5);
      } catch (Exception e) {
        System.out.println("Error de texto"+e);
      }

    }
}
