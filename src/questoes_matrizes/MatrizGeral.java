package questoes_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual a ordem da matriz?");
    int o = sc.nextInt();
    double linha, col;
    double[][] matriz = new double[o][o];
    int soma;

    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        System.out.printf("Elemento [%d,%d]? ", i, j);
        matriz[i][j] = sc.nextDouble();
      }
    }

    System.out.println("Matriz alterada: ");
    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        if (matriz[i][j] < 0) {
          matriz[i][j] = Math.pow(matriz[i][j], 2);
        }
        System.out.println(matriz[i][j]);
      }
    }

    System.out.printf("Diagonal principal: \n");
    for (int i = 0; i < o; i++) {
      System.out.println(matriz[i][i]);
    }

    System.out.println("Escolha uma linha: ");
    linha = sc.nextDouble();

    System.out.println("Linha escolhida: ");
    for (int i = 0; i < o; i++) {
      System.out.println(matriz[(int) linha][i]);
    }

    System.out.println("Escolha uma coluna: ");
    col = sc.nextInt();

    System.out.println("Coluna escolhida: ");
    for (int j = 0; j < o; j++) {
      System.out.println(matriz[j][(int) col]);
    }

    soma = 0;
    for (int i = 0; i < o; i++) {
      for (int j = 0; j < o; j++) {
        if (matriz[i][j] >= 0) {
          soma += matriz[i][j];
        }
      }
    }

    System.out.println("Soma dos positivos: " + soma);
    sc.close();
  }

}
