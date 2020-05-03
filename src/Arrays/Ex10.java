package Arrays;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        System.out.println("Digite os Valores de A");
        for(int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
            System.out.println("A["+i+"] = "+a[i]);
        }
        System.out.println("Os valores de B são:    ");
        for (int i =0;i<b.length;i++){
            b[i]=a[i]%2;
            System.out.println("B["+i+"] = "+b[i]);
        }
    }
}
