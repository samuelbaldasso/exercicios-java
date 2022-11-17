package questoes_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Maior {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a ordem da matriz?");
    int o = sc.nextInt();
    int[][] matriz = new int[o][o];
    int maior;

    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        System.out.printf("Elemento [%d,%d]? ", i, j);
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.printf("Maior de cada linha: \n");

    for (int i = 0; i < o; i++) {
      maior = 0;
      for (int j = 0; j < o; j++) {
        if (matriz[i][j] > maior) {
          maior = matriz[i][j];
        }
      }
      System.out.println(maior);
    }
    sc.close();
  }
}
