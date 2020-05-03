package Arrays;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int contador =0;
        double soma = 0;
        double media=0;

        System.out.println("Digite 10 valores");
        for (int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        for (int i=0;i<10;i++){
            if(a[i]%2!=0){
                soma+=a[i];
                contador ++;
                media=soma/contador;

            }
        }
        System.out.println("A soma dos valores é: "+soma);
        System.out.println("A quantidade de elementos impares é : "+contador);
        System.out.println("A média dos impares é "+media);
    }
}
