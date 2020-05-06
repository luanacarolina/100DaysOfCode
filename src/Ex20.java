import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double [] a = new double[20];


        System.out.println("Digite a cotação do dolar");
        double cotacaoDolar = scan.nextDouble();
        for(int i =0;i<a.length;i++){

            a[i]=cotacaoDolar*(i+1);
            System.out.println("A["+i+"] = "+a[i]);

        }


    }
}
