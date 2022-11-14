package questoes_sequenciais;

import java.util.Scanner;

public class MediaIdade {
    public void media(){
        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome: ");
        Scanner sc1 = new Scanner(System.in);
        String nome = sc1.next();
        System.out.println("Idade: ");
        Scanner sc2 = new Scanner(System.in);
        Double idade = sc2.nextDouble();

        System.out.println("Dados da segunda pessoa:");
        System.out.println("Nome: ");
        Scanner sc3 = new Scanner(System.in);
        String nome2 = sc1.next();
        System.out.println("Idade: ");
        Scanner sc4 = new Scanner(System.in);
        Double idade2 = sc2.nextDouble();

        Double media = (idade+idade2)/2;
        System.out.println(nome + " e " + nome2 + " tem uma média de idade de: " + media);
    }
}
