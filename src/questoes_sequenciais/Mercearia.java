package questoes_sequenciais;

import java.util.Scanner;

public class Mercearia {
    public static void main(String[] args) {
        System.out.println("Preço: ");
        Scanner sc1 = new Scanner(System.in);
        Double preco = sc1.nextDouble();
        System.out.println("Qtd: ");
        Integer qtd = sc1.nextInt();
        System.out.println("Valor recebido: ");
        Double valor = sc1.nextDouble();

        Double troco = valor - (preco * qtd);
        System.out.println(troco);
        sc1.close();
    }
}
