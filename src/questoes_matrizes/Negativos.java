package questoes_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantas linhas na matriz?");
    int l = sc.nextInt();
    System.out.println("Quantas colunas na matriz?");
    int c = sc.nextInt();
    int[][] matriz = new int[l][c];

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < c; j++) {
        System.out.printf("Elemento [%d,%d]? ", i, j);
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("Valores negativos: ");
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < c; j++) {
        if (matriz[i][j] < 0) {
          System.out.println(matriz[i][j]);
        }
      }
    }
    sc.close();
  }
}
