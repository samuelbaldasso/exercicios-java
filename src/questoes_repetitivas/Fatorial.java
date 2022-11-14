package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Número: ");
    int n1 = sc1.nextInt();

    if (n1 <= 15) {
      int fat = 1;
      for (int i = n1; i > 0; i--) {
        fat = (fat * i);
      }

      System.out.println(fat);
    }
    sc1.close();
  }
}