package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    int[] arr = new int[n1];

    for (int i = 0; i < n1; i++) {
      System.out.println("Digite um número: ");
      arr[i] = sc.nextInt();
    }

    int maior = arr[0];
    int posMaior = 0;

    for (int i = 0; i < n1; i++) {
      if (arr[i] > maior) {
        maior = arr[i];
        posMaior = i;
      }
    }

    System.out.println("Maior valor: " + maior);
    System.out.println("Posição: " + posMaior);
    sc.close();
  }

}
