package questoes_condicionais;

import java.util.Scanner;

public class Menor {
    public void menor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("N1: ");
        int n1 = sc.nextInt();

        System.out.println("N2: ");
        int n2 = sc.nextInt();

        System.out.println("N3: ");
        int n3 = sc.nextInt();
        
        int menor = n1;

        if(n1 < n2 && n1 < n3){
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        }else if (n3 < n1 && n3 < n2) {
            menor = n3;
        }

        System.out.println("Menor: " + menor);
        sc.close();

    }
    }
