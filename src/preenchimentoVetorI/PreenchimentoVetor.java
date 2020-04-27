package preenchimentoVetorI;

import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoVetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int x [] = new int[10];
        System.out.println("Digite um valor");
        x[0]=scan.nextInt();
        System.out.println("N[0] = "+x[0]);

        for(int i = 1;i<10;i++){
            x[i]=x[i-1]*2;
            System.out.println("N["+i+"] = "+x[i]);
        }


    }
}
