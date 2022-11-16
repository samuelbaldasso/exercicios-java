package questoes_condicionais;

import java.util.Scanner;

public class Lanchonete {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Código: ");
    int code = sc.nextInt();
    System.out.println("Qtd: ");
    int qtd = sc.nextInt();

    switch (code) {
      case 1:
        double valor = 5;
        double calc = valor * qtd;
        System.out.println(calc);
        break;
      case 2:
        valor = 3.5;
        calc = valor * qtd;
        System.out.println(calc);
        break;
      case 3:
        valor = 4.8;
        calc = valor * qtd;
        System.out.println(calc);
        break;
      case 4:
        valor = 8.9;
        calc = valor * qtd;
        System.out.println(calc);
        break;
      case 5:
        valor = 7.32;
        calc = valor * qtd;
        System.out.println(calc);
        break;
      default:
        System.out.println("Não existe.");
        break;
    }
    sc.close();
  }
}
