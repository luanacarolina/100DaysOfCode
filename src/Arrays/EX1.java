package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            b[i]=a[i];

        }
        for (int i = 0; i < a.length; i++) {

            System.out.println("A[" + i + "] = " + a[i]);


        }
        for (int i = 0;i<b.length;i++){
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}
