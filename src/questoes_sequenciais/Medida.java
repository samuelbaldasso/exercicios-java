package questoes_sequenciais;

import java.util.Scanner;

public class Medida {
    public static void main(String[] args) {
        System.out.println("M1: ");
        Scanner sc1 = new Scanner(System.in);
        Double m1 = sc1.nextDouble();
        System.out.println("M2: ");
        Double m2 = sc1.nextDouble();
        System.out.println("M3: ");
        Double m3 = sc1.nextDouble();

        Double areaQd = Math.pow(m1, 2);
        Double areaTr = (m1 * m2) / 2;
        Double areaTrap = ((m1 + m2) * m3) / 2;
        System.out.println(areaQd + " " + areaTr + " " + areaTrap);
        sc1.close();
    }
}
