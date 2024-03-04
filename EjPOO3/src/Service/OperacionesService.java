package Service;
// d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
// en los atributos del objeto.
// e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
// f) Método restar(): calcular la resta de los números y devolver el resultado al main

// g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
// fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
// Si no, se hace la multiplicación y se devuelve el resultado al main
// h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
// una división por cero, el método devuelve 0 y se le informa al usuario el error se le
// informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
//  */
import java.util.Scanner;
import Models .*;

public class OperacionesService {
  
  
  public Operacion crearOperacion(){
    Scanner leer =new Scanner(System.in);
    Operacion dato=new Operacion();
    try {
      
  
        System.out.println("ingresa el primer valor");
        // double x =leer.nextDouble();
        // System.out.println(x);
          dato.setNumero1(leer.nextDouble());
          System.out.println("ingresa el segundo valor");
          dato.setNumero2(leer.nextDouble());
          return dato;
    } catch (Exception e) {
      System.out.println("Error de texto: "+e);
      System.out.println("INGRESE SOLAMENTE NUMEROS DECIMALES O ENTEROS");
      return dato;
    }
    }

    public void Sumar(Operacion num,Operacion number){
      double res;
      res=num.getNumero1()+number.getNumero2();
      System.out.println(num.getNumero1()+"+"+number.getNumero2()+"="+res);
      
    } 
    public void Rest(Operacion num,Operacion number){
      double res=num.getNumero1()-number.getNumero2();
      System.out.println(num.getNumero1()+"-"+number.getNumero2()+"= "+res);
      
    } 
    public void Multiplicar(Operacion num, Operacion number){
      double res;
      if (num.getNumero1()==0 || number.getNumero2()==0) {
        System.out.println("Cualquier numero multiplicaado por 0 da 0");
      } else {
        res=num.getNumero1()*number.getNumero2();
        System.out.println(num.getNumero1()+"*"+number.getNumero2()+"="+res);

      }
        
    } 
    public void Division(Operacion num, Operacion number){
      double res;
      if (number.getNumero2()==0) {
        System.out.println("Indeterminacion debido a la division entre 0");
      } else {
        res=num.getNumero1()/number.getNumero2();
        System.out.println(num.getNumero1()+"/"+number.getNumero2()+"="+res);
        
      }
    }
}
