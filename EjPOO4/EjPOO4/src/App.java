/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
import Models.*;
import Service.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        String lp;
        Scanner leerDato=new Scanner(System.in);
        System.out.println("Presiona cualquier tecla  y despues enter para iniciar");
        
        lp=leerDato.nextLine();
       
        
        menu();
    }
    static public void menu(){
      try {
        int op;
        
        Scanner leerDato=new Scanner(System.in);
          
          do {
            
            System.out.println("Programa para obtener la superficie y el perimetro de un rectangulo");
            System.out.println("Selecciona una opcio del menu");
            System.out.println("Presiona la tecla 1 para obtener la superficie y el perimetro de un rectangulo");
            System.out.println("Presiona la tecla 2 para Salir");
            op=leerDato.nextInt();
            switch (op){
              case 1:
              RectanguloService lee=new RectanguloService();
              Rectangulo dato=lee.crearRectangulo();
              System.out.println(dato);
              if (dato.getBase()>0 && dato.getAltura()>0) {
                if (dato.getAltura()==dato.getBase()) {
                  System.out.println("ESTO es un cuadrado");
                } else {
                  lee.perímetro(dato,dato);
                  
                  lee.superficie(dato, dato);
                  lee.trazar(dato, dato);
                }
              } else {
                System.out.println("Solo se aceptan numeros positivos");
              }
              break;
             
            
              default:
              if (op==5) {
                System.out.println("Hasta Pronto");
              } else {
                System.out.println("Selecciona algo del menu");
              }
                break;
            }
          } while (op!=2);
        } catch (Exception e) {
          System.out.println("Error de texto"+e);
        }
  
      }
}
