package Service;
import Models.*;
import java.util.Scanner;
public class RectanguloService {
    public Rectangulo crearRectangulo(){
    
            
            Scanner date= new Scanner(System.in);
            Rectangulo valor=new Rectangulo();
            System.out.println("ingresa el valor de la Altura: ");
            valor.setAltura(date.nextDouble());
            System.out.println("Proporcina la base: ");
            valor.setBase(date.nextDouble());
            return valor;
    
        

    }
    public void superficie(Rectangulo area,Rectangulo base){
        double resp=area.getAltura()+base.getBase();
        System.out.println("Elvalor de su superficie es: "+resp);
    }
    public void perímetro(Rectangulo area,Rectangulo base){
        double res=(area.getAltura()+base.getBase())*2;
        System.out.println("ELvalor de su perimetro es: "+res);
    }

    public void trazar(Rectangulo area, Rectangulo base){
        int i,j;
        for(i=1;i<=area.getAltura();i++){
            for(j=1;j<=base.getBase();j++){
                
                if ( (i==1) || (i==area.getAltura())   || (j==1)  || (j==base.getBase()) ) {
                    
                    System.out.print(" $");
                    // System.out.print(" *"+j+","+i);
                    // System.out.println(" ");
                    
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
    }    
    
}
