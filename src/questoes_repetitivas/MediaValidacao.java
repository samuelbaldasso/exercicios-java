package questoes_repetitivas;

import java.util.Scanner;

public class MediaValidacao {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    double n1, n2, media;

    System.out.println("N1: ");
    n1 = sc1.nextDouble();

    while (n1 < 0 || n1 > 10) {
      System.out.println("Inválido...");
      System.out.println("N1: ");
      n1 = sc1.nextDouble();
    }

    System.out.println("N2: ");
    n2 = sc1.nextDouble();

    while (n2 < 0 || n2 > 10) {
      System.out.println("Inválido...");
      System.out.println("N2: ");
      n2 = sc1.nextDouble();
    }

    media = (n1 + n2) / 2;
    System.out.println(media);
    sc1.close();
  }
}