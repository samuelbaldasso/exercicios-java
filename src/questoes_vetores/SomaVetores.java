package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    int[] arr2 = new int[n1];
    int[] arr3 = new int[n1];

    for (int i = 0; i < n1; i++) {
      System.out.println("Digite um número: ");
      arr1[i] = sc.nextInt();
    }

    for (int i = 0; i < n1; i++) {
      System.out.println("Digite um número: ");
      arr2[i] = sc.nextInt();
    }

    for (int i = 0; i < n1; i++) {
      arr3[i] = arr1[i] + arr2[i];
    }

    System.out.println("Resultante:");

    for (int i = 0; i < n1; i++) {
      System.out.println(arr3[i]);
    }

    sc.close();
  }

}
