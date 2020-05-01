package Arrays;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] a = new int[10];
        int [] b = new int[10];
        double [] c = new double[10];

        System.out.println("Digite os valores de A");
        for(int i = 0 ; i<a.length;i++){
            a[i]=scan.nextInt();
            System.out.println("A["+i+"] = "+a[i]);
        }
        System.out.println("Digite os valores de B");
        for(int i =0;i<b.length;i++){
            b[i]=scan.nextInt();
            System.out.println("B["+i+"] = "+b[i]);
        }
        for (int i = 0 ;i<c.length;i++){

            System.out.println("C["+i+"] = "+c[i]);
        }
    }
}
