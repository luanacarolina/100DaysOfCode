package multiplos;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os valores de A e B");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>b && a%b==0 || b>a && b%a==0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
