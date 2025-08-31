public class q8 {
    public static void main(String[] args) {
//        Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que
//        transforme a matriz gerada numa matriz triangular inferior, ou seja,
//                atribuindo zero a todos os elementos acima da diagonal principal. Imprima a
//        matriz original e a matriz transformada

        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = (int) (Math.random() * 21);
            }
        }

        System.out.println("|---------- ORIGINAL MATRIZ ----------|");

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
                if (j>i) {
                    matriz[i][j] = 0;
                }
            }
            System.out.println();
        }

        System.out.println("|---------- TRIANGULO INFERIOR ----------|");

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");

            }
            System.out.println();
        }


    }
}
