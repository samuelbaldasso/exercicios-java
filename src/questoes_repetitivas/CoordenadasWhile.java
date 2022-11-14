package questoes_repetitivas;

import java.util.Scanner;

public class CoordenadasWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("X: ");
    Double x = sc.nextDouble();

    System.out.println("Y: ");
    Double y = sc.nextDouble();

    while (x != 0 && y != 0) {
      if (x > 0 && y > 0) {
        System.out.println("q1");
      } else if (x < 0 && y > 0) {
        System.out.println("q2");
      } else if (x < 0 && y < 0) {
        System.out.println("q3");
      } else if (x > 0 && y < 0) {
        System.out.println("q4");
      }

      System.out.println("X: ");
      x = sc.nextDouble();

      System.out.println("Y: ");
      y = sc.nextDouble();
    }
    sc.close();
  }
}
