package questoes_condicionais;

import java.util.Scanner;

public class Maior {
    public void maior() {
        Scanner sc = new Scanner(System.in);
        System.out.println("N1: ");
        Double n1 = sc.nextDouble();

        System.out.println("N2: ");
        Double n2 = sc.nextDouble();

        System.out.println("N3: ");
        Double n3 = sc.nextDouble();

        Double maior = n1;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else if (n3 > n1 && n3 > n2) {
            maior = n3;
        }

        System.out.println("Maior distância: " + maior);
        sc.close();

    }
}
