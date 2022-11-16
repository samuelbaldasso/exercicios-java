package questoes_sequenciais;

import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        System.out.println("Nome: ");
        Scanner sc1 = new Scanner(System.in);
        String nome = sc1.nextLine();
        System.out.println("Horas: ");

        Double horas = sc1.nextDouble();
        System.out.println("Valor por hora: ");

        Double valor = sc1.nextDouble();

        Double salario = horas * valor;
        System.out.println(nome + " " + salario);
        sc1.close();
    }
}
