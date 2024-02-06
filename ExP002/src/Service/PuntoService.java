package Service;

import Models.*;
import java.util.Scanner;
import java.lang.Math;

public class PuntoService {
    public void Menu() {
        int x;

        Scanner num = new Scanner(System.in);
        do {

            System.out.println("Programa que es indica la distacia entre dos puntos");
            System.out.println("Presion el numero 1 para iniciar el programa");
            System.out.println("Presione el numero 2 para cerrar el programa");
            x = num.nextInt();
            switch (x) {
                case 1:
                    crearPuntos();
                    break;
                case 2:
                    System.out.println("Hasta Pronto");

                    break;
                default:

                    System.out.println("Numero invalido");

                    break;
            }
        } while (x != 2);

    }

    public double disPunto(double x1, double x2, double y1, double y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double c = a * a;
        double d = b * b;
        double e = c + d;
        double f = Math.sqrt(e);
        return f;
    }

    public void crearPuntos() {
        Puntos pt = new Puntos();
        Scanner coordenada = new Scanner(System.in);

        System.out.println("Ingresa el valor de x del Primer punto");
        double x1 = coordenada.nextDouble();
        pt.setCor1(x1);

        System.out.println("Ingresa el valor de y del Primer punto ");
        double x2 = coordenada.nextDouble();
        pt.setCor3(x2);

        System.out.println("Ingresa el vlor e x del segundo punto: ");
        double y1 = coordenada.nextDouble();
        pt.setCor2(y1);

        System.out.println("Ingresa el valor de y del segundo punto: ");
        double y2 = coordenada.nextDouble();
        pt.setCor4(y2);

        double k = disPunto(x1, x2, y1, y2);
        System.out.println(k);
    }

}
