package questoes_condicionais;

import java.util.Scanner;

public class TempoDeJogo {
  public static void main(String[] args) {
    System.out.println("Hora inicial: ");
    Scanner sc = new Scanner(System.in);
    int hi = sc.nextInt();

    System.out.println("Hora final: ");
    int hf = sc.nextInt();

    if (hf < hi) {
      int calc = (hf - hi) + 24;
      System.out.println(calc);
    } else if (hf > hi) {
      int calc = hf - hi;
      System.out.println(calc);
    } else if (hf == 0 && hi == 0) {
      System.out.println(24);
    }
    sc.close();
  }

}
