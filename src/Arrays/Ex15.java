package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("");
        int [] a = new int[10];
        int contador=0;
        int par=0;
        int impar=0;
        double calculoPar=0;
        double calculoImpar=0;

        System.out.println("Digite os valores de A");
        for (int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        for (int i =0;i<a.length;i++){
            if (a[i]%2==0){
               par++;


            }else{
                impar++;

            }
            contador++;
        }

        calculoPar=(double)par/contador*100;
        calculoImpar=(double)impar/contador*100;

        System.out.println(contador);

        System.out.println("O percentual de pares é: "+df.format(calculoPar)+"%");
        System.out.println("O percentual de impares é : "+df.format(calculoImpar)+"%");
    }
}
