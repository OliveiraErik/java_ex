import java.util.Scanner;

public class Teste {
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o número A");
    double numberA = entrada.nextDouble();
    System.out.println("Digite o número B");
    double numberB = entrada.nextDouble();
    System.out.println("Digite o número B");
    double numberC = entrada.nextDouble();

    if (numberA > numberB && numberA > numberC){
        System.out.println("Numero A de valor:" + numberA + " é o maior");
    }
    else if (numberB > numberA && numberB > numberC){
        System.out.println("Numero B de valor:" + numberB + " é o maior");
        }
    else if (numberC > numberA && numberC > numberB){
        System.out.println("Numero C de valor:" + numberC + " é o maior");
    }
    }
}
