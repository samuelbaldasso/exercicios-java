package questoes_sequenciais;

import java.util.Scanner;

public class Soma {
    public void calcular(){
        System.out.println("N1: ");
        Scanner sc1 = new Scanner(System.in);
        Double n1 = sc1.nextDouble();
        System.out.println("N2: ");
        Scanner sc2 = new Scanner(System.in);
        Double n2 = sc2.nextDouble();

        Double soma = n1 + n2;
        System.out.println(soma);
    }
}
