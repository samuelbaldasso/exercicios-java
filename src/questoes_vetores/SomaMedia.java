package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaMedia {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    double[] arr = new double[n1];
    double soma = 0;
    double media;

    for (int i = 0; i < n1; i++) {
      System.out.println("Número: ");
      arr[i] = sc.nextDouble();
    }

    for (int i = 0; i < n1; i++) {
      soma = soma + arr[i];
    }
    media = soma / n1;

    for (int i = 0; i < n1; i++) {
      System.out.println(arr[i]);
    }

    System.out.println(soma + ", " + media);
    sc.close();
  }
}