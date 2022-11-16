package questoes_sequenciais;

import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        System.out.println("Largura: ");
        Scanner sc1 = new Scanner(System.in);
        Double largura = sc1.nextDouble();
        System.out.println("Comprimento: ");
        Double comp = sc1.nextDouble();
        System.out.println("M2: ");
        Double m2 = sc1.nextDouble();

        Double area = largura * comp;
        Double preco = area * m2;

        System.out.println("A área é: " + area + " e o preço é: " + preco);
        sc1.close();
    }
}
