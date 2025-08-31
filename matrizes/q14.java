import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
//        O professor de uma faculdade finalizou precisa computar as faltas dos
//        seus alunos durante o semestre. Como ele dá aula em várias turmas, ele
//        criou um programa para facilitar essa atividade. O programa recebe a
//        quantidade de alunos de uma turma, o nome de todos os alunos e todas
//        as faltas e presenças ao longo do semestre (composto por 30 dias de aula).
//                Com isso, ele consegue computar os alunos que irão reprovar por falta,
//                caso o número de faltas seja superior a 10.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int q = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[q];
        String[][] matriz = new String[q][30];

        for (int i = 0; i < q; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.println("Digite P para presença e F para falta (30 dias):");
            for (int j = 0; j < 30; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                matriz[i][j] = sc.nextLine();
            }
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        for (int i = 0; i < q; i++) {
            int contador_faltas = 0;
            System.out.print(nomes[i] + " -  dias - ");

            for (int j = 0; j < 30; j++) {
                if (matriz[i][j].equalsIgnoreCase("F")) {
                    System.out.print((j + 1) + " ");
                    contador_faltas++;
                }
            }

            if (contador_faltas > 10) {
                System.out.print("- REPROVADO");
            }
            System.out.println();
        }
    }
}
