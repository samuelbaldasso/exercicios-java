package questoes_condicionais;

import java.util.Scanner;

public class Glicose {
  public void glicose() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Glicose: ");
    int glic = sc.nextInt();

    if (glic <= 100) {
      System.out.println("Normal");
    }
    if (glic > 100 && glic <= 140) {
      System.out.println("Elevado");
    } else if (glic > 140) {
      System.out.println("Diabetes");
    }
  }

}
