package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Nota6 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    double[] nota1 = new double[n1];
    double[] nota2 = new double[n1];
    String[] nome = new String[n1];
    double media;

    for (int i = 0; i < n1; i++) {
      System.out.println("Dados da " + (i + 1) + "a pessoa: ");
      System.out.println("Nome: ");
      nome[i] = sc.next();
      System.out.println("Nota 1: ");
      nota1[i] = sc.nextDouble();
      System.out.println("Nota 2: ");
      nota2[i] = sc.nextDouble();
    }

    System.out.println("Alunos aprovados: ");
    for (int i = 0; i < n1; i++) {
      media = (nota1[i] + nota2[i]) / 2;
      if (media >= 6) {
        System.out.println(nome[i]);
      }
    }
    sc.close();
  }

}
