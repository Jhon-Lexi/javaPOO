/*
 una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acCreaierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Service;
import Models.*;
import java.util.Scanner;
public class ServiceMes {
    public void menu(){
       try {
        int op;
        Scanner crear=new Scanner(System.in);
         do {
            System.out.println("Adivina el mes secreto");    
            System.out.println("Presiona la tecla indicada para interactuar con el menu");    
            System.out.println("Presiona 1 para empezar programa");    
            System.out.println("Presiona 2 para cerrar programa");   
            op=crear.nextInt();
            switch (op) {
                case 1:
                
                Mes dato=new Mes() ;
                System.out.println(dato);
                dato.crearMes();
                
                    
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
       } catch (Exception e) {
        System.out.println("Error de texto intente nuevamente");
        // TODO: handle exception
       }

    }
    
}
