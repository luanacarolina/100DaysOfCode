package preenchimentoVetorI;

import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoDeVetorII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int t = scan.nextInt();
        int n[]=new int[1000];
        int j=0;

        for (int i =0;i<1000;i++){
            System.out.println("N["+i+"] = "+j);
            j++;
            if(t==j){
                j=0;
            }
        }
    }
}
