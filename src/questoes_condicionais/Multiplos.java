package questoes_condicionais;

import java.util.Scanner;

public class Multiplos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc.nextInt();

    System.out.println("N2: ");
    int n2 = sc.nextInt();

    if (n1 % n2 == 0) {
      System.out.println("Múltiplos");
    } else {
      System.out.println("Não são múltiplos.");
    }

    sc.close();
  }
}
