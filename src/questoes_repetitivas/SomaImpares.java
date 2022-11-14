package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc1.nextInt();
    System.out.println("N2: ");
    int n2 = sc1.nextInt();
    int soma = 0;
    int troca = 0;

    if (n1 > n2) {
      troca = n1;
      n1 = n2;
      n2 = troca;
    }

    for (int i = n1 + 1; i < n2; i++) {
      if (i % 2 != 0) {
        soma = soma + i;
      }
    }
    System.out.println(soma);
    sc1.close();
  }
}