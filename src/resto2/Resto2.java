package resto2;

import java.util.Locale;
import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Digite um Numero ");
        int n = scan.nextInt();


        for(int i = 1 ;i<10000;i++){
            if(i%n==2){
                System.out.println(i);
            }
        }
    }
}
