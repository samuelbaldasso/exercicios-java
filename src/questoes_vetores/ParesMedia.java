package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ParesMedia {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    double[] vetor = new double[n1];
    double media;
    int soma = 0;
    int npares = 0;

    for (int i = 0; i < n1; i++) {
      System.out.println("Número: ");
      vetor[i] = sc.nextDouble();
    }

    for (int i = 0; i < n1; i++) {
      if (vetor[i] % 2 == 0)
        soma += vetor[i];
      npares++;
    }

    if (npares == 0)
      System.out.println("Nenhum par...");
    else {
      media = ((double) soma / npares);

      System.out.println("Média: " + media);
    }
    sc.close();
  }

}
