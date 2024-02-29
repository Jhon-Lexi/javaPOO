package Models;
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
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio){
        
    
    }

    public Circunferencia(){
        
    }

    public  double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        if (radio>0) {
            
            this.radio=radio;
        }
        System.out.println("Nose acepta numeros negativos");
    }

    
    @Override
    public String toString() {
        if (radio>0) {
            
            return "el valor del radio es :"+radio;
        }
            return "no tiene solucion";
        
    }
}
