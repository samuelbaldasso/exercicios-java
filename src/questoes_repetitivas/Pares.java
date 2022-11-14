package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Pares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc1.nextInt();

    while (n1 != 0) {
      if (n1 % 2 == 0) {
        int sum = (5 * n1) + 20;
        System.out.println(sum);
        System.out.println("N1: ");
        n1 = sc1.nextInt();
      } else {
        int sum = ((5 * n1) + 20) - n1;
        System.out.println(sum);
        System.out.println("N1: ");
        n1 = sc1.nextInt();
      }
    }
    sc1.close();
  }

}
