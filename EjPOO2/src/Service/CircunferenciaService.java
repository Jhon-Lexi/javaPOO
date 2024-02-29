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
package Service;
import Models.*;
import java.util.Scanner;
import java.lang.Math;

public class CircunferenciaService {
    
    public Circunferencia crearCircunferencia(){
        Scanner cir =new Scanner(System.in);
        Circunferencia rad= new Circunferencia() ;
        System.out.println("ingresa el radio de la circunferencia");
        rad.setRadio(cir.nextDouble());
        return rad;
    }
    public void area(Circunferencia are){
        double area;
        
            
            area=(Math.PI*(are.getRadio()* are.getRadio()));
           System.out.println("Su Area es: "+area);
        
            
        }
            
        
    }
    public void perimetro(Circunferencia per){
        double perimetro=(2*Math.PI*per.getRadio());
        System.out.println("Su Perimetro es: "+perimetro);
    }
}
