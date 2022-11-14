package questoes_sequenciais;

import java.util.Scanner;

public class Medida {
    public void calc(){
        System.out.println("M1: ");
        Scanner sc1 = new Scanner(System.in);
        Double m1 = sc1.nextDouble();
        System.out.println("M2: ");
        Scanner sc2 = new Scanner(System.in);
        Double m2 = sc2.nextDouble();
        System.out.println("M3: ");
        Scanner sc3 = new Scanner(System.in);
        Double m3 = sc3.nextDouble();

        Double areaQd = Math.pow(m1, 2);
        Double areaTr = (m1*m2)/2;
        Double areaTrap = ((m1+m2)*m3)/2;
        System.out.println(areaQd + " " + areaTr + " " + areaTrap);
    }
}
