package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    int[] arr = new int[n1];

    if (n1 <= 10) {
      for (int i = 0; i < n1; i++) {
        System.out.println("Número: ");
        arr[i] = sc.nextInt();
      }

      for (int i = 0; i < n1; i++) {
        if (arr[i] < 0) {
          System.out.println(arr[i]);
        }
      }
    }
    sc.close();
  }

}
