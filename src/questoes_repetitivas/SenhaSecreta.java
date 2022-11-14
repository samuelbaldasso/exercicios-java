package questoes_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SenhaSecreta {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Digite a senha...");
    int senha = sc1.nextInt();

    while (senha != 2002) {
      if (senha != 2002)
        System.out.println("Senha Inválida! Tente novamente:");

      System.out.println("Digite a senha...");
      senha = sc1.nextInt();
    }
    System.out.println("Acesso permitido...");
    sc1.close();
  }

}
