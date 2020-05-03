package Arrays;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int soma=0 ;
        System.out.println("Digite os valores de A");
        for(int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
        }

        for (int i =0;i<10;i++){
            soma+=a[i];

        }
        System.out.println("A soma dos elementos de A é: ");
        System.out.println(soma);
    }
}
