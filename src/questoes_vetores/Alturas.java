package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    int[] idade = new int[n1];
    double[] altura = new double[n1];
    String[] nome = new String[n1];

    for (int i = 0; i < n1; i++) {
      System.out.println("Dados da " + (i + 1) + "a pessoa: ");
      System.out.println("Nome: ");
      nome[i] = sc.next();
      System.out.println("Idade: ");
      idade[i] = sc.nextInt();
      System.out.println("Altura: ");
      altura[i] = sc.nextDouble();
    }

    int nmenores = 0;
    double alturaTotal = 0;
    for (int i = 0; i < n1; i++) {
      if (idade[i] < 16) {
        nmenores++;
      }
      alturaTotal = alturaTotal + altura[i];
    }

    double media = alturaTotal / n1;
    double percent = ((double) nmenores / n1) * 100;

    System.out.println();

    for (int i = 0; i < n1; i++) {
      if (idade[i] < 16)
        System.out.println("Nome dos menores: " + nome[i]);
    }

    System.out.println("Média: " + String.format("%.2f", media));

    System.out.println("Percentual de menores: " + percent);
    sc.close();
  }

}
