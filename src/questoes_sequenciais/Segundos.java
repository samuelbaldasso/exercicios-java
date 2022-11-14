package questoes_sequenciais;

import java.util.Scanner;

public class Segundos {
    public void duracao(){
    System.out.println("questoes_sequenciais.Segundos: ");
    Scanner sc1 = new Scanner(System.in);
    Integer sec = sc1.nextInt();

    Integer horas = sec / 3600;
    Integer resto = sec % 3600;
    Integer min = resto / 60;
    sec = resto % 60;
    System.out.println(horas + ":" + min + ":" + sec);

}}

