package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class CasosTestes {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    int coelhos = 0, ratos = 0, sapos = 0, cobaias, casos;
    char tipo;

    System.out.println("Quantos casos são? ");
    casos = sc1.nextInt();

    for (int i = 0; i < casos; i++) {
      System.out.println("Qtd de cobaias? ");
      cobaias = sc1.nextInt();

      System.out.println("Tipo? ");
      tipo = sc1.next().charAt(0);

      if (tipo == 'C') {
        coelhos = coelhos + cobaias;
      } else if (tipo == 'R') {
        ratos = ratos + cobaias;
      } else if (tipo == 'S') {
        sapos = sapos + cobaias;
      }
    }

    int soma = coelhos + ratos + sapos;
    double percentCoelhos = ((double) coelhos / soma) * 100;
    double percentRatos = ((double) ratos / soma) * 100;
    double percentSapos = ((double) sapos / soma) * 100;
    System.out.println("Soma: " + soma);
    System.out.println("Coelhos: " + coelhos);
    System.out.println("Ratos: " + ratos);
    System.out.println("Sapos: " + sapos);
    System.out.println("Percentual de coelhos: " + percentCoelhos);
    System.out.println("Percentual de ratos: " + percentRatos);
    System.out.println("Percentual de sapos: " + percentSapos);

    sc1.close();
  }

}
