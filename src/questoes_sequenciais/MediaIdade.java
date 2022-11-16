package questoes_sequenciais;

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome: ");
        Scanner sc1 = new Scanner(System.in);
        String nome = sc1.next();
        System.out.println("Idade: ");
        Double idade = sc1.nextDouble();

        System.out.println("Dados da segunda pessoa:");
        System.out.println("Nome: ");
        String nome2 = sc1.next();
        System.out.println("Idade: ");
        Double idade2 = sc1.nextDouble();

        Double media = (idade + idade2) / 2;
        System.out.println(nome + " e " + nome2 + " tem uma média de idade de: " + media);
        sc1.close();
    }
}
