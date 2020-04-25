package selecaoVetorI;

import java.util.Locale;
import java.util.Scanner;

public class SelecaoVetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double menor;
        int posMenor;
        double x[];
        x=new double[100];

        for(int i=0;i<100;i++){
        x[i]=scan.nextDouble();
        }

        menor=x[0];

        for(int i=0;i<100;i++){
            if(x[i]<=10){
                menor=x[i];

                System.out.printf("A[%d] = %.1f\n",i,menor);
            }
        }



    }
}
