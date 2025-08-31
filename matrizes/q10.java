public class q10 {
    public static void main(String[] args) {
        //Faça sum programa que permita ao usuário entrar com uma matriz de 3 x 3
        //números inteiros. Em seguida, gere um vetor pela soma dos números de
        //cada coluna da matriz e mostre na tela esse vetor. Por exemplo, a matriz:

        //Vai gerar um vetor, onde cada posição é a soma das colunas da matriz. A
        //primeira posição será 5 + 1 + 25, e assim por diante:

        int[][] m = new int[3][3];


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 20);
            }
        }
        System.out.println("  |----- MATRIZES -----|");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" \t"+m[i][j]+"\t ");
            }
            System.out.println();
        }

//            SOMENTE A MATRIZ TROCANDO AS LINHAS PELA COLUNA

//        System.out.println("  |----- MATRIZES 2.0 -----|");
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(" \t"+m[j][i]+"\t ");
//            }
//            System.out.println();
//        }


        System.out.println("  |----- TESTE -----|");
        for (int i = 0; i < m.length; i++) {
            int[] v = new int[3];
            int soma = 0;
            System.out.print("\nVETOR "+(i+1)+": \n");
            for (int j = 0; j < m[i].length; j++) {
                v[i] = m[j][i];
                soma += m[j][i];
                if (j == m[i].length-1) {
                    System.out.print(v[i]+" = ");
                } else {
                    System.out.print(v[i]+" + ");
                }
            }

            System.out.print(soma);
        }

    }
}
