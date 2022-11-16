package questoes_repetitivas;

import java.util.Scanner;

public class Crescente {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = sc1.nextInt();
    System.out.println("N2: ");
    int n2 = sc1.nextInt();
    if (n1 < n2)
      System.out.println("Decrescente...");
    else if (n1 > n2)
      System.out.println("Crescente");

    while (n1 != n2) {
      System.out.println("N1: ");
      n1 = sc1.nextInt();
      System.out.println("N2: ");
      n2 = sc1.nextInt();
      if (n1 < n2)
        System.out.println("Decrescente...");
      else if (n1 > n2)
        System.out.println("Crescente");
    }
    sc1.close();
  }
}