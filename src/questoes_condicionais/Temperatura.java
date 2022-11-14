package questoes_condicionais;

import java.util.Scanner;

public class Temperatura {
  public void temp() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nome da medida: ");
    String nome = sc.next();

    System.out.println("Temperatura: ");
    Double temp = sc.nextDouble();

    if (nome.equals("F")) {
      Double calc = (temp - 32) / 1.8;
      System.out.println(String.format("%.2f", calc) + " C");
    } else if (nome.equals("C")) {
      Double calc = (temp * 1.8) + 32;
      System.out.println(String.format("%.2f", calc) + " F");
    } else {
      System.out.println("Essa medida não existe.");
    }
  }
}
