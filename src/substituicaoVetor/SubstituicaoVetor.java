package substituicaoVetor;

import java.util.Locale;
import java.util.Scanner;

public class SubstituicaoVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int x[]=new int[10];

        for(int i =0;i<x.length;i++){
            x[i]=scan.nextInt();
        }
        for(int i =0;i<x.length;i++){
            if(x[i]<=0){
                x[i]=1;
                System.out.println("X["+i+"] = "+x[i]);
            }else{
                System.out.println("X["+i+"] = "+x[i]);
            }

        }
    }
}
