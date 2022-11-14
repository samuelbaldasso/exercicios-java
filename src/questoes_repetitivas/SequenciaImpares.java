package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaImpares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc1.nextInt();

    for (int i = 1; i < n1; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    sc1.close();
  }
}
