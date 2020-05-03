package Arrays;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a =new int[10];
        int contador=0;
        int soma=0;
       int contadorMenor=0;
        double media=0;
        for (int i =0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<15){
                soma+=a[i];
            }else if(a[i]==15){
                contador++;
            }else if(a[i]>15){
                contadorMenor++;
                media+=a[i];


            }
        }
        System.out.println("A soma dos elementos inferiores a 15 é: "+soma);
        System.out.println("A quantidade de elementos que são iguais a 15 é: "+contador);
        System.out.println("A média dos elementos que são maiores que 15 é: "+media/contadorMenor);

    }

}
