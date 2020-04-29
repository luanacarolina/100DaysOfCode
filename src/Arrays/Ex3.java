package Arrays;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[15];
        int[] b = new int[15];

        for (int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
            System.out.println("A[" + i + "] = " + a[i]);
        }
        for (int i = 0;i<b.length;i++){
            b[i]=a[i]*a[i];
            System.out.println("B[" + i + "] = " + b[i]);

        }
    }
}
