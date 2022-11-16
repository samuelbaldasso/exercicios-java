package questoes_sequenciais;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        System.out.println("Distância: ");
        Scanner sc1 = new Scanner(System.in);
        Double dist = sc1.nextDouble();

        System.out.println("Combustível: ");
        Double comb = sc1.nextDouble();

        Double calc = dist / comb;
        System.out.println(String.format("%.2f", calc));
        sc1.close();
    }
}
