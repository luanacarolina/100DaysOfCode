package Arrays;

import java.util.Scanner;

public class Ex4 {
    //B[i] = sqrt(A[i])

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a= new int[15];
        double [] b = new double[15];

        for(int i =0 ;i<a.length;i++){
            a[i]=scan.nextInt();
            System.out.println("A[" + i + "] = " + a[i]);

        }
        for(int i =0;i<b.length;i++){
            b[i]=Math.sqrt(a[i]);
            System.out.println("B[" + i + "] = " + b[i]);

        }

    }
}
