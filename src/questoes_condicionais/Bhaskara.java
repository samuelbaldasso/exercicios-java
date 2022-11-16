package questoes_condicionais;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        System.out.println("N1: ");
        Scanner sc1 = new Scanner(System.in);
        Double n1 = sc1.nextDouble();

        System.out.println("N2: ");
        Double n2 = sc1.nextDouble();

        System.out.println("N3: ");
        Double n3 = sc1.nextDouble();

        Double delta = (Math.pow(n2, 2) - 4 * n1 * n3);
        Double bhaskara1 = (-n2 + Math.sqrt(delta)) / 2 * n1;
        Double bhaskara2 = (-n2 - Math.sqrt(delta)) / 2 * n1;

        if (delta < 0) {
            System.out.println("Essa equação não possui raízes.");
        } else {
            System.out.println(bhaskara1 + " " + bhaskara2);
        }
        sc1.close();
    }
}
