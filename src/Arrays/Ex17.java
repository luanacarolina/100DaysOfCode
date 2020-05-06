package Arrays;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        int contador=0;
        System.out.println("Digite as idades");
        for (int i=0;i<a.length;i++){
            a[i]=scan.nextInt();

        }
        for (int i=0;i<a.length;i++){
            if(a[i]>35){
                contador++;
            }
        }
        System.out.println(contador+" pessoas tem a idade superior a 35 anos");
    }
}
