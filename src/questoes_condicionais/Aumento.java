package questoes_condicionais;

import java.util.Scanner;

public class Aumento {
  public static void main(String[] args) {
    System.out.println("Salário: ");
    Scanner sc = new Scanner(System.in);
    double salario = sc.nextDouble();

    if (salario <= 1000) {
      double percent = 0.2;
      double aumento = salario * percent;
      salario = salario + aumento;
      System.out.println(salario + ", " + aumento + ", " + percent * 100 + "%.");
    } else if (salario > 1000 && salario <= 3000) {
      double percent = 0.15;
      double aumento = salario * percent;
      salario = salario + aumento;
      System.out.println(salario + ", " + aumento + ", " + percent * 100 + "%.");
    } else if (salario > 3000 && salario <= 8000) {
      double percent = 0.1;
      double aumento = salario * percent;
      salario = salario + aumento;
      System.out.println(salario + ", " + aumento + ", " + percent * 100 + "%.");
    } else {
      double percent = 0.05;
      double aumento = salario * percent;
      salario = salario + aumento;
      System.out.println(salario + ", " + aumento + ", " + percent * 100 + "%.");
    }
    sc.close();
  }

}
