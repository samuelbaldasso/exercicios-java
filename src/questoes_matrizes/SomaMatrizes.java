package questoes_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantas linhas em cada matriz?");
    int l = sc.nextInt();
    System.out.println("Quantas colunas em cada matriz?");
    int c = sc.nextInt();
    int[][] matriz = new int[l][c];
    int[][] matriz2 = new int[l][c];
    int[][] matriz3 = new int[l][c];
    int soma;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < c; j++) {
        System.out.println("Digite os elementos da matriz A: ");
        matriz[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < c; j++) {
        System.out.println("Digite os elementos da matriz B: ");
        matriz2[i][j] = sc.nextInt();
      }
    }

    System.out.println("Matriz gerada: ");

    for (int i = 0; i < l; i++) {
      soma = 0;
      for (int j = 0; j < c; j++) {
        soma = matriz[i][j] + matriz2[i][j];
        matriz3[i][j] = soma;
        System.out.printf("%d\n", soma);
      }
    }
    sc.close();
  }

}
