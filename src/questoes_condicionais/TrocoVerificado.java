package questoes_condicionais;

import java.util.Scanner;

public class TrocoVerificado {
  public void troco() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Preço: ");
    Double preco = sc.nextDouble();
    System.out.println("Qtd: ");
    Integer qtd = sc.nextInt();
    System.out.println("Valor recebido: ");
    Double valor = sc.nextDouble();

    Double troco = valor - (preco * qtd);

    if (troco < 0) {
      System.out.println("Dinheiro insufuciente. Faltam " + troco * -1);
    }
  }

}
