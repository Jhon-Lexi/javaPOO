package Models;

public class Puntos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Constructor vacion y otro con parametros
    public Puntos() {
        this.x1 = 0;
        this.x2 = 0;
        this.y1 = 0;
        this.y2 = 0;
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        System.out.println("con validaciones");
    }

    // getters
    public double getCor1() {
        return x1;
    }

    public double getCor2() {
        return x2;
    }

    public double getCor3() {
        return y1;
    }

    public double getCor4() {
        return y2;
    }

    // setters
    public void setCor1(double x1) {
        this.x1 = x1;
    }

    public void setCor2(double x2) {
        this.x2 = x2;
    }

    public void setCor3(double y1) {
        this.y1 = y1;
    }

    public void setCor4(double y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {

        return "PRimera Coordenada : " + x1 + "," + y1 + "SEgunda Coordenada : " + x2 + "" + y2;
    }

    public void coordenadas() {
        System.out.println("Calcula ");
    }
}
