package Arrays;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int soma =0;
        for (int i = 0 ;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        for (int i=0;i<10;i++){
            if(a[i]%5==0){
                soma+=a[i];
            }
        }
        System.out.println(soma);
    }
}
