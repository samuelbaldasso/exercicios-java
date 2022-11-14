package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Número de casos: ");
    double n1 = sc1.nextDouble();

    for (int i = 0; i < n1; i++) {
      System.out.println("N1: ");
      double num = sc1.nextDouble();

      System.out.println("N2: ");
      double den = sc1.nextDouble();

      if (den == 0) {
        System.out.println("Divisão impossível.");
      } else {
        double calc = num / den;
        System.out.println(calc);
      }
    }
    sc1.close();
  }
}
