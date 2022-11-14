package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Número de casos: ");
    double n1 = sc1.nextDouble();

    for (int i = 0; i < n1; i++) {
      System.out.println("N1: ");
      double numero = sc1.nextDouble();
      double calc1 = numero * 2;

      System.out.println("N2: ");
      numero = sc1.nextDouble();
      double calc2 = numero * 3;

      System.out.println("N3: ");
      numero = sc1.nextDouble();
      double calc3 = numero * 5;

      double media = (calc1 + calc2 + calc3) / 10;
      System.out.println(String.format("%.1f", media));
    }
    sc1.close();
  }

}
