package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc1.nextInt();

    for (int i = 0; i < n1; i++) {
      System.out.println("N1: ");
      int numero = sc1.nextInt();
      if (numero % 2 != 0 && numero < 0) {
        System.out.println("Ímpar negativo");
      } else if (numero == 0) {
        System.out.println("Nulo");
      } else if (numero % 2 == 0 && numero > 0) {
        System.out.println("Par positivo");
      } else if (numero % 2 == 0 && numero < 0) {
        System.out.println("Par negativo");
      } else if (numero % 2 != 0 && numero > 0) {
        System.out.println("Ímpar positivo");
      }
    }

    sc1.close();
  }
}