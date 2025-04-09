import java.util.Scanner;

public class Aula_Vetor_Media {



    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        int n;

        do {

            System.out.println("Quantos alunos nessa turma? (maximo 40): =");

            n = le.nextInt();



        } while (n < 0 || n > 40);

        int rm[] = new int[n];

        double nota1[] = new double[n];

        double nota2[] = new double[n];



        for(int i=0; i<n; i++) {

            System.out.println("RM: ");

            rm[i] = le.nextInt();

            System.out.println("nota1: ");

            nota1[i] = le.nextDouble();

            System.out.print("nota2: ");

            nota2[i] = le.nextDouble();

            System.out.println();



        }

        double media[] = new double[n];

        for(int i=0; i<n; i++) {

            media [i] = (nota1[i] + nota2[i])/2;

            System.out.println("RM: "+ rm[i]+"\t media: "+ media[i]);



        }

        int aprovados[] = new int[n];

        int nAp = 0;

        for(int i=0; i<n; i++) {

            if(media[i]>6) {

                aprovados[nAp] = rm[i];

                nAp++;

            }

        }

        System.out.println("\n *** Lista de Alunos Aprovados ***");

        for (int i=0; i<nAp; i++) {

            System.out.println(aprovados[i]);

        }

        le.close();

    }

}