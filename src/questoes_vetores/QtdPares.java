
import java.util.Locale;
import java.util.Scanner;

public class QtdPares {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce vai digitar?");
    int n1 = sc.nextInt();
    int[] arr = new int[n1];
    int count = 0;

    for (int i = 0; i < n1; i++) {
      System.out.println("Digite um número: ");
      arr[i] = sc.nextInt();
    }

    System.out.println("Números pares: ");

    for (int i = 0; i < n1; i++) {
      if (arr[i] % 2 == 0) {
        System.out.println(arr[i]);
        count++;
      }
    }
    System.out.println("Contador de pares: " + count);
    sc.close();
  }

}
