package Models;

public class Rectangulo {
    private double altura;
    private double base;
    public Rectangulo(){

    }
    public Rectangulo(double altura,double base){


    }
  
    public  double getBase(){
        return base;
    }
    public void setBase(double base){
       this.base=base;
    }
    
       public  double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
       this.altura=altura;
    }

    
    @Override
    public String toString() {
        
        return "Altura: "+altura+" y base: "+base;
    }
}
