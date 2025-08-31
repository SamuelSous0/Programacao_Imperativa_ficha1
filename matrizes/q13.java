import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        //Construa um algoritmo para gerenciar a venda de ingressos (ocupação)
        //das poltronas numeradas de um teatro, que tem 200 lugares, organizados
        //em 10 fileiras com 10 cadeiras cada fila. Inicialize a matriz com todas as
        //posições valendo -1 indicando que elas estão vazias. Para cada nova venda
        //de ingresso, deve se solicitar ao usuário o número da fila e o número da
        //poltrona. Se a poltrona estiver “vazia”, deve-se alterar seu conteúdo para o
        //valor 1, indicando que o ingresso foi vendido. Se não estiver vazia, deve-se
        //emitir uma mensagem: “Poltrona já foi vendida”.

        int[][] poltronas = new int[10][10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[i].length; j++) {
                poltronas[i][j] = -1;
            }
        }

        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[i].length; j++) {
                System.out.print(poltronas[i][j]+"\t");
            }
            System.out.println();
        }

        int q ;
        int total_ingressos = 100;

        do {
        System.out.println("QUANTIDADE DE INGRESSOS: ");
            q = sc.nextInt();

            while (q < 0 || q > total_ingressos) {
            System.out.println("QUANTIDADE DE INGRESSOS INVALIDO! DIGITE NOVAMENTE");
            q = sc.nextInt();
            }

            for (int i = 0; i < q; i++) {
                System.out.println("Fileira:");
               int x = sc.nextInt();
                System.out.println("Cadeira");
               int y = sc.nextInt();

               if (poltronas[x][y] == 1) {
                   while (poltronas[x][y] != -1) {
                       System.out.println("Poltrona já foi vendida");
                       System.out.println("Fileira:");
                       x = sc.nextInt();
                       System.out.println("Cadeira");
                       y = sc.nextInt();
                   }
                   poltronas[x][y] = 1;
                   System.out.println("POLTRONA["+x+"]["+y+"] COMPRADA!");
                   total_ingressos -= 1;
               } else {
                   poltronas[x][y] = 1;
                   System.out.println("POLTRONA["+x+"]["+y+"] COMPRADA!");
                   total_ingressos -= 1;
               }
            }
            for (int i = 0; i < poltronas.length; i++) {
                for (int j = 0; j < poltronas[i].length; j++) {
                    System.out.print(poltronas[i][j]+"\t");
                }
                System.out.println();
            }
        } while (total_ingressos > 0);
        System.out.println("TODOS OS INGRESSOS FORAM COMRRADOS");
        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[i].length; j++) {
                System.out.print(poltronas[i][j]+"\t");
            }
            System.out.println();
        }
    }
}