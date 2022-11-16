package questoes_sequenciais;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        System.out.println("Base: ");
        Scanner sc1 = new Scanner(System.in);
        Double base = sc1.nextDouble();
        System.out.println("Altura: ");
        Double altura = sc1.nextDouble();

        Double area = base * altura;
        Double perimetro = 2 * (base + altura);
        Double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.println("A área é: " + area + ", o perímetro é: " + perimetro +
                " e a diagonal é: " + String.format("%.4f", diagonal));
        sc1.close();
    }
}
