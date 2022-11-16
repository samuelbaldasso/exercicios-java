package questoes_sequenciais;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        System.out.println("N1: ");
        Scanner sc1 = new Scanner(System.in);
        Double n1 = sc1.nextDouble();
        System.out.println("N2: ");
        Double n2 = sc1.nextDouble();

        Double soma = n1 + n2;
        System.out.println(soma);
        sc1.close();
    }
}
