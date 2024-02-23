//  Método getDiscriminante(): devuelve el valor del discriminante (double). El
// discriminante tiene la siguiente formula: (b^2)-4*a*c
//  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
// que esto ocurra, el discriminante debe ser mayor o igual que 0.
//  Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
// que esto ocurra, el discriminante debe ser igual que 0.
//  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
// posibles soluciones.
//  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
// Es en el caso en que se tenga una única solución posible.
//  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
// pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
// obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
// de no existir solución, se mostrará un mensaje.

package Service;

import Models.*;
import java.util.Scanner;
import java.lang.Math;

public class RaicesService {
    public Raices crearEcuacion() {
        Scanner valor = new Scanner(System.in);
        Raices objRaices = new Raices();
        System.out.println("INtroduce el valor del a");
        objRaices.setA(valor.nextDouble());
        System.out.println("INtroduce el valor del b");
        objRaices.setB(valor.nextDouble());

        System.out.println("INtroduce el valor del c");
        objRaices.setC(valor.nextDouble());

        return objRaices;
    }

    public double getDiscriminante(Raices objRaices) {

        double res = (objRaices.getB() * objRaices.getB()) - 4 * objRaices.getA() * objRaices.getC();

        return res;

    }

    public boolean tieneRaices(Raices objRaices) {
        boolean res = true;
        if (getDiscriminante(objRaices) >= 0) {
            System.out.println("Tiene dos raices ");

            return res;
        }
        return false;

    }

    public boolean tieneRaiz(Raices lip) {
        boolean uni = true;
        if (getDiscriminante(lip) == 0) {
            System.out.println("tiene una solucion");
            return uni;
        }
        return false;
    }

    public void obtenerRaices(Raices objRaices) {
     
        if (tieneRaices(objRaices)) {
            double r1 = (-objRaices.getB()
            + Math.sqrt(objRaices.getB() * objRaices.getB() - (4 * objRaices.getA() * objRaices.getC()))) / 2
            * objRaices.getA();
            double r2 = (-objRaices.getB()
            - Math.sqrt(objRaices.getB() * objRaices.getB() - (4 * objRaices.getA() * objRaices.getC()))) / 2
            * objRaices.getA();
            
            System.out.println("Valor 1: " + r1);
            System.out.println("Valor 2: " + r2);
        }
        

    }

    public void obtenerRaiz(Raices objRaiz){
       
        if (tieneRaiz(objRaiz)) {
            double r3= (-objRaiz.getB()+Math.sqrt(objRaiz.getB()*objRaiz.getB()-(4*objRaiz.getA()*objRaiz.getC())))/2*objRaiz.getA();
            System.out.println("solucion de obtener raiz"+r3);
        };
    }

    public void calcular(Raices op){
        if (tieneRaices(op)) {
            obtenerRaices(op);
        } else if(tieneRaiz(op)){
            obtenerRaiz(op);
            
            
        }else{
            System.out.println("No hay solucion");
        }

        // obtenerRaices(op);
        // obtenerRaiz(op);

    }
}
