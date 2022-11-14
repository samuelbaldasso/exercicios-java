package questoes_condicionais;

import java.util.Scanner;

public class Coordenadas {
  public static void main(String[] args) {
    System.out.println("X: ");
    Scanner sc = new Scanner(System.in);
    Double x = sc.nextDouble();

    System.out.println("Y: ");
    Double y = sc.nextDouble();

    if (x > 0 && y > 0) {
      System.out.println("q1");
    } else if (x < 0 && y > 0) {
      System.out.println("q2");
    } else if (x < 0 && y < 0) {
      System.out.println("q3");
    } else if (x > 0 && y < 0) {
      System.out.println("q4");
    } else if (x == 0 && y == 0) {
      System.out.println("Origem...");
    }
    sc.close();
  }
}
