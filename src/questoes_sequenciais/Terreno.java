package questoes_sequenciais;

import java.util.Scanner;

public class Terreno {
    public void calcular() {
        System.out.println("Largura: ");
        Scanner sc1 = new Scanner(System.in);
        Double largura = sc1.nextDouble();
        System.out.println("Comprimento: ");
        Scanner sc2 = new Scanner(System.in);
        Double comp = sc2.nextDouble();
        System.out.println("M2: ");
        Scanner sc3 = new Scanner(System.in);
        Double m2 = sc3.nextDouble();

        Double area = largura * comp;
        Double preco = area * m2;

        System.out.println("A área é: " + area + " e o preço é: " + preco);
    }
}
