package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc1.nextInt();
    int n2 = 0;

    while (n2 >= 0 && n2 < 10) {
      n2++;
      int calc = n1 * n2;
      System.out.println(calc);
    }
    sc1.close();
  }

}
