package questoes_sequenciais;

import java.util.Scanner;

public class Mercearia {
    public void troco(){
        System.out.println("Preço: ");
        Scanner sc1 = new Scanner(System.in);
        Double preco = sc1.nextDouble();
        System.out.println("Qtd: ");
        Scanner sc2 = new Scanner(System.in);
        Integer qtd = sc2.nextInt();
        System.out.println("Valor recebido: ");
        Scanner sc3 = new Scanner(System.in);
        Double valor = sc3.nextDouble();

        Double troco = valor - (preco*qtd);
        System.out.println(troco);
    }
}
