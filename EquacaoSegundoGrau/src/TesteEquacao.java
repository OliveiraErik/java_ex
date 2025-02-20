public class TesteEquacao {
    public static void main(String[] args){
        EquacaoSegundoGrau eq1 = new EquacaoSegundoGrau(1,1,1);
        eq1.calcularX1();
        eq1.calcularX2();

        if (eq1.calcularDelta() >= 0){
            System.out.println(
                    "A= " + eq1.getA() +
                            ", B= " + eq1. getB() +
                            ", C= " + eq1.getC()
            );
            System.out.println("X1 = " + eq1.getX1());
            System.out.println("X2 = " + eq1.getX2());
        }
        else {
          System.out.println("Error");
        }
    }
}
