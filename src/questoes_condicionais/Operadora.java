package questoes_condicionais;

import java.util.Scanner;

public class Operadora {
    public void operadora(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qtd de minutos: ");
        int qtd = sc.nextInt();

        int valorPadrao = 50;

        if(qtd > 100){
            valorPadrao = valorPadrao+(qtd - 100)*2;
        }

            System.out.println(valorPadrao);
        }
    }