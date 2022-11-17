package questoes_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a ordem da matriz?");
    int o = sc.nextInt();
    int[][] matriz = new int[o][o];
    int somaAcima;

    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        System.out.printf("Elemento [%d,%d]? ", i, j);
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("Soma dos valores acima da diagonal: ");
    somaAcima = 0;
    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        if (i < j) {
          somaAcima += matriz[i][j];
        }
      }
    }
    System.out.println(somaAcima);
    sc.close();
  }

}
