package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos produtos voce vai digitar?");
    int n1 = sc.nextInt();
    double[] precoC = new double[n1];
    double[] precoV = new double[n1];
    String[] nome = new String[n1];
    double[] percent = new double[n1];
    double lucro = 0;
    int igual10 = 0, igual15 = 0, maior20 = 0;

    for (int i = 0; i < n1; i++) {
      System.out.println("Nome: ");
      nome[i] = sc.next();
      System.out.println("Preço compra: ");
      precoC[i] = sc.nextDouble();
      System.out.println("Preço venda: ");
      precoV[i] = sc.nextDouble();
    }

    for (int i = 0; i < n1; i++) {
      percent[i] = (precoV[i] - precoC[i]) / precoC[i] * 100;
    }

    System.out.println("Relatório: ");

    for (int i = 0; i < n1; i++) {
      if (percent[i] < 10) {
        igual10++;
      } else if (percent[i] >= 10 && percent[i] <= 20) {
        igual15++;
      } else {
        maior20++;
      }
    }
    double somaC = 0, somaV = 0;
    for (int i = 0; i < n1; i++) {
      somaC = somaC + precoC[i];
      somaV = somaV + precoV[i];
    }

    lucro = (somaV - somaC);
    System.out.println("Lucro abaixo de 10%: " + igual10);
    System.out.println("Lucro entre 10% e 20%: " + igual15);
    System.out.println("Lucro acima de 20%: " + maior20);
    System.out.println("Valor total compra: " + somaC);
    System.out.println("Valor total venda: " + somaV);

    System.out.println("Lucro: " + lucro);
    sc.close();
  }
}
