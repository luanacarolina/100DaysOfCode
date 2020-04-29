package Arrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];

        for (int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
            System.out.println("A[" + i + "] = " + a[i]);
        }
        for (int i =0;i<b.length;i++){
            b[i]=a[i]*i;
            System.out.println("B[" + i + "] = " + b[i]);

        }
    }
}
