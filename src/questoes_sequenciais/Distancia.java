package questoes_sequenciais;

import java.util.Scanner;

public class Distancia {
    public void distancia(){
        System.out.println("Distância: ");
        Scanner sc1 = new Scanner(System.in);
        Double dist = sc1.nextDouble();

        System.out.println("Combustível: ");
        Scanner sc2 = new Scanner(System.in);
        Double comb = sc2.nextDouble();

        Double calc = dist / comb;
        System.out.println(String.format("%.2f", calc));
    }
}
