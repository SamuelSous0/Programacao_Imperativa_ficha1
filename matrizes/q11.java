import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
//        .Faça um programa que leia uma matriz de 5 linhas e 4 colunas contendo as
//        seguintes informações sobre alunos de uma disciplina, sendo todas as
//        informações do tipo inteiro:
//        a. Primeira coluna: número de matrícula (use um inteiro)
//        b. Segunda coluna: media das provas
//        c. Terceira coluna: média dos trabalhos
//        d. Quarta coluna: nota final
//        Elabore um programa que:
//        - Leia do teclado as três primeiras informações de cada aluno
//        - Calcule a nota final como sendo a soma da média das provas e da
//        média dos trabalhos
//                - Imprima a matrícula do aluno que obteve a maior nota final (assuma
//        que só existe uma maior nota)
//        - Imprima a média aritmética das notas finais

        int[][] m = new int[5][4];
        Scanner sc = new Scanner(System.in);
        int maiornota = 0;


        for (int i = 0; i < m.length; i++) {
            int media = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (j == m[i].length - 1) {
                    m[i][j] = media ;
                    if (m[i][j] > maiornota) {
                        maiornota = m[i][j];
                    }
                } else {
                    m[i][j] = sc.nextInt();
                    if (j != 0) {
                        media += m[i][j];
                    }
                }
            }
        }

        System.out.println("MATRICULA\t MEDIA PROVA\t MEDIA TRABALHO\t NOTA FINAL\t ");

        int notamaior = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
                if (maiornota == m[i][j]) {
                    notamaior = m[i][0];
                }
            }
            System.out.println();
        }

        System.out.println("MATRICULA " + notamaior+" RESPONSAVEL PELA MAIOR NOTA");


    }
}