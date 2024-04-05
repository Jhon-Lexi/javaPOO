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
package Models;

import java.util.Scanner;

public class Mes {
    private String meses[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
    "octubre", "novienmbre", "diciembre" };
    private String mesSecreto= meses[11];
    private String mesProporcionado="";
    public Mes() {

    }

    public Mes(String meses) {
    }



    public String getMes() {
        return mesProporcionado;
    }

    public void setMes(String mesProporcionado) {
        this.mesProporcionado = mesProporcionado;

    }
    public String getmesSecreto(){
        return mesSecreto;
    }

   public Mes crearMes(){ 
    
        Scanner leerDato = new Scanner(System.in);
        Mes secreto= new Mes();
        System.out.println("ingresa el el nombre del mes en minusculas");
        secreto.setMes(leerDato.next());
        // dato=leerDato.nextLine();
        secreto.comparar(secreto);
        // System.out.println(dato);
        return secreto;
    }
    public void comparar(Mes fecha){
        String meses[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
    "octubre", "noviembre", "diciembre" };
       String mesSecreto= meses[11];
        // System.out.println(fecha);
        // System.out.println(fecha.getMes());
        // System.out.println(mesSecreto);
        // System.out.println(mesSecreto.equals(fecha.getMes()));
        if (fecha.getMes().equals(mesSecreto)) {
            System.out.println("Felicidades a caba de descubrir el mes secreto");
            
        } else {
            System.out.println("Siga intentando para descubrir el mes secreto");
        }
    }
    @Override
    public String toString() {

        // TODO Auto-generated method stub
        return "Mes Proporcionado: " +mesProporcionado;
    }

}
