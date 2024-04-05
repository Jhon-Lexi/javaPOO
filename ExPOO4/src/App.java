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

import Models.*;
import Service.*;
public class App {
    public static void main(String[] args) throws Exception {
        ServiceMes inicio=new ServiceMes();
        inicio.menu();
        // String meses[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","novienmbre","diciembre"};
        // String mesSecreto = meses[11];
        // System.out.println(mesSecreto);

    }
}
                       