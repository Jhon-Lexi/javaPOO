package Service;

import java.lang.Math;
import Models.Puntos;
import java.util.Scanner;

public class PuntosService {

    Puntos pt1 = new Puntos();

    public void DisPunto() {


        Scanner dis = new Scanner(System.in);
        
        System.out.println("Ingresa el valor de x1 del primer punto: ");
        double p1 = dis.nextDouble();
        pt1.setCor1(p1);

        System.out.println("Ingresa el valor de y1 del primer punto: ");
        double p2 = dis.nextDouble();
        pt1.setCor3(p2);

        System.out.println("Ingresa el valor de x2 del segundo punto: ");
        double p3 = dis.nextDouble();
        pt1.setCor2(p3);

        System.out.println("Ingresa el valor de y2 del segundo punto: ");
        double p4 = dis.nextDouble();
        pt1.setCor4(p4);

        double x1 = pt1.getCor1();
        double x2 = pt1.getCor3();
        double x3 = pt1.getCor2();
        double x4 = pt1.getCor4();

        // System.out.println(pt1.getCor1());
        // System.out.println(pt1.getCor2());
        // System.out.println(pt1.getCor3());
        // System.out.println(pt1.getCor4());
        double tip=Formula(x1, x2, x3, x4);
        System.out.println("La distacia de los dos puntos es : "+tip);
        // pt1.getCor2();
        // pt1.getCor3();
        // pt1.getCor4();
    }

    public double Formula(double x, double x3, double x2, double x4) {

        double a = x2 - x;
        double b = x4 - x3;
        
        double c = a * a;
        double d = b * b;
        
        double e = c - d;
        System.out.println(e);
        double res = Math.sqrt(e);
        
        System.out.println("Ubicacion del primer punto (" + x + "," + x2 + ")");
        System.out.println("Ubicacion del segundo punto (" + x3 + "," + x4 + ")");
        System.out.println("La distacia de los dos puntos es : "+res);
        
        return  res;
        
    }

}
