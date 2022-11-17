package questoes_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a ordem da matriz?");
    int o = sc.nextInt();
    int[][] matriz = new int[o][o];

    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        System.out.printf("Elemento [%d,%d]? ", i, j);
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.printf("Diagonal principal: ");
    for (int i = 0; i < o; i++) {
      System.out.printf("%d ", matriz[i][i]);
    }
    System.out.println();
    System.out.println("Valores negativos: ");
    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        if (matriz[i][j] < 0) {
          System.out.println(matriz[i][j]);
        }
      }
    }

    sc.close();
  }
}
