package Arrays;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double[] nota1=new double[10];
        double[] nota2 = new double[10];
        double [] result=new double[10];

        int contador=0;
        int soma=0;

        for (int i=0;i<nota1.length;i++){
            System.out.println("Digite a nota 1 do aluno "+(i+1));
            nota1[i]=scan.nextDouble();
            System.out.println("Digite a nota 2 do aluno "+(i+1));
            nota2[i]=scan.nextDouble();
            result[i]=(nota1[i]+nota2[i])/2;


        }

        System.out.print("Notas 1 ");
        for (int i = 0;i<nota1.length;i++){
            System.out.print(nota1[i]+" ");
        }
        System.out.println();
        System.out.print("Notas 2 ");
        for (int i =0;i<nota2.length;i++){
            System.out.print(nota1[i]+" ");
        }
        System.out.println();
        System.out.println("Result");
        for (int i =0;i<result.length;i++){
            if(result[i]>=7){
                System.out.println(result[i]+" -  APROVADO");
            }else {
                System.out.println(result[i]+" -  REPROVADO");
            }
        }
    }
}
