package questoes_sequenciais;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        System.out.println("Raio: ");
        Scanner sc1 = new Scanner(System.in);
        Double raio = sc1.nextDouble();
        Double area = (Math.pow(raio, 2)) * Math.PI;
        System.out.println(String.format("%.3f", area));
        sc1.close();
    }
}
