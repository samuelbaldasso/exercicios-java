package questoes_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantas linhas na matriz?");
    int l = sc.nextInt();
    System.out.println("Quantas colunas na matriz?");
    int c = sc.nextInt();
    int[][] matriz = new int[l][c];
    int[] vetor = new int[l];
    int soma;

    for (int i = 0; i < l; i++) {
      System.out.println("Digite os elementos da " + (i + 1) + "a linha: ");
      for (int j = 0; j < c; j++) {
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("Vetor gerado: ");
    for (int i = 0; i < l; i++) {
      soma = 0;
      for (int j = 0; j < c; j++) {
        soma = soma + matriz[i][j];
      }
      vetor[i] = soma;
    }

    for (int i = 0; i < l; i++) {
      System.out.println(vetor[i]);
    }

    sc.close();
  }
}
