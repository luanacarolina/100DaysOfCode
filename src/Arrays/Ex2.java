package Arrays;

import java.util.Scanner;

public class Ex2 {
    //B[i] =A[i]*2
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = new int[8];
        int[] b =new int[8];

        for(int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
            System.out.println("a[" + i + "] = " + a[i]);
        }
        for(int i = 0;i<b.length;i++){
            b[i]=a[i]*2;
        }
        for (int i = 0;i<b.length;i++){
            System.out.println("B[" + i + "] = " + b[i]);

        }

    }
}
