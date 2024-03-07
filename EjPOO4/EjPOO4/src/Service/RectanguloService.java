package Service;
import Models.*;
import java.util.Scanner;
public class RectanguloService {
    public Rectangulo crearRectangulo(){
    
            
            Scanner date= new Scanner(System.in);
            Rectangulo valor=new Rectangulo();
            System.out.println("ingresa el valor de la Altura: ");
            valor.setAltura(date.nextDouble());
            System.out.println("Proporcina la altura: ");
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
    
}
