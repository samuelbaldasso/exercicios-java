package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class NegativoIdade {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    double media, sum;
    int num, idade;

    System.out.println("Idade: ");
    idade = sc1.nextInt();

    if (idade < 0) {
      System.out.println("Impossível calcular...");
    } else {
      num = 0;
      sum = 0;
      while (idade >= 0) {
        sum = sum + idade;
        num++;
        System.out.println("Idade: ");
        idade = sc1.nextInt();
      }
      media = sum / num;
      System.out.println("Média: " + String.format("%.2f", media));
    }

    sc1.close();
  }

}