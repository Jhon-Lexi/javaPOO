package Models;

public class Raices {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public Raices(){

    }
    public Raices(double a, double b ,double c){

    }

    
    @Override
    public String toString() {
        
        return "Valor de a:"+a+", Valor de b:"+b+"Valor de c:"+c;
    }

    // public void setA(double a){
    //     this.a=a;
    // }
    // public void setB(double b){
    //     this.b=b;
    // }
    // public void setC(double c){
    //     this.c=c;
    // }
    //  public getA(){
    //     return a;
    //  }
    //  Pu
}
