package questoes_condicionais;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        System.out.println("N1: ");
        Scanner sc1 = new Scanner(System.in);
        Double n1 = sc1.nextDouble();

        System.out.println("N2: ");
        Double n2 = sc1.nextDouble();

        Double media = (n1 + n2) / 2;

        System.out.println("Nota final: " + media);

        if (media < 60) {
            System.out.println("Reprovado.");
        }
        sc1.close();
    }
}