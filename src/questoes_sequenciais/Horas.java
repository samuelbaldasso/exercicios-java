package questoes_sequenciais;

import java.util.Scanner;

public class Horas {
    public void calcular(){
        System.out.println("Nome: ");
        Scanner sc1 = new Scanner(System.in);
        String nome = sc1.nextLine();
        System.out.println("questoes_sequenciais.Horas: ");
        Scanner sc2 = new Scanner(System.in);
        Double horas = sc2.nextDouble();
        System.out.println("Valor por hora: ");
        Scanner sc3 = new Scanner(System.in);
        Double valor = sc3.nextDouble();

        Double salario = horas*valor;
        System.out.println(nome + " " + salario);
        }}
