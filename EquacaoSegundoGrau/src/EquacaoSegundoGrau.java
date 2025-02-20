public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public EquacaoSegundoGrau(double i, double j, double k){
        a = i;
        b = j;
        c = k;
    }

    public void setA(double x){
        a = x;
    }
    public void setB(double x){
        b = x;
    }
    public void setC(double x){
        c = x;
    }
    public void setX1(double x){
        x1 = x;
    }
    public void setX2(double x){
        x2 = x;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getX1(){
        return x1;
    }
    public double getX2(){
        return x2;
    }

    public double calcularDelta(){
        double d = 0;
        d = (b * b) - 4 * (a) * (c);
        return d;
    }

    public void calcularX1 (){
        x1 = ((-b + Math.sqrt(calcularDelta()))/(2*a));
    }
    public void calcularX2 (){
        x2 = ((-b - Math.sqrt(calcularDelta()))/(2*a));
    }
}
