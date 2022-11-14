package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DentroFora {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc1.nextInt();
    int dentro = 0, fora = 0;

    for (int i = 0; i < n1; i++) {
      System.out.println("Número: ");
      int numero = sc1.nextInt();
      if (numero < 10 || numero > 20) {
        fora++;

      } else if (numero >= 10 && numero <= 20) {
        dentro++;
      }
    }
    System.out.println("Dentro: " + dentro);
    System.out.println("Fora: " + fora);
    sc1.close();
  }

}
