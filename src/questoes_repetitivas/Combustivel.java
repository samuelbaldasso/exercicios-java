package questoes_repetitivas;

import java.util.Scanner;

public class Combustivel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
    int x = sc.nextInt();
    int alcool = 0, gas = 0, diesel = 0;

    while (x != 4) {
      if (x == 1) {
        System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
        x = sc.nextInt();
        alcool++;
      } else if (x == 2) {
        System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
        x = sc.nextInt();
        gas++;
      } else if (x == 3) {
        System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
        x = sc.nextInt();
        diesel++;
      }
    }
    System.out.println("Álcool: " + alcool);
    System.out.println("Gasolina: " + gas);
    System.out.println("Diesel: " + diesel);
    sc.close();
  }

}
