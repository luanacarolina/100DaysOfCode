package Arrays;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] a = new int[10];
        int contador =0;

        for(int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
            if(a[i]%2==0){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
