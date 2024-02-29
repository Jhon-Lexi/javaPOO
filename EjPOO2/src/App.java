/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */

import Models.*;
import Service.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int op;
        Scanner crea=new Scanner(System.in);
         do {
            System.out.println("Programa que Calcula el Area y el Perimetro de una Circunferencia");    
            System.out.println("Presiona la tecla indicada para interactuar con el menu");    
            System.out.println("Presiona 1 para empezar programa");    
            System.out.println("Presiona 2 para cerrar programa");   
            op=crea.nextInt();
            switch (op) {
                case 1:
                CircunferenciaService leer= new CircunferenciaService();
                Circunferencia dato=leer.crearCircunferencia();
                System.out.println(dato);
                leer.area(dato);
                leer.perimetro(dato);
                    
                    break;
            
                default:
                if (op==2) {
                    System.out.println("adios");
                } else {
                    System.out.println("Seleccina algo del menu");
                }
                    break;
            } 
         } while (op!=2);
    //   void ares=leer.area(dato);
      
    }
}
