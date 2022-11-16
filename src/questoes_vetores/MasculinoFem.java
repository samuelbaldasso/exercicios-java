
import java.util.Locale;
import java.util.Scanner;

public class MasculinoFem {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    double[] alt = new double[n1];
    char[] gen = new char[n1];
    double media;
    int nm = 0, nf = 0;
    double sumMulh = 0;

    for (int i = 0; i < n1; i++) {
      System.out.println("Dados da " + (i + 1) + "a pessoa: ");
      System.out.print("Altura: ");
      alt[i] = sc.nextDouble();
      System.out.println("Gênero: ");
      gen[i] = sc.next().charAt(0);
    }

    double maior = alt[0];
    double menor = alt[0];

    for (int i = 1; i < n1; i++) {
      if (alt[i] < menor) {
        menor = alt[i];
      }
      if (alt[i] > maior) {
        maior = alt[i];
      }
    }

    for (int i = 0; i < n1; i++) {
      if (gen[i] == 'M') {
        nm++;
      } else {
        nf++;
        sumMulh = sumMulh + alt[i];
      }
    }

    media = sumMulh / nf;

    System.out.println("Menor altura: " + menor);
    System.out.println("Maior altura: " + maior);
    System.out.println("Média de mulheres: " + String.format("%.2f", media));
    System.out.println("Número de homens: " + nm);
    sc.close();
  }

}
