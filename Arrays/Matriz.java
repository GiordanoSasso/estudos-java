package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("Quantas nota por aluno ? ");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        

        double notaTotal = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma.length; j++) {
                
                System.out.printf("Informe a nota %d do aluno %d: "
                , i + 1, j + 1);
                notasDaTurma[i][j] = entrada.nextDouble();
                notaTotal += notasDaTurma[i][j];
            }
        }
        
        double media = notaTotal/(qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);
        

        for(double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
        
        entrada.close();

    }
}
