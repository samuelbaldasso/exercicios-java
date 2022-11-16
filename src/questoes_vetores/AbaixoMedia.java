package questoes_vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    int[] idade = new int[n1];
    String[] nome = new String[n1];
    int maisVelho = idade[0];

    for (int i = 0; i < n1; i++) {
      System.out.println("Dados da " + (i + 1) + "a pessoa: ");
      System.out.println("Nome: ");
      nome[i] = sc.next();
      System.out.println("Idade: ");
      idade[i] = sc.nextInt();
    }

    for (int i = 0; i < n1; i++) {
      if (maisVelho < idade[i]) {
        maisVelho = idade[i];
      }
    }

    System.out.println("Mais velho: " + maisVelho);
    sc.close();
  }
}
